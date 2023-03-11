public class Exo {
    public static void main(String[] args) {
        int[] array = { 10, 15, 3, 7 };
        int k = 17;
        System.out.println("exo1v1: " + exo1v1(array, k));
        System.out.println("exo1v2: " + exo1v2(array, k));
    }

    /**
     * Exercice 1 : Trouver deux nombres dans un tableau qui font la somme d'un
     * nombre donné
     * Version 1 : On peut prendre deux fois le même nombre
     * 
     * @param pfArray  : tableau d'entiers
     * @param pfNumber : nombre à trouver
     * @return : chaîne de caractères contenant les deux nombres et le résultat (ou
     *         "Pas de solution")
     */
    public static String exo1v1(int[] pfArray, int pfNumber) {
        for (int i = 0; i < pfArray.length; i++) {
            for (int j = 0; j < pfArray.length; j++) {
                if (pfArray[i] + pfArray[j] == pfNumber)
                    return pfArray[i] + " + " + pfArray[j] + " = " + pfNumber;
            }
        }
        return "Pas de solution";
    }

    /**
     * Exercice 1 : Trouver deux nombres dans un tableau qui font la somme d'un
     * nombre donné
     * Version 2 : On ne peut pas prendre deux fois le même nombre
     * 
     * @param pfArray  : tableau d'entiers
     * @param pfNumber : nombre à trouver
     * @return : chaîne de caractères contenant les deux nombres et le résultat (ou
     *         "Pas de solution")
     */
    public static String exo1v2(int[] pfArray, int pfNumber) {
        for (int i = 0; i < pfArray.length; i++) {
            for (int j = 0; j < pfArray.length; j++) {
                if (pfArray[i] + pfArray[j] == pfNumber && i != j)
                    return pfArray[i] + " + " + pfArray[j] + " = " + pfNumber;
            }
        }
        return "Pas de solution";
    }
}
