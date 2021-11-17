package controlstatements;

public class Sum7 {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 5, 7, 8, 9};
        boolean flag = false;

        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] + arr[i + 1] + arr[i+2] == 7) {
                flag = true;
            }
        }
        System.out.println(flag);
    }

}
