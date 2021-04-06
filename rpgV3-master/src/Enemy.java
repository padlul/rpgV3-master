public class Enemy extends Dice{
    private int hp;
    private int atk;
    private String name;
    Dice dice;

    public Enemy(String nama, int hp, int atk){
        this.name = nama;
        this.hp = hp;
        this.atk = atk;
    }

    protected int attackChance(){
        int value;
        value = dice.roll();
        return value;
    }

    protected void attack(Player player){
        int atkValue = atk;
    }

    protected void printEnemy(){

    }

}
