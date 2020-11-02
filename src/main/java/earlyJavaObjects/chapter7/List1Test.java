package earlyJavaObjects.chapter7;

public class List1Test {
   public static void main(String[]args){
//       List1 list = new List1Impl();
       List1 list = new List1ArrayImpl();

       list.add(2);
       list.add(3);
       list.add(5);
       list.printList();
       System.out.println(list.size());
       list.delete(1);
       list.printList();
       System.out.println(list.size());
//       list.delete(9);

   }
}
