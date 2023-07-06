public class monk extends abClass {

    public void pray(){
        hp = hp + 1;
        System.out.println("heals 1 hp");
    }

    public monk(int speed, int damage, int hp, String name) {
        super(speed, damage,hp, name);
    }
        @Override
    public void step(){
        pray();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: monk, name: "+name);

    }
            @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp);
    }
}
