import java.util.ArrayList;

public class lancer extends abClass {

    public void stabbing(){
        System.out.println("Stabs with"+damage+"damage");
    }
    

    public lancer(int speed, int damage, int hp, String name, int x, int y) {
        super(speed,damage,hp, name,x,y);
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        stabbing();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: lancer, name: "+name);

    }
        @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp);
    }
}
