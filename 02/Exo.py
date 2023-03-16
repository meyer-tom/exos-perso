def exo2(pfArray) :
    newArray = []
    if len(pfArray) == 0 :
        return newArray
    elif len(pfArray) == 1 :
        return pfArray
    else :
        for i in range(len(pfArray)) :
            newArray.append(1)
        
        for i in range(len(pfArray)) :
            for j in range(len(pfArray)) :
                if i != j :
                    newArray[i] *= pfArray[j]
        return newArray
    
array1 = [1, 2, 3, 4, 5]
array2 = [3, 2, 1]
array3 = [2]
array4 = []

newArray1 = exo2(array1)
newArray2 = exo2(array2)
newArray3 = exo2(array3)
newArray4 = exo2(array4)

for i in range(len(newArray1)) :
    print(newArray1[i], end = " ")
print()
for i in range(len(newArray2)) :
    print(newArray2[i], end = " ")
print()
for i in range(len(newArray3)) :
    print(newArray3[i], end = " ")
print()
for i in range(len(newArray4)) :
    print(newArray4[i], end = " ")