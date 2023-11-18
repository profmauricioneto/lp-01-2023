const numbers = [33,45,14,12,18,16,56,54];

function double(number) {
    return number * 2;
}

const doubles = numbers.map(double);
console.log(doubles);