
public class sorcerer extends mages{


    public sorcerer(int speed, int damage, int hp, int manna, String name,int x, int y) {
        super(speed, damage,hp,manna, name,x,y);
    }
            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" manna: "+manna+" Class: sorcerer";
    }
}
