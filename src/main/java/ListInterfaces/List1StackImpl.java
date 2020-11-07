package ListInterfaces;

import java.util.Stack;

public class List1StackImpl implements List1 {

    private Stack<Integer> stack = new Stack();
    private int count = 0;


    @Override
    public void add(int data) {
       stack.push(data);
       count++;
    }

    @Override
    public void delete(int index) {
        if(index < 0){throw new IndexOutOfBoundsException("Stack is empty.");}

        Stack<Integer> tempStack = new Stack();
        int temp = 0;

        while(index != count-1){
            temp = stack.pop();
            tempStack.push(temp);
            count --;
            if(index == count -1){
                stack.pop();
            }
        }

        while (!tempStack.empty()){
            temp = tempStack.pop();
            stack.push(temp);
        }

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void printList() {
        for (int i = 0; i< stack.size();i++){
            System.out.print(stack.elementAt(i) + ",");
        }
        System.out.println();
    }
}
