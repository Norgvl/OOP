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

    public sorcerer(int speed, int damage, int hp, int manna, String name,int x, int y) {
        super(speed, damage,hp, name,x,y);
        this.manna = manna;
    }
        @Override
    public void step(){
        spell();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: sorcerer, name: "+name);

    }
            @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp+" manna: "+manna);
    }
}
