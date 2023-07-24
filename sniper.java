
public class sniper extends sooters {

    private int arrows;


    public sniper(int speed,int damage, int hp,int range, int arrows, String name, int x, int y) {
        super(speed,damage,hp,range,arrows, name, x,y);

    }

            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" Arrows"+arrows+" Class: sniper";
    }
    
}
