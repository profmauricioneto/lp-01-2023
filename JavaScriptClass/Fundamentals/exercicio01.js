const prompt = require('prompt-sync')();

let firstname = prompt('First Name: ');
let lastname = prompt('Last Name: ');

let fullname = firstname.concat(' ', lastname);
console.log('Hello Mr(a) '.concat(fullname.toUpperCase(), '!'));