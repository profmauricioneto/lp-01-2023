const valores = [1, 2, 3, 4, 5];

const resultado = valores.reduce((acc, atual) => {
    if (acc < atual) {
        acc = atual;
    }
    return acc
}, 0);

console.log(resultado);