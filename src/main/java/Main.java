public class Main {
    public static void main(String argv[]){
        CharacterFactory factory = new CharacterFactory();
        GameManager manager = new GameManager();
        while(true){
            Character c1 = factory.createCharacter();
            Character c2 = factory.createCharacter();
            if(!c1.getClass().isInstance(c2)){
                manager.fight(c1, c2);
                break;
            }
        }
    }
}
