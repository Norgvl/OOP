import java.util.ArrayList;

public abstract class abClass extends coordinates implements inGameInterface  {
    public int hp;
    public int damage;
    public int speed;
    public String name;
    public String status = "Ready";

    public String setName (String name){
    return this.name = name;
    }

    public void setBoost(int boost){

        this.speed = this.speed + boost;
    }

    public void setGain(int damage){
        this.damage = this.damage + damage;
    }

    public String getName() {
        return name;
    }

    public abClass(int speed, int damage, int hp, String name, int x, int y) {
        super(x,y);
        this.speed = speed;
        this.damage = damage;
        this.hp = hp;
        this.name = name;
        
    }

    public int getHp() {
        return hp;
    }

    public void go(){
        System.out.println("goes with speed "+speed);

    }

    public void attack(){
        System.out.println("Deals "+damage+" damage");
    }

    public int[] getCoord(){
        int[] arr = {x,y};
        return arr;
    }


    public int getRange(int[] arr1, int[] arr2){
        int a = Math.abs(arr1[0] - arr2[0]) + Math.abs(arr1[1] - arr2[1]);
        return a;
    }
    
    public abClass getClosestEnemy(ArrayList<abClass> enemArrayList, abClass unit){   

        abClass closest = enemArrayList.get(0);
        int minRange = unit.getRange(unit.getCoord(), enemArrayList.get(0).getCoord());
        for (abClass i: enemArrayList) {
            int sum = unit.getRange(unit.getCoord(), i.getCoord());
            if (minRange > sum){
                minRange = sum;
                closest = i;
            }
        }
        return closest;
    }

    public abClass getClosestTeammate(ArrayList<abClass> teamArrayList, abClass unit){
        
        abClass closest = teamArrayList.get(0);
        int minRange = unit.getRange(unit.getCoord(), teamArrayList.get(0).getCoord());
        if (minRange == 0){
            minRange = unit.getRange(unit.getCoord(), teamArrayList.get(1).getCoord());
        }
        for (abClass i: teamArrayList) {
            int sum = unit.getRange(unit.getCoord(), i.getCoord());
            if (minRange > sum && sum !=0){
                minRange = sum;
                closest = i;
            }
        }
        return closest;

    } 

    public boolean cont(ArrayList<abClass> array){
        for (abClass a : array) {
            if (a.getClass() == peasant.class){
                return true;
            }
        }
        return false;

    }
        public boolean contHp(ArrayList<abClass> array){
        for (abClass a : array) {
            if (a.getClass() == peasant.class){
                if (a.hp >= 0) {return true;} 
            }
        }
        return false;

    }

        public boolean contReady(ArrayList<abClass> array){
        for (abClass a : array) {
            if (a.getClass() == peasant.class){
                if (a.status == "Ready") {
                    a.status = "Busy";
                    return true;
                } 
            }
        }
        return false;

    }


    
}
