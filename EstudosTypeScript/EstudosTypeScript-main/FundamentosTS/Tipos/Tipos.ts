// Generics 

function showData<T>(agrs:T):string{
    return `o dado é: ${agrs}`
}

console.log(showData(3))
console.log(showData("Testando"))
console.log(showData(true))

// Constraint em Generic
//Pegando a constante name de qualquer tipo de objeto
function showProductName<T extends {name:string}>(obj:T){
    return `O nome do objeto é: ${obj.name}`
}

const myObj = {name:"porta",cor:"Azul"}
const OutherObj = {name:"Carro", wheels: 4}
console.log(showProductName(myObj)) 
console.log(showProductName(OutherObj))


//Generics com Interface 

interface MyObject<T,U>{
    name:string 
    wheels:T
    engine: U
}

type Car2 = MyObject<number,number>
type Pen = MyObject<boolean,boolean>

const myCar2: Car2 = {name:"Chevette", wheels: 4, engine: 20}



//Type Parameters
//Chave dentro do parametro do objeto

function getSomeKey<T, K extends keyof T>(obj:T , key: K): string{

  return `a chave, esstá no objeto  e tem valor ${obj[key]}`

}

const server={
    hd: "390gb",
    ram: "23gb"
}

console.log(getSomeKey(server,"ram"))
//console.log(getSomeKey(server,"Test"))

//Keyof type operator
//Linkar uma das chaves de um tipo, no exemplo o console logo exibira Sávio 
//pois foi passado a chave name, já no segundo responde com 23

type Character2 = {name:string, age:number, hasDrivingLicense: boolean}

type C = keyof Character2

function showCharName(obj:Character2, key:C):string{
    return `${obj.name}`
}




const myChar: Character2={
    name: "Sávio",
    age: 23,
    hasDrivingLicense: false
}

console.log(showCharName(myChar,'name'))
console.log(showCharName(myChar,'age'))

// TypeOf 

const nameUser: string = "Sávio"

const newNameUser: typeof nameUser = "29"

type x = typeof nameUser 

const nameUser2 : x  = "Manuel"

// Indexed acess type 
//Pegando só um dado 

type Truck = {km:number,kg:number,description:string}

type KM =Truck['km']

const newTruck : Truck ={
    km: 0,
    kg: 0,
    description: ""
}

const newCar ={
    km:9009,
    peso:999

}


function showkm(km:KM){
    console.log(`o peso é ${km}`)
}

showkm(newCar.km)
console.log(showkm(newTruck.km))


//condicional types

 interface A {}

 interface B extends A{}

 interface Teste {
    showName():string 
 }

 type myType = B extends A ? number :string

 const someVar: myType = 5

 type myTypeB = Teste extends {showNumber():number }? string : boolean 

 //Template literals type

 type testA = "Texto"

 type CustomType = `some ${testA}`

 const testing: CustomType ="some Texto"

 type a1 = "Testando"
 type a2 = "Union"

type a3 = `${a1}` | `${a2}`

