package earlyJavaObjects.chapter2;

public class Random {
    private double randNum;

    public Random(double randNum){
        this.randNum = randNum;
    };

    public int getRandNum() {
        return (int) ((Math.random() * randNum)+1);
    }

    public void setRandNum(double randNum){
        this.randNum = randNum;
    }

    @Override
    public String toString() {
        return "Random{" +
                "randNum=" + getRandNum() +
                '}';
    }
}
