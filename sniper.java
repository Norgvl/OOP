import java.util.ArrayList;
import java.util.Random;

public class sniper extends abClass {

    private int distance;
    private int accuracy;
    private int arrows;


    public sniper(int speed, int damage, int hp, int distance, int accuracy, int arrows, String name,int x,int y) {
        super(speed, damage,hp,name,x,y);
        this.distance = distance;
        this.accuracy = accuracy;
        this.arrows = arrows;
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        if (hp <= 0){
            System.out.println(name+" is dead");
            return;
        }
        if (arrows <= 0){
        System.out.println(name+" has no arrows");
        return;
        }
        abClass enemy = getClosestEnemy(enArray, character);
        if (cont(myArray)) {return;}
        if (contHp(myArray)) {return;}
        if (contReady(myArray)) {return;}
        if (enemy.hp > 0){
            enemy.hp -= character.damage*new Random().nextInt(2);
        } else return;

        

        arrows -= 1;



    }

    @Override
    public void getInfo(){
        System.out.println("Class: sniper, name: "+name);

    }
            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" Arrows"+arrows+" Class: sniper";
    }
    
}
