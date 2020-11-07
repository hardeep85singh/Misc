package ListInterfaces;

public class StackTest {
    public static void main(String[]args){
        //Stack list = new StackArrayImpl();
        Stack list = new StackListimpl();

        list.push(1);
        list.push(2);
        list.push(3);

        System.out.println(list.isEmpty());
        list.pop();
        list.pop();

        list.pop();

        list.pop();


    }
}
