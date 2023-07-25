public class BubbleSort {
    public static <X extends Comparable<X>> X[] bubbleSort(X[] array) {
        int length = array.length;
        for (int pass = 0; pass < length - 1; pass++) {
            for (int i = 0; i < length - 1 - pass; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    X temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        // Example usage
        Integer[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
