// Crie um objeto chamado pessoa com as seguintes propriedades: nome, idade e profissão. Em seguida, imprima no console uma mensagem no seguinte formato: "Olá, meu nome é {nome}, tenho {idade} anos e sou {profissao}."
const prompt = require('prompt-sync')();

let pessoa = {};
pessoa.nome = prompt('Digite seu nome: ');
pessoa.idade = Number(prompt('Digie sua idade: '));
pessoa.profissao = prompt('Digite sua profissão: ');

console.log(`Olá, meu nome é ${pessoa.nome}, tenho ${pessoa.idade} anos e sou ${pessoa.profissao}.`);