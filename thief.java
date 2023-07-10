public class thief extends abClass {

    private int visibility = 0;
    public void hiding(){
        if (visibility == 0){
            System.out.println("Becomes invisible");
            visibility = 1;
        }
        else{
            System.out.println("Becomes visible");
            visibility = 0;
        }

    }

    public thief(int speed, int damage, int hp, String name,int x, int y) {
        super(speed, damage,hp, name,x,y);
    }
        @Override
    public void step(){
        hiding();
    }

    @Override
    public void getInfo(){
        System.out.println("Class: thief, name: "+name);

    }
            @Override 
    public void getStat(){
        System.out.println("damage: "+damage+" speed: "+speed+" hp: "+hp+" visibility status: "+visibility);
    }

    
}
