public class Knight extends Character {

    Knight(){
        this.power = (int)( Math.random() * (13-2) ) + 2;
        this.hp = (int)( Math.random() * (13-2) ) + 2;
    }

    @Override
    public void kick(Character c){
        Integer damage = (int)( Math.random() * this.power ) + 1;
        c.hp -= damage;
        if(c.isAlive()){
            System.out.println("Knight dealt " + damage.toString() + " damage to " + c.getClass().getName() + "\n");
        }
        else{
            System.out.println("Knight dealt " + damage.toString() + " damage to " + c.getClass().getName()
                    + " and killed him.\n");
        }
    }
}
