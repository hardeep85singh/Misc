package earlyJavaObjects.chapter7;

public class ArrayPractice1 {
    public static void main(String[]args){
        int[] arr = new int[10];
        arr[0] = 17;
        arr[9] = 29;

        for (int i=1; i< 9; i++){
            arr[i] = -1;
        }

        for (int i = 0; i< arr.length; i++){
            arr[i] = arr[i] + 1;
        }

        System.out.println(arr);
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
