package date;

import java.util.Calendar;

public class TakvimKullanimi {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40,56);

        System.out.println(c.getTime());

        //milisaniye cinsinden aldığımız değere bir saat ekliyoruz.
        long day1 = c.getTimeInMillis();
        day1 += 1000* 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println(c.getTime());
        System.out.println("yeni saat " + c.get(c.HOUR_OF_DAY));

        //35 gün ekliyoruz..
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());

        // 35 gün ileri atar tarihi ama ayı değiştirmez
        c.roll(c.DATE, 35);
        // Buradaki örneklere göre 17 mart olmalı ama 17 şubatta kalıyor... Ayın gününü önümüzdeki aya göre ayarlıyor
        // ama ayı değiştirmiyor....
        System.out.println("roll 35 days " + c.getTime());


        // burada gününü belirliyoruz aşağıdaki örnek için
        // 01 Feb olacaktır.
        c.set(c.DATE, 1);
        System.out.println("Set to 1 " + c.getTime());



    }

}
