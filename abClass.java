public abstract class abClass implements inGameInterface {
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


    public abClass(int speed, int damage, int hp, String name) {
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



    
    
}
