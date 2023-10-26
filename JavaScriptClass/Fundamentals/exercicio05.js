function simpleCalculator(value1, value2, operation) {
    if (typeof value1 !== "number" || typeof value2 !== "number") {
        throw new Error("Some entry is not a number");
    }

    switch(operation) {
        case "+":
            return value1 + value2;
            break;
        case "-":
            return value1 - value2;
            break;
        case "*":
            return value1 * value2;
            break;
        case "/":
            if (value2 === 0) {
                throw new Error("Is not possible division by Zero!");
            } else {
                return value1 / value2;
            }
            break;
        default:
            throw new Error("Invalid Operation");
    }
}

function main() {
    try {
        const result = simpleCalculator(3, 4, "=");
        console.log(result);
    } catch (error) {
        console.error(error);
    } finally {
        console.log("End of the program");
    }
}

main();