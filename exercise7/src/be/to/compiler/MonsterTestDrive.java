package be.to.compiler;

public class MonsterTestDrive {
    public static void main(String[] args){
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();

        for(int x = 0; x < 3; x++){
            ma[x].frighten(x);
        }
    }
}


class Monster {
    boolean frighten(int x){
        System.out.println("arrrgh");
        return true;
    }
}

class Vampire extends Monster{
    @Override
    boolean frighten(int x) {
        System.out.println("a bite?");
        return true;
    }
}

class Dragon extends Monster{
    @Override
    boolean frighten(int x) {
        System.out.println("breath fire");
        return true;
    }
}
