public abstract class abClass extends coordinates implements inGameInterface  {
    public int hp;
    public int damage;
    public int speed;
    public String name;

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
    
    
}
