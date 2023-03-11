function exo1v1(pfArray, pfNumber) {
    for (let i = 0; i < pfArray.length; i++) {
        for (let j = 0; j < pfArray.length; j++) {
            if (pfArray[i] + pfArray[j] == pfNumber) {
                return pfArray[i] + " + " + pfArray[j] + " = " + pfNumber;
            }
        }
    }
    return "Pas de solution";
}

function exo1v2(pfArray, pfNumber) {
    for (let i = 0; i < pfArray.length; i++) {
        for (let j = 0; j < pfArray.length; j++) {
            if (pfArray[i] + pfArray[j] == pfNumber && i != j) {
                return pfArray[i] + " + " + pfArray[j] + " = " + pfNumber;
            }
        }
    }
    return "Pas de solution";
}

const array = [10, 15, 3, 7];
const number = 20;
console.log(exo1v1(array, number));
console.log(exo1v2(array, number));