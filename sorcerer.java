public class sorcerer extends abClass{
    private int manna;

    public void spell(){
        if (manna == 0){
            System.out.println("No manna");

        }
        else{
            System.out.println("Casts a spell using 1 manna, dealing "+damage+"damage");
            manna--;
        }
    }

    public sorcerer(int speed, int damage, int hp, int manna) {
        super(speed, damage,hp);
        this.manna = manna;
    }
}
