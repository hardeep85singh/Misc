package earlyJavaObjects.chapter10;

public class SquareSequence implements Sequence {
    private int n;

    @Override
    public int next() {
        n = n + 1;
        return n * n;
    }
}
