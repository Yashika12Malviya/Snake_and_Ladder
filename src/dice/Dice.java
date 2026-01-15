package dice;

public class Dice {
    int MIN = 1;
    int MAX = 6;

    public int diceRoll(){
        int d = (int)(Math.random() * (MAX) + MIN);
        return d;
    }
}
