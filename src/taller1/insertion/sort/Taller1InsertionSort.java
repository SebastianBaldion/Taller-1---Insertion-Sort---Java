
package taller1.insertion.sort;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller1InsertionSort {

    public static void main(String[] args) {
       int[] Array = {65, 145, 78 ,25, 275, 1, 67, 94, 13, 38};
        System.out.println("Datos desordenados:");
        printNumbers(Array);
        insertionSort(Array);
    }

    private static void printNumbers(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + " ");
        }
        System.out.println(" ");

    }

    public static void insertionSort(int arr[]) {

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int cont = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > cont)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = cont;

        }
        System.out.println("Datos ordenados:");
        printNumbers(arr);
    }
}