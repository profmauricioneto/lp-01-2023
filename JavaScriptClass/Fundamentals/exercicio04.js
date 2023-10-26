let values = [1,2,3,4,5,6,7,7,8,9,10];

function isEvenOrIsOdd(arrayValues) {
    // let cont = 0;
    // do {
    //     if(arrayValues[cont] % 2 == 0) {
    //         console.log(`${arrayValues[cont]} is even`);
    //     } else {
    //         console.log(`${arrayValues[cont]} is odd`);
    //     }
    //     cont++;
    // } while(cont < arrayValues.length);

    for(let i = 0; i < arrayValues.length; i++) {
        if(arrayValues[i] % 2 == 0) {
            console.log(`${arrayValues[i]} is even`);
        } else {
            console.log(`${arrayValues[i]} is odd`);
        }    
    }

};

isEvenOrIsOdd(values);