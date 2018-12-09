public class Elf extends Character {

    Elf(){
        this.hp = 10;
        this.power = 10;
    }

    @Override
    public void kick(Character c){
        if(c.power < this.power){
            System.out.println("Elf kills weak " + c.getClass().getName()+ " in front of him.\n");
            c.hp = 0;
        }
        else{
            System.out.println("Elf decreases power of " + c.getClass().getName() + " by 1\n");
            c.power -= 1;
        }
    }
}
