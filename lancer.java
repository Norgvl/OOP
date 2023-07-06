public class lancer extends abClass {

    public void stabbing(){
        System.out.println("Stabs with"+damage+"damage");
    }
    

    public lancer(int speed, int damage, int hp, String name) {
        super(speed,damage,hp, name);
    }
        @Override
    public void step(){
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
