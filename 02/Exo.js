function exo2(pfArray) {
    let newArray = [];

    if (pfArray.length === 0) {
        return newArray;
    }
    else if (pfArray.length === 1) {
        return pfArray;
    }
    else {
        for (let i = 0; i < pfArray.length; i++) {
            newArray.push(1);
        }

        for (let i = 0; i < pfArray.length; i++) {
            for (let j = 0; j < pfArray.length; j++) {
                if (i !== j) {
                    newArray[i] *= pfArray[j];
                }
            }
        }
        return newArray;
    }
}

array1 = [1, 2, 3, 4, 5];
array2 = [3, 2, 1];
array3 = [2];
array4 = [];

console.log(exo2(array1));
console.log(exo2(array2));
console.log(exo2(array3));
console.log(exo2(array4));