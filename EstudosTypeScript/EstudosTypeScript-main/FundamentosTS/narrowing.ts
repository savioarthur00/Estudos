// Type Guard -  Prever dados usando typeof para tomar decisões 

function sum(a:number | string, b: number | string){

    if( typeof a==="string" && typeof b==="string"){
        console.log(parseFloat(a)+parseFloat(b))
    }
    else if(typeof a==="number" && typeof b==="number"){
        console.log(a+b)
    }
    else {
        console.log("Não aceitamos number com string")
    }
    

}

sum("10","30")
sum(1,3)
sum("3",10)

// Checando se valor existe 

function operations(arr:number[],operation?:string | undefined){
    if(operation) //Narrow
    {
        if(operation==="sum"){
                const sum = arr.reduce((i,total)=>i+total) //somando valores do array
                console.log(sum)
        }
        else if(operation === "multiply"){
            const multiply= arr.reduce((i,total)=>i*total) //somando valores do array
            console.log(multiply)
        }

    }else{
        console.log("Defina alguma operação")
    }
}

operations([1,2,3],"sum")
operations([1,2,3,4],"multiply")

//InstanceOf - Para reconhecer o tipo de classe que está trabalhando


class User{
    name

    constructor(name:string){
        this.name=name
    }
}
class SuperUser extends User{
    age

    constructor(name:string,age:number){
        super(name)
        this.age=age
    }
}

const John = new User("John");
const Paulo = new SuperUser("Paulo",23)

function userGreeting(user:object){
    if(user instanceof SuperUser){
        console.log("Super usuario")
    }
    else if(user instanceof User){
        console.log("Apenas usuario")
    }
}

userGreeting(John)
userGreeting(Paulo)

// In - checar  se existe uma propriedade no objeto

class Dog {
    name
    breed

    constructor(name:string, breed?:string){
        this.name=name
        if(breed){
            this.breed=breed
        }
    }
}


const sem_raça =new Dog("Vira lata")
const bob = new Dog("bob","pastor alemão")

function showDogDetails(dog:Dog){
    if(`breed` in dog){
        console.log(`O cachorro é da  raça: ${dog.breed}`)
    }else{
        console.log(`O cachorro é SRD`)
    }
}

showDogDetails(sem_raça)
showDogDetails(bob)


