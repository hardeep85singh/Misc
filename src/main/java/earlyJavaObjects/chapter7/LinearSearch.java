package earlyJavaObjects.chapter7;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        linearSearch(arr, 5);
    }

    public static int linearSearch(int[] arr, int searchValue) {

        int position = 0;
        boolean found = false;

        while (position < arr.length && !found) {
            if (arr[position] == searchValue) {
                found = true;
            } else {
                position++;
            }
        }

        if (found) {
            System.out.println("Found at position: " + position);
        } else {
            System.out.println("Not found");
        }
        return position;
    }

}
