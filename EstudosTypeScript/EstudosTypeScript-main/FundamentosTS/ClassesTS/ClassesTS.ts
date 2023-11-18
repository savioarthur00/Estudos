// Campos em Classes

class User_{
    name!: string
    age!: number
}

const usuario_1 = new User_()
usuario_1.name ="Sávio"

console.log(usuario_1)


//Usando Constructor 

class NewUser{
    name 
    age 

    constructor(name:string,age:number){
        this.name = name
        this.age = age
    }


}

const Usuario_Savio = new NewUser("Sávio",23)

//Get e Set 

class Coordenadas {
    x!: number
    y!: number

    set fillX(x:number){
        if(x===0){
            return 
        }
        this.x = x
        console.log("X inserido com sucesso")
    } 

    set fillY(y:number){
        if(y===0){
            return 
        }
        this.y = y
        console.log("Y inserido com sucesso")
    }

    get getCoordenadas(){
        return `X: ${this.x} Y: ${this.y}`
    }

}

const minhasCoordenadas = new Coordenadas()

minhasCoordenadas.fillX=10
minhasCoordenadas.fillY=20

console.log(minhasCoordenadas)


// Interface 

interface showTitle{
    itemTitle():string
}

class BlogPost implements showTitle{
    title 

    constructor(title:string){
        this.title = title
    }
    itemTitle(): string {
        return `Esse é meu titulo ${this.title}`
    }

    
}

//Class Expression 
const myClass = class<T>{
    name
    constructor (name:T){
        this.name=name;
    }
};

//classe abstrata 
//Serve como molde de outra tela, parecida como interface
