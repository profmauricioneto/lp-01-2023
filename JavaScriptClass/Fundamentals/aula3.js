const prompt = require('prompt-sync')();

let name = prompt("Digite seu nome: ");
console.log(typeof name);
console.log(`Olá Sr(a) ${name}! Seja Bem Vindo!`);

let a = 15;
let b = 40;
console.log(`A soma de 
${a} + ${b} 
= ${a+b}`);