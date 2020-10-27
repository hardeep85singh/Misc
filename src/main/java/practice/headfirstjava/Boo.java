package practice.headfirstjava;

public class Boo {
   Integer i;
   int j;

   public static void main(String[]args){
       Boo boo = new Boo();
       boo.go();

   }

   public void go(){
       i=j;
       System.out.println(j);
       System.out.println(i);
   }
}
