public class thief extends abClass {

    private int invisible = 0;
    public void hiding(){
        if (invisible == 0){
            System.out.println("Becomes invisible");
            invisible = 1;
        }
        else{
            System.out.println("Becomes visible");
            invisible = 0;
        }

    }

    public thief(int speed, int damage, int hp) {
        super(speed, damage,hp);
    }

    
}
