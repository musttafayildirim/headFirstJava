package NumberMatter;

public class Wrappers {

    public static void main(String[] args) {
        String s = "2";
        int x = Integer.parseInt(s);
        double d = Double.parseDouble("420.24");
        boolean b = Boolean.parseBoolean("True");

        System.out.println(x);
        System.out.println(d);
        System.out.println(b);

        String two = "two 42 dfsdf";
        try {
            int two2 = Integer.parseInt(two);
        }catch (NumberFormatException e){
            System.out.println(two + " ifadesi bir sayı olmadığı için parse edilememiştir.");
        }


        //Overloaded operator olan + ile ekleme
        double d1 = 42.5;
        String doubleString = "" + d;

        //static metotle ekleme
        double d2 = 42.5;
        String doubleString2 = Double.toString(d);




    }

}
