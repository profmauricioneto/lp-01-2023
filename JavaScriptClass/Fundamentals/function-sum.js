function sum(...arguments) {
    let total = 0;
    for (let index = 0; index < arguments.length; index++) {
        total += index;
    }
    return total;
}

console.log(sum(1));
console.log(sum(1,2));
console.log(sum(1,2,3));
console.log(sum(1,2,3,4));