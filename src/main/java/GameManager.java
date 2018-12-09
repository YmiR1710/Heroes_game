public class GameManager {

    void fight(Character c1, Character c2){
        Integer round = 1;
        while(c1.isAlive() && c2.isAlive()){
            System.out.println("Round " + round.toString());
            System.out.println("         HP    Power\n" + c1.getClass().getName() + new String(new char[9 -
                    c1.getClass().getName().length()]).replace("\0", " ") + Integer.toString(c1.hp) +
                    new String(new char[6 - Integer.toString(c1.hp).length()]).replace("\0", " ") +
                    Integer.toString(c1.power) + "\n" + c2.getClass().getName() + new String(new char[9 -
                    c2.getClass().getName().length()]).replace("\0", " ") + Integer.toString(c2.hp) +
                    new String(new char[6 - Integer.toString(c2.hp).length()]).replace("\0", " ") +
                    Integer.toString(c2.power) + "\n");
            c1.kick(c2);
            if(c2.isAlive()){
                c2.kick(c1);
            }
            System.out.println("\n\n");
            round++;
        }
    }
}
