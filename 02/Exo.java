public class Exo {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1};
        int[] array3 = {2};
        int[] array4 = {};

        int[] newArray1 = exo2(array1);
        int[] newArray2 = exo2(array2);
        int[] newArray3 = exo2(array3);
        int[] newArray4 = exo2(array4);

        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray3.length; i++) {
            System.out.print(newArray3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newArray4.length; i++) {
            System.out.print(newArray4[i] + " ");
        }
    }
    
    public static int[] exo2(int[] pfArray) {
        int[] newArray = new int[pfArray.length];
        if (pfArray.length == 0) {
            return newArray;
        }
        else if (pfArray.length == 1) {
            return pfArray;
        }
        else {
            for (int i = 0; i < pfArray.length; i++) {
                newArray[i] = 1;
            }
    
            for (int i = 0; i < pfArray.length; i++) {
                for (int j = 0; j < pfArray.length; j++) {
                    if (i != j) {
                        newArray[i] *= pfArray[j];
                    }
                }
            }
    
            return newArray;   
        }
    }
}