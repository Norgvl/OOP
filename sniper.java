public class sniper extends abClass {

    private int distance;
    private int accuracy;

    public void sniperShooting(){
        System.out.println("Shoots on "+distance+" distance with "+accuracy+" accuracy, dealing "+damage*accuracy+" damage");
    }

    public sniper(int speed, int damage, int hp, int distance, int accuracy) {
        super(speed, damage,hp);
        this.distance = distance;
        this.accuracy = accuracy;
    }
    
}
