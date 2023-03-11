#include <stdio.h>
#include <stdlib.h>

char *exo1v1(int pfArray[], int pfNbEltArray, int pfNumber)
{
    for (int i = 0; i < pfNbEltArray; i++)
    {
        for (int j = 0; j < pfNbEltArray; j++)
        {
            if (pfArray[i] + pfArray[j] == pfNumber)
            {
                char *msg;
                msg = malloc(sizeof(pfArray[i]) + sizeof(pfArray[j]) + 6);
                sprintf(msg, "%d + %d = %d", pfArray[i], pfArray[j], pfNumber);
                return msg;
            }
        }
    }
    return "Pas de solution";
}

char *exo1v2(int pfArray[], int pfNbEltArray, int pfNumber)
{
    for (int i = 0; i < pfNbEltArray; i++)
    {
        for (int j = 0; j < pfNbEltArray; j++)
        {
            if (pfArray[i] + pfArray[j] == pfNumber && i != j)
            {
                char *msg;
                msg = malloc(sizeof(pfArray[i]) + sizeof(pfArray[j]) + 6);
                sprintf(msg, "%d + %d = %d", pfArray[i], pfArray[j], pfNumber);
                return msg;
            }
        }
    }
    return "Pas de solution";
}

int main(int argc, char const *argv[])
{
    int array[] = {10, 15, 3, 7};
    int nbEltArray = 4;
    int k = 21;

    printf("exo1v1: %s \n", exo1v1(array, nbEltArray, k));
    printf("exo1v2: %s \n", exo1v2(array, nbEltArray, k));

    return 0;
}