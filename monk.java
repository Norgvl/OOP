import java.util.ArrayList;
import java.util.Random;

public class monk extends abClass {
    private int manna;

    public monk(int speed, int damage, int hp, int manna, String name,int x, int y) {
        super(speed, damage,hp, name,x,y);
        this.manna = manna;
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        if(manna <= 0 || hp <= 0){return;}
        abClass clTeammate = getClosestTeammate(myArray, character);
        abClass clEnemy = getClosestEnemy(enArray, character);
        if (getRange(character.getCoord(), clTeammate.getCoord()) < getRange(character.getCoord(),clEnemy.getCoord()) && clTeammate.hp<6 && clTeammate.hp > 0){
            clTeammate.hp += character.damage*new Random().nextInt(2);
            manna--;
        }
        if (clEnemy.hp > 0) {
            
            clEnemy.hp -= character.damage*new Random().nextInt(2);
            manna--;
        }
        else return;
    }

    @Override
    public void getInfo(){
        System.out.println("Class: monk, name: "+name);

    }
            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" manna: "+manna+" Class: monk";
    }
}
