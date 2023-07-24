
public class lancer extends infantry {


    public lancer(int speed, int damage, int hp, String name, int x, int y) {
        super(speed,damage,hp, name,x,y);
    }
    @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" Class: lancer";
    }

}
