package NumberMatter;

import java.util.ArrayList;

public class Wrapping {

    public static void main(String[] args) {
        // java 5.0 öncesinde bu şekilde yapılması gerekiyordu..
        int i =288;
        Integer iWrap = new Integer(i);

        int unWrapped = iWrap.intValue();

        System.out.println(iWrap);
        System.out.println(unWrapped);


        //java 5.0 ve sonraki versiyonlarda bu olaya gerek kalmadan
        // direkt primitive tipleri ekleyebiliyoruz.
        int sayi = 150;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(sayi);
        int num = arrayList.get(0);
        System.out.println(num);

        //Integer ile tanımlanmış bir ifade değişken olarak kullanılabiliyor...

        Integer sayac = new Integer(1);

        for (; sayac <= 10; sayac++)
            System.out.println(sayac);

        Boolean bool = new Boolean(true);

        sayac = 0;

        if (bool){
            while (sayac<10){
                sayac++;
                System.out.println(sayac);
            }
            bool = false;
        }

        if (!bool)
            System.out.println("false");
    }
}
