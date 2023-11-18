//Funções callbeck como argumento 
///Espera uma função no parametro 

function greeting (name:string):string{
    return `Olá ${name}`
}

function preGreeting(f:(name: string) => string, userName:string){

    console.log("Preparando a função")

    const greet = f(userName)

    console.log(greet)
}

preGreeting(greeting,"Sávio")
preGreeting(greeting,"Arthur")

// Generic function 

function firstElement<T>(arr: T[]):T{

    return arr[0]
}

firstElement([1,2,3])
firstElement(["a","b","c"])

function mergeObjects<U,T>(obj1:U , obj2:T){
    return{
        ...obj1,
        ...obj2
    }
}

const newObject = mergeObjects({name:"Matheus"},{age:30,job:"Programer"})

console.log(newObject)

// Constraints 

function biggestNumber<T extends number | string>(a:T,b:T): T{

    let biggest:T

    if(+a > +b){
        biggest=a
    }else{
        biggest=b
    }

    return biggest

}
console.log(biggestNumber(2,3))
console.log(biggestNumber("12","5"))
 
// Especificar tipo de argumento 

function mergeArrays<T>(arr1:T[],arr2:T[]){
    return arr1.concat(arr2)
}

console.log(mergeArrays([1,2,3],[4,5,6]))
console.log(mergeArrays<number | string>([1,2,3],["Teste","Teste2","Teste3"]))

//parametros opcionais 

function mordernGreeting(name:string, greet?:string){

    if(greet){
        return `Olá ${greet} ${name}, tudo bem?` }
}
console.log(mordernGreeting("Sávio Arthur"))
console.log(mordernGreeting("Dr","Pedro"))

// parametro default - Consigo preencher o valor sem estar na função

function somaDeValores(a:number, b=10):number{
    return a+b 
}

somaDeValores(10)
somaDeValores(10,22)

// Unknown - Aceita qualquer dado,porém precisa de uma validação 

function doSomething(x:unknown){
    if(Array.isArray(x)){
        console.log(x[0])
    }else if(x==="number"){
        console.log("x é um número")
    }
}

doSomething([1,2,3])
doSomething(10)

// Never 

function showErroMessage(msg:string): never{
    throw new Error(msg)
}

//showErroMessage("Houve erro")


//Rest Operator  uso do ...

function sumAll(... n: number[]){
    return n.reduce ((number,sum)=> sum +number)
}

sumAll(1,4,5,6,2,9)

//Destructuring como parametro 

function showProductDetails({name,price}: {name:string,price:number}):string{
    return `o nome é ${name} e o valor é RS ${price} `
}

const shirt = {name:"Camisa", price: 59.99}

console.log(showProductDetails(shirt))