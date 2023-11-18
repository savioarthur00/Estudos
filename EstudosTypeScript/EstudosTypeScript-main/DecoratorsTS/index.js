"use strict";
//Testando Decorators
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
function myDecorator() {
    console.log("Iniciadando");
    return function (target, proprertkey, descriptors) {
        console.log(target);
        console.log(proprertkey);
        console.log(descriptors);
    };
}
class myClass {
    testing() {
        console.log("Terminando a execução");
    }
}
__decorate([
    myDecorator()
], myClass.prototype, "testing", null);
const myObj = new myClass();
myObj.testing();
// Multiplos Decorators
function a() {
    return function (target, proprertkey, descriptors) {
        console.log("Retornando a.");
    };
}
function b() {
    return function (target, proprertkey, descriptors) {
        console.log("Retornando b.");
    };
}
//Esxecuta primeiro oq está mais proximo da função,no caso b primeiro
class MultipleDecorators {
    testing() {
        console.log("Terminando a execução");
    }
}
__decorate([
    a(),
    b()
], MultipleDecorators.prototype, "testing", null);
const multiple = new MultipleDecorators();
multiple.testing();
//Classe decorators 
function classDecoration(constructor) {
    console.log(constructor.name);
    if (constructor.name === "User") {
        console.log("Criando usuario...");
    }
}
let User = class User {
    constructor(name) {
        this.name = name;
    }
};
User = __decorate([
    classDecoration
], User);
const Savio = new User("Sávio");
// Methods Decoration 
function enumerable(value) {
    return function (target, proprertkey, descriptors) {
        descriptors.enumerable = value;
    };
}
class Machine {
    constructor(name) {
        this.name = name;
    }
    showname() {
        console.log(this);
        return `o nome da maquina é: ${this.name}`;
    }
}
__decorate([
    enumerable(true)
], Machine.prototype, "showname", null);
const trator = new Machine("Trator");
console.log(trator.showname());
//Acesso ao Decorator (Get e set)
class Monster {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    get showName() {
        return `O nome do monstro é: ${this.name}`;
    }
    get showAge() {
        return `Idade do monstro é: ${this.age}`;
    }
}
__decorate([
    enumerable(true)
], Monster.prototype, "showName", null);
const pikachu = new Monster("Pikachu", 20);
console.log(pikachu);
// Property Decorator 
function formatNumber() {
    return function (target, proprertkey) {
        let value;
        const getter = function () {
            return value;
        };
        const setter = function (newVal) {
            value = newVal.padStart(5, "0");
        };
        Object.defineProperty(target, proprertkey, {
            set: setter,
            get: getter
        });
    };
}
class ID {
    constructor(id) {
        this.id = id;
    }
}
__decorate([
    formatNumber()
], ID.prototype, "id", void 0);
const newItem = new ID("1");
console.log(newItem);
console.log(newItem.id);
// Exemplo real com class Decorator - data de criação 
function createdDate(created) {
    created.prototype.createdAt = new Date();
}
let Book = class Book {
    constructor(id) {
        this.id = id;
    }
};
Book = __decorate([
    createdDate
], Book);
let Pen = class Pen {
    constructor(id) {
        this.id = id;
    }
};
Pen = __decorate([
    createdDate
], Pen);
const newBook = new Book(4);
const newPen = new Pen(3);
console.log(newBook);
console.log(newBook.createdAt);
console.log(newPen);
// Exemplo Real de Method Decorated  / restringir a 1 post por usuario
function checkIfUserPosted() {
    return function (target, key, descriptors) {
        const childFunction = descriptors.value;
        //console.log(childFunction)
        descriptors.value = function (...args) {
            if (args[1] === true) {
                console.log("Usúario Já postou");
                return null;
            }
            else {
                return childFunction.apply(this, args);
            }
        };
        return descriptors;
    };
}
class Post {
    constructor() {
        this.alreadyPosted = false;
    }
    post(content, alreadyPosted) {
        this.alreadyPosted = true;
        console.log(`Post do Usuario: ${content}`);
    }
}
__decorate([
    checkIfUserPosted()
], Post.prototype, "post", null);
const newPost = new Post();
newPost.post("Meu primeiro post!", newPost.alreadyPosted);
newPost.post("Meu segundo post!", newPost.alreadyPosted);
// Exemplo real property decorator  / Limitar número de caracters
function Max(limit) {
    return function (target, proprertykey) {
        let value;
        const getter = function () {
            return value;
        };
        const setter = function (newVal) {
            if (newVal.length > limit) {
                console.log(`O valor deve respeitar o limite de caracters que são: ${limit}`);
                return;
            }
            else {
                value = newVal;
            }
        };
        Object.defineProperty(target, proprertykey, {
            get: getter,
            set: setter
        });
    };
}
class Admin {
    constructor(userName) {
        this.userName = userName;
    }
}
__decorate([
    Max(10)
], Admin.prototype, "userName", void 0);
const newAdmin = new Admin("AdministradorFulano");
const newAdmin2 = new Admin("Admin");
