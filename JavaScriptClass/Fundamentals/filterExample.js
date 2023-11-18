const idades = [33,45,14,12,18,16,56,54];

function isAdult(idade) {
    return idade >= 18;
}

const adultos = idades.filter(isAdult);
console.log(adultos);
console.log(idades);