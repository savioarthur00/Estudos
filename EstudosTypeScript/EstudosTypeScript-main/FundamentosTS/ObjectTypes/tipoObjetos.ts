// Tipo de objeto para função com interface

interface Product{
    name:string
    price:number
    isAvailable: boolean
}

function showMessageDetails(product:Product){
    console.log(`O nome do produto é: ${product.name}, seu preço é:R$ ${product.price}`)
    if(product.isAvailable){
        console.log("O produto está disponivel")
    }
}

const Tshirt:Product ={
    name: "Camisa",
    price: 20,
    isAvailable: true
}
console.log(Tshirt)

// ReadOnly (Apenas leitura)

interface Car{
    brand:string,
    readonly wheels: number
}

const fusca:Car = {
    brand:"VW",
    wheels: 4
}

fusca.brand="GM"
console.log(fusca)

//Interface signature 
// Posso criar qualquer nome para uma variavel e declarar o tipo dela, no exemplo estou dando o nome x e o valor dela um number no caso 10 e y = 20

interface CoordObject{
    [index: string]:number
}

let coords: CoordObject = {
    x:10
}

coords.y = 20
console.log(coords)

//Intersection types    
//Criado para unir varios tipos de interface, usando o: & 

interface Character{
    name: string
}

interface Gun{
    type:string
    calibre: number
}

type HumanWithGun = Character & Gun

const arnold: HumanWithGun = {
    name: "Arnold",
    type: "Fuzil",
    calibre: 50

}

//ReadOnlyArray 

let myArray: ReadonlyArray<string>=["Maça","banana","goiaba"]

myArray.forEach((item)=>{

    console.log("Fruta: " +item)
})

myArray = myArray.map((item)=>{
    return `Fruta: ${item}`
})


//Tuplas 
//Arrays com dados já definidos

type fiveNumbers = [number,number,number,number,number]

const myNumberArray: fiveNumbers = [1,2,3,45,5]

type nameAndAge = [string,number]

const nomeAndIdade: nameAndAge = ["Ana",27]


//Tuplas com ReadOnly

function showNumbers(numbers: readonly [number,number]){
    console.log(numbers[0])
    console.log(numbers[1])

}