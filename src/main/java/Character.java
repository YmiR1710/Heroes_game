public abstract class Character {
    public int power;
    public int hp;

    public abstract void kick(Character c);

    public boolean isAlive(){
        if(this.hp > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
