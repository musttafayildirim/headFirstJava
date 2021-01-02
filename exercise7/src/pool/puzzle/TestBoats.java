package pool.puzzle;

public class TestBoats {

    public static void main(String[] args){

        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        RowBoat b3 = new RowBoat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();

    }
}

class RowBoat extends Boat{
    public void rowTheBoat(){
        System.out.print("stroke natasha ");
    }
}

class Sailboat extends Boat{
    public void move(){
        System.out.print("host sail ");
    }
}

class Boat{
    private int length;

    public void setLength(int len){
        this.length = len;
    }

    public int getLength(){
        return length;
    }

    public void move(){
        System.out.print("drift ");
    }
}