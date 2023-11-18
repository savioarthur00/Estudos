"use strict";
//Desafio 2
function conversaoNumberParaString(num) {
    const conversao = num.toString();
    console.log("O valor inserido foi:" + conversao);
    console.log(typeof conversao);
}
conversaoNumberParaString(3);
//Array
let List_numeros = [1, 2, 3];
List_numeros.push(4);
console.log(List_numeros);
console.log(List_numeros[2]);
const Array_numeros = [0, 1, 2, 3];
Array_numeros.push(200);
console.log(Array_numeros);
//Any 
const array_any = [1, "teste", true, [], { nome: "Sávio" }];
console.log(array_any);
//retorno de função 
function greeting(name) {
    return name;
}
//Função anonima 
setTimeout(function () {
    const sallary = 1000;
    console.log(sallary);
}, 2000);
//Tipos de objeto 
function passCordinates(coord) {
    console.log("Coordenada X: " + coord.x);
    console.log("Coordenada Y:" + coord.y);
}
const objCoord = { x: 3849, y: 9392.2 };
const pessoaObj = { nome: "Sávio", surname: "Arthur" };
// propriedades opcionais, só colocar: ?
const pessoaObj2 = { nome: "Sávio", surname: "Arthur" };
//Validando parametro opcional 
function formaCorreta(name, sobrenome) {
    if (sobrenome !== undefined) {
        return console.log("Testando aplicação.." + name + "" + sobrenome + "Testado");
    }
    return console.log("Testando aplicação.." + name);
}
console.log(formaCorreta("Sávio", "Arthur"));
// Union type melhor que o Any
function receberNouS(balance) {
    console.log('O saldo da minha conta é R$ ${balance}');
}
receberNouS(121);
// avançando em Union types 
function ShowUserRole(role) {
    if (typeof role === "boolean") {
        return "Usuário não aprovado!";
    }
    return `a função do usuário é: ${role}`;
}
console.log(ShowUserRole(false));
console.log(ShowUserRole("ADM"));
function showId(id) {
    console.log(`o id é:  ${id}`);
}
showId(10);
showId("100");
function showCoords(obj) {
    console.log(`X: ${obj.x}`);
    console.log(`Y: ${obj.y}`);
    console.log(`Z: ${obj.z}`);
}
const CoordInt = {
    x: 0,
    y: 0,
    z: 0
};
showCoords(CoordInt);
const somePerson = {
    name: "Sávio",
    age: 20
};
console.log(somePerson);
//Literal type (Só aceita valores definidos)
function showDirection(direction) {
    console.log(`A direção escolhida foi: ${direction}`);
}
showDirection("left");
//showDirection("down")  não aceita, pois não há down
//Non-null Assertion Operator, basta usar o !
const p = document.getElementById("some-p");
console.log(p?.innerText);
// Big int
let n;
n = 1000n;
console.log(n);
//Symbol -- é possivel ter valores escritos iguais porém interpretados diferentes
let SymbolA = Symbol("A");
let SymbolB = Symbol("A");
console.log(SymbolA == SymbolB);
console.log(SymbolA === SymbolB);
