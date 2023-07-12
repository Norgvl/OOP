import java.util.ArrayList;

public class sniper extends abClass {

    private int distance;
    private int accuracy;

    public void sniperShooting(){
        System.out.println("Shoots on "+distance+" distance with "+accuracy+" accuracy, dealing "+damage*accuracy+" damage");
    }

    public sniper(int speed, int damage, int hp, int distance, int accuracy, String name,int x,int y) {
        super(speed, damage,hp,name,x,y);
        this.distance = distance;
        this.accuracy = accuracy;
    }
        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        sniperShooting();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: sniper, name: "+name);

    }
            @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp+" distance: "+distance+" accuracy: "+accuracy);
    }
    
}
