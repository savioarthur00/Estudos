// Importação de Arquivos
import importGreet  from "./greet";

importGreet()

// Import de variaveis 

import {x} from "./variables"
console.log(x)

// Multiplas importações

import {a,b,myFunction} from "./multiples"

console.log(a)
console.log(b)
myFunction()


// Alias (as)
// uso o as para mudar o nome da variavel, deixa-la mais curta

import { someName as name } from "./changeName";

console.log(name)

//Importando tudo 
///Precisa de um nome para servir para tudo que está sendo importado

import * as myNumbers from "./numbers"

const d : number = myNumbers.n1

console.log(myNumbers)

//Importando Interface e Type

import { Human } from "./mytype";

class User implements Human {
    name: string;
    age: number;

    constructor(name:string, age:number){
        this.name=name,
        this.age=age
    }

}