package earlyJavaObjects.chapter7;

public class List1ArrayImpl implements List1{
    private int arr[];
    private int length;
    private int current;

    public List1ArrayImpl(){
        arr = new int[1];
        length = 1;
        current = 0;
    }


    @Override
    public void add(int data) {
        // check for length of array elements
        if(current == length){
            // make new array of length * 2
            int temp [] = new int[2 * length];
            // copy old array elements in temp
            for (int i = 0; i < length; i++){
                temp[i] = arr[i];
            }
            length = length * 2;
            arr = temp;
        }
        // insert data
        arr[current] = data;
        current++;
    }

    @Override
    public void delete(int index) {
        // check for index out of bound
        if (index < 0 || index > length){
            throw new ArrayIndexOutOfBoundsException(
                    "Index cannot be less than or more than array length"
            );
        }
        // shift elements
        for (int i = index +1; i< current; i++){
            arr[i -1] = arr [i];
        }
        current --;
    }

    @Override
    public int size() {
        return current;
    }

    @Override
    public void printList() {
        for (int i = 0; i< current; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
