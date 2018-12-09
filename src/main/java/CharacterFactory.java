public class CharacterFactory {
    private Character[] barracks = {new King(), new Hobbit(), new Elf(), new Knight()};

    Character createCharacter(){
        int num = (int)( Math.random() * 4 );
        Character c = barracks[num];
        switch(num) {
            case 0:
                barracks[0] = new King();
                break;
            case 1:
                barracks[1] = new Hobbit();
                break;
            case 2:
                barracks[2] = new Elf();
                break;
            case 3:
                barracks[3] = new Knight();
        }
    return c;
    }
}
