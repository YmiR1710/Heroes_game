public class Hobbit extends Character {

    Hobbit(){
        this.power = 0;
        this.hp = 3;
    }
    @Override
    public void kick(Character c){
        System.out.println("Hobbit cries and begs not to kill him.\n");
    }
}
