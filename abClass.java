public abstract class abClass {
    public int hp;
    public int damage;
    public int speed;
    public String name;

    public String setName (String name){
    return this.name = name;
    }

    public int setSpeed(int speed){
        return this.speed = speed;
    }

    public void setBoost(int boost){

        this.speed = this.speed + boost;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public void setHp(int hp){
        this.hp = hp;
    }


    public String getName() {return name;}
    public int getDamage() {return damage;}
    public int getHp() {return hp;}


    public abClass(int speed, int damage, int hp) {
        this.speed = speed;
        this.damage = damage;
        this.hp = hp;
    }

    public void go(){
        System.out.println("goes with speed "+speed);

    }

    public void attack(){
        System.out.println("Deals "+damage+" damage");
    }



    
    
}
