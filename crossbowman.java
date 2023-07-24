

public class crossbowman extends sooters {





    public crossbowman(int speed,int damage, int hp,int range, int arrows, String name, int x, int y) {
        super(speed,damage,hp,range,arrows, name, x,y);
    }
  
    @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" arrows: "+arrows+" Class: crossbowman";
    }
}
