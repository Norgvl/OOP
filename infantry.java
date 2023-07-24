import java.util.ArrayList;
import java.util.Random;

public abstract class infantry extends abClass {

    public infantry(int speed, int damage, int hp, String name,int x,int y) {
        super(speed, damage,hp,name,x,y);
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
            if (character.hp <= 0){return;}
            abClass clEnemy = character.getClosestEnemy(enArray, character);
            int[] startCoord = character.getCoord();
            if (clEnemy.getCoord()[0] - character.getCoord()[0] > 1)
            {   
                character.x += 1;

            }
            if (clEnemy.getCoord()[1] - character.getCoord()[1] > 1 ){
                character.y += 1;
            }
            if (checkUnit(myArray, character.getCoord(), character)){
                character.x = startCoord[0];
                character.y = startCoord[1];
            }
            if (clEnemy.getCoord()[0] - character.getCoord()[0] < -1)
            {   
                character.x -= 1;

            }
            if (clEnemy.getCoord()[1] - character.getCoord()[1] < -1 ){
                character.y -= 1;
            }
            if (checkUnit(myArray, character.getCoord(), character)){
                character.x = startCoord[0];
                character.y = startCoord[1];
            }
            if (checkEnemyBool(enArray, character.getCoord())) {
                checkEnemyReturn(enArray, character.getCoord()).hp -= character.damage*new Random().nextInt(2);
            }
            return;


        }

        @Override
        public void getInfo(){
            System.out.println("Class:"+infantry.class.getTypeName()+", name: "+name);
    
        }
            @Override 
        public String getStat(){
            return "damage: "+damage+" speed: "+speed+" hp: "+hp+" Class:";
        }

}