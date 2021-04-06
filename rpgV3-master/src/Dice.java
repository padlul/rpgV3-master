import java.util.Random;

public class Dice {
    int roll;
    private Random rand = new Random();

    public Dice(){
        roll();
    }

    protected int roll(){
        int roll = (int) (Math.random()*6) + 1;
        return roll;
    }


}
