def exo1v1(pfArray, pfNumber):
    for i in range(len(pfArray)):
        for j in range(len(pfArray)):
            if pfArray[i] + pfArray[j] == pfNumber:
                return str(pfArray[i]) + "+" + str(pfArray[j]) + "=" + str(pfNumber)
    return "Pas de solution"

def exo1v2(pfArray, pfNumber):
    for i in range(len(pfArray)):
        for j in range(len(pfArray)):
            if pfArray[i] + pfArray[j] == pfNumber and i != j:
                return str(pfArray[i]) + "+" + str(pfArray[j]) + "=" + str(pfNumber)
    return "Pas de solution"


array = [10, 15, 3, 7]
k = 21;
print("exo1v1:", exo1v1(array, k))
print("exo1v2:", exo1v2(array, k))