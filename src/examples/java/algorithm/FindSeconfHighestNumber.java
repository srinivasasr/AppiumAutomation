package examples.java.algorithm;

public class FindSeconfHighestNumber {
    public static void main(String[] args) {

        int[] arr = {101, 3, 5, 2, 90, 45, 70};
        int first, second;
        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];

            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println(first);

    }
}
