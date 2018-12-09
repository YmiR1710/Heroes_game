public class King extends Character {

    King(){
        this.power = (int)( Math.random() * (16-5) ) + 5;
        this.hp = (int)( Math.random() * (16-5) ) + 5;
    }

    @Override
    public void kick(Character c){
        Integer damage = (int)( Math.random() * this.power ) + 1;
        c.hp -= damage;
        if(c.isAlive()){
            System.out.println("King dealt " + damage.toString() + " damage to " + c.getClass().getName() + "\n");
        }
        else{
            System.out.println("King dealt " + damage.toString() + " damage to " + c.getClass().getName()
                    + " and killed him.\n");
        }
    }
}
