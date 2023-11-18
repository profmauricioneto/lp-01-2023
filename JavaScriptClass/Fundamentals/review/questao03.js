function showEvens(start, end) {
    for (let i = start; i <= end; i++) {
        if (i % 2 == 0) {
            console.log("Valor par: " + i);
        }
    }
}

showEvens(10, 100);