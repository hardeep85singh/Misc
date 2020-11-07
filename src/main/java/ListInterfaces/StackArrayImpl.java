package ListInterfaces;

public class StackArrayImpl implements Stack {
    private int[] arr;
    private int length;
    private int current;

    public StackArrayImpl() {
        arr = new int[5];
        length = 5;
        current = 0;
    }


    @Override
    public void push(int value) {
        if (current == length) {
            int temp[] = new int[length * 2];
            for (int i = 0; i < length; i++) {
                temp[i] = arr[i];
            }
            length = length * 2;
            arr = temp;
        }
        arr[current] = value;
        current++;
    }

    @Override
    public void pop() {
        if(current ==0){
            throw new ArrayIndexOutOfBoundsException(
                    "No more elements to delete/pop"
            );
        }
        arr[current] = 0;
        current--;
    }

    @Override
    public boolean isEmpty() {
        if (current == 0) {
            return true;
        } else {
            return false;
        }
    }

}
