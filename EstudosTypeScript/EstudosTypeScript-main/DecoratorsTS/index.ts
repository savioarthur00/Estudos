//Testando Decorators

function myDecorator(){
    console.log("Iniciadando")
    return function (target: any,proprertkey: string ,descriptors: PropertyDescriptor){
        console.log(target)
        console.log(proprertkey)
        console.log(descriptors)
    }
}


class myClass{
    @myDecorator()
    testing(){
        console.log("Terminando a execução")
    }
}

const myObj = new myClass()

myObj.testing()

// Multiplos Decorators

function a(){

    return function (target: any,proprertkey: string ,descriptors: PropertyDescriptor){
        console.log("Retornando a.");
    }

}
function b(){

    return function (target: any,proprertkey: string ,descriptors: PropertyDescriptor){
        console.log("Retornando b.");
    }

}

//Esxecuta primeiro oq está mais proximo da função,no caso b primeiro
class MultipleDecorators {
    
    @a()
    @b()
    testing(){
        console.log("Terminando a execução");
    }

}

const multiple = new MultipleDecorators();
multiple.testing();


//Classe decorators 

function classDecoration(constructor:Function) {
    console.log(constructor.name)

    if(constructor.name==="User"){
        console.log("Criando usuario...")
    }
}

@classDecoration
class User{
    name:string

    constructor(name:string){
        this.name=name
    }
}

const Savio = new User("Sávio")

// Methods Decoration 

function enumerable (value:boolean){
    return function(target: any,proprertkey: string ,descriptors: PropertyDescriptor){
        descriptors.enumerable = value;
    }
}

class Machine{
    name:string

    constructor(name:string){
        this.name=name
    }

    @enumerable(true)
    showname(){
        console.log(this)
        return `o nome da maquina é: ${this.name}`
    }
}


const trator = new Machine("Trator");
console.log(trator.showname()); 

//Acesso ao Decorator (Get e set)

class Monster {
    name?
    age?

    constructor(name:string,age:number){
        this.name=name
        this.age=age
    }

    @enumerable(true)
    get showName(){
        return `O nome do monstro é: ${this.name}`
    }
    get showAge(){
        return `Idade do monstro é: ${this.age}`
    }
}

const pikachu = new Monster("Pikachu",20)

console.log(pikachu)

// Property Decorator 

function formatNumber(){
    return function(target: Object,proprertkey: string ){

        let value: string

        const getter = function(){
            return value
        }

        const setter = function(newVal:string ){
            value = newVal.padStart(5,"0")
        }

        Object.defineProperty(target,proprertkey,{
            set: setter,
            get: getter
        })
    }
}



class ID{
    @formatNumber()
    id

    constructor(id:string){ 
        this.id=id
    }
}

const newItem = new ID("1")

console.log(newItem)
console.log(newItem.id)


// Exemplo real com class Decorator - data de criação 
function createdDate(created: Function){
    created.prototype.createdAt = new Date()
}

@createdDate
class Book{
    id
    createdAt?: Date
    constructor(id:number){ 
        this.id=id
    }
}
@createdDate
class Pen{    
    id
    constructor(id:number){ 
        this.id=id
    }
}

const newBook = new Book(4)
const newPen = new Pen(3)

console.log(newBook)
console.log(newBook.createdAt)
console.log(newPen)

// Exemplo Real de Method Decorated  / restringir a 1 post por usuario
 function checkIfUserPosted(){
    return function( target: object,key: string | Symbol ,descriptors: PropertyDescriptor){
        const childFunction  = descriptors.value;
        //console.log(childFunction)
        descriptors.value = function(...args: any[]){
            if(args[1]===true){
                console.log("Usúario Já postou")
                return null
            }else{
                return childFunction.apply(this,args)
            }
        }
        return descriptors
    }
   
 }


class Post{
    alreadyPosted = false
    
    @checkIfUserPosted()
    post(content: string, alreadyPosted:boolean){
        this.alreadyPosted = true
        console.log(`Post do Usuario: ${content}` )
    }
}

const newPost = new Post();

newPost.post("Meu primeiro post!",newPost.alreadyPosted);
newPost.post("Meu segundo post!",newPost.alreadyPosted);

// Exemplo real property decorator  / Limitar número de caracters
 
function Max (limit:number){

    return function(target:Object,proprertykey:string){

        let value : string

        const getter = function(){
            return value 
        }

        const setter = function(newVal: string){
            if(newVal.length > limit){
                console.log(`O valor deve respeitar o limite de caracters que são: ${limit}`)
                return
            }
            else{
                value=newVal
            }
        }
        Object.defineProperty(target,proprertykey,{
            get:getter,
            set:setter
        })
    }

}



class Admin{

    @Max(10)
    userName 

    constructor(userName: string){
        this.userName = userName
    }

}

const newAdmin = new Admin("AdministradorFulano")
const newAdmin2 = new Admin("Admin")

