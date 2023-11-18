const prompt = require("prompt-sync")();

let person = {};
let date = new Date();
person.name = prompt("Digite o nome: ");
person.age = prompt("Digite sua idade: ");
person.address = prompt("Digite seu endereço: ");

let birthyear = date.getFullYear() - person.age;

console.log(`Hello Mr(s) ${person.name}! You have ${person.age} and your address is ${person.address}`);
console.log(`You were born in ${birthyear}`);