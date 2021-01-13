package com.company;

public class Of76 extends Clowns {
    public static void main(String [] args) {
        Nose[ ] i = new Nose[3] ;
        i[0] = (Nose) new Acts();
        i[1] = (Nose) new Clowns();
        i[2] = (Nose) new Of76();
        for(int x = 0; x < 3; x++) {
            System.out.println( i [x] . iMethod( )
                    + " " + i [x].getClass( ) );
        }
    }
}
