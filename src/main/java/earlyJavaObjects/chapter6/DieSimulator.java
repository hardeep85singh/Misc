package earlyJavaObjects.chapter6;

public class DieSimulator {
    public static void main(String []args){
        Die d = new Die(6);
        int tries = 10;

        for (int i = 0; i< tries; i++){
            int n = d.cast();
            System.out.print( n + " ");
        }
        System.out.println();
    }
}
