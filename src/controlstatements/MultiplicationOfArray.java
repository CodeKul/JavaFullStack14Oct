package controlstatements;

public class MultiplicationOfArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int sum = 0;
        int size = arr2.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            sum = arr1[i] * (arr2[size]);
            System.out.print(" " + sum);
            size--;
        }
    }
}
