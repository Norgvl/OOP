import java.util.ArrayList;

public class monk extends abClass {

    public void pray(){
        hp = hp + 1;
        System.out.println("heals 1 hp");
    }

    public monk(int speed, int damage, int hp, String name,int x, int y) {
        super(speed, damage,hp, name,x,y);
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        pray();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: monk, name: "+name);

    }
            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp;
    }
}
