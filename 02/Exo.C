#include <stdio.h>
#include <stdlib.h>

int *exo2(int pfArray[], int nbElt)
{
    int *newArray = malloc(sizeof(nbElt));
    if (nbElt == 0)
    {
        return newArray;
    }
    else if (nbElt == 1)
    {
        return pfArray;
    }
    else
    {
        for (int i = 0; i < nbElt; i++)
        {
            newArray[i] = 1;
        }

        for (int i = 0; i < nbElt; i++)
        {
            for (int j = 0; j < nbElt; j++)
            {
                if (i != j)
                {
                    newArray[i] *= pfArray[j];
                }
            }
        }
        return newArray;
    }
}

int main(int argc, char const *argv[])
{
    int array1[5] = {1, 2, 3, 4, 5};
    int array2[3] = {3, 2, 1};
    int array3[1] = {2};
    int array4[0] = {};

    int *newArray1 = exo2(array1, 5);
    int *newArray2 = exo2(array2, 3);
    int *newArray3 = exo2(array3, 1);
    int *newArray4 = exo2(array4, 0);

    for (int i = 0; i < 5; i++)
    {
        printf("%d ", newArray1[i]);
    }
    printf("\n");
    for (int i = 0; i < 3; i++)
    {
        printf("%d ", newArray2[i]);
    }
    printf("\n");
    for (int i = 0; i < 1; i++)
    {
        printf("%d ", newArray3[i]);
    }
    printf("\n");
    for (int i = 0; i < 0; i++)
    {
        printf("%d ", newArray4[i]);
    }

    free(newArray1);
    free(newArray2);
    free(newArray3);
    free(newArray4);
    return 0;
}