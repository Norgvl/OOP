public class crossbowman extends abClass {

    private int distance; 
    
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void shooting() {
        System.out.println("Shoots on distance: "+this.distance+", dealing "+this.damage+" damage");
    }



    public crossbowman(int speed,int damage, int hp,int distance) {
        super(speed,damage,hp);
        this.distance = distance;
    }
}
