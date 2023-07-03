public class peasant extends abClass {

    public void building(int impact){
        damage = damage + impact;
        System.out.println("buildings impact increase peasants damage on "+ impact);
    }
    
    public peasant(int speed, int damage, int hp) {
        super(speed, damage,hp);
    }
    
}
