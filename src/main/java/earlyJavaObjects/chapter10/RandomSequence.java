package earlyJavaObjects.chapter10;

public class RandomSequence implements Sequence{

    @Override
    public int next() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
