var valorString = "123";

var valorNumerico = parseInt(valorString, 10);
console.log(typeof valorNumerico);
console.log(valorNumerico);

var valorFloat = parseFloat(valorString);
console.log(typeof valorFloat);
console.log(valorFloat.toFixed(2));

let exemplo = parseInt("2", 10);
if (isNaN(exemplo)) {
    console.log("Erro na minha conversão");
} else {
    console.log(exemplo);
}