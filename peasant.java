public class peasant extends abClass {

    public void building(){
        damage = damage + 1;
        System.out.println("buildings impact increase peasants damage on 1");
    }
    
    public peasant(int speed, int damage, int hp, String name,int x,int y) {
        super(speed, damage,hp,name,x,y);
    }
    
        @Override
    public void step(){
        building();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: peasant, name: "+name);

    }
            @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp);
    }
}
