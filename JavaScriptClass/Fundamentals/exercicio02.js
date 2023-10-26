// Faça um programa que receba um valor ou um conjunto de
// valores e verifique se cada número é par ou ímpar. O
// programa deve exibir:
// - 3 is odd
// - 4 is even
// Pode ser feito com entrada de dados pelo prompt-sync ou com um vetor estático inicial.

const prompt = require('prompt-sync')();

// let value = Number(prompt('Digite um número: '));
let values = [1,2,3,4,5,6,7,8,9,10];

for (let i = 0; i <= values.length; i++) {
    if (i % 2 == 0) {
        console.log(`${i} é par`);
    } else {
        console.log(`${i} é ímpar`);
    }
}


