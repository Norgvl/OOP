import java.util.ArrayList;

public class peasant extends abClass {

    public String status = "Ready"; 

    
    public peasant(int speed, int damage, int hp, String name,int x,int y) {
        super(speed, damage,hp,name,x,y);
    }
    
    

        @Override
    public void step(abClass character, ArrayList<abClass> enArray, ArrayList<abClass> myArray){
        status = "Ready";
    }

    @Override
    public void getInfo(){
        System.out.println("Class: peasant, name: "+name);

    }
            @Override 
    public String getStat(){
        return "damage: "+damage+" speed: "+speed+" hp: "+hp+" Class: peasant";
    }


}
