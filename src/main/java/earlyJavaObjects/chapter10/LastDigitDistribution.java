package earlyJavaObjects.chapter10;

public class LastDigitDistribution implements Sequence {

    int[] counters = new int[10];

    public void process(Sequence sequence, int valuesToProcess) {
        for (int i = 0; i <= valuesToProcess; i++) {
            int value = sequence.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    @Override
    public int next() {
        return 0;
    }

    public void display(){
        for (int i = 0; i< counters.length; i++){
            System.out.print(i +": " + counters[i]);
            System.out.println();
        }

    }
}
