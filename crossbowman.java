import java.util.ArrayList;
import java.util.Random;

public class crossbowman extends abClass {

    private int range; 
    
    private int arrows;

    public void setDistance(int range) {
        this.range = range;
    }

    public void shooting() {
        System.out.println("Shoots on range: "+this.range+", dealing "+this.damage+" damage");
    }



    public crossbowman(int speed,int damage, int hp,int range, int arrows, String name, int x, int y) {
        super(speed,damage,hp, name, x,y);
        this.range = range;
        this.arrows = arrows;
    }
    @Override
    public void  step(abClass crossbowman, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        if (hp <= 0){
            System.out.println(name+" is dead");
            return;
        }
        if (arrows <= 0){
        System.out.println(name+" has no arrows");
        return;
        }
        abClass enemy = getClosestEnemy(enArray, crossbowman);

        enemy.hp -= crossbowman.damage*new Random().nextInt(2);

        if (cont(myArray)) {return;}

        arrows -= 1;



    }

    @Override
    public void getInfo(){
        System.out.println("Class: crossbowman, name: "+name);

    }

    @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp+" range: "+range);
    }
}
