public class crossbowman extends abClass {

    private int distance; 
    
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void shooting() {
        System.out.println("Shoots on distance: "+this.distance+", dealing "+this.damage+" damage");
    }



    public crossbowman(int speed,int damage, int hp,int distance, String name, int x, int y) {
        super(speed,damage,hp, name, x,y);
        this.distance = distance;
    }

    @Override
    public void step(){
        shooting();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: crossbowman, name: "+name);

    }
    @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp+" distance: "+distance);
    }
}
