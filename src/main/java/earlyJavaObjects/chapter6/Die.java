package earlyJavaObjects.chapter6;

import java.util.Random;

public class Die {
    private Random generator;
    private int sides;

    public Die(int sides){
        this.sides = sides;
        generator = new Random();
    }
    public int cast(){
        return 1+ generator.nextInt(sides);
    }
}
