public class monk extends abClass {

    public void pray(int heal){
        hp = hp + heal;
        System.out.println("heals "+heal+" hp");
    }

    public monk(int speed, int damage, int hp) {
        super(speed, damage,hp);
    }
}
