const prompt = require('prompt-sync')();

// let value = Number(prompt('Digite um valor: '));
let values = [1,2,-3,4,5,-6,7,8,-9];

for (let i = 0; i < values.length; i++) {
    let signal = (values[i] >= 0) ? `${values[i]} - signal: +`:`${values[i]} - signal: -`;
    console.log(signal);
}



