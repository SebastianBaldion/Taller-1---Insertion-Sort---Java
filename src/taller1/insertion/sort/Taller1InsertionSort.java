
package taller1.insertion.sort;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller1InsertionSort {

    public static void main(String[] args) {
       int[] input = {14, 33, 27, 35, 13, 0, 19, 1};
       InsertionSort(input);
    }
    
    private static void printNumbers(int[] input){
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        
        System.out.println("\n");
    }
    
    public static void InsertionSort(int Array[]) {
        int n = Array.length;
        for (int j = 1; j < n; j++) {
            int  key = Array[j];
            int i = j - 1;
            while ((i > -1) && (Array[i] > key)) {
                Array [i + 1] = Array[i];
                i--;
            }
            
            Array[i + 1] = key;
            printNumbers(Array);
        }
    }
}
