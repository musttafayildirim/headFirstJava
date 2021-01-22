package NumberMatter;

import java.util.Date;

public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);

        //sayının virgülden sonraki basamağını ayarlama
        System.out.println(String.format("I have %.2f bugs to fix", 744325325.545454454));

        //virgül ekleme
        System.out.println(String.format("I have %,.2f bugs to fix", 744325325.545454454));

        // %[argument number] [flags] [width] [.precision] type
        //argument number: birden fazla argümen varsa hangisini seçeceğimizi belirlemek için kullanıyoruz.
        //flags : virgül negatif sayıları parantez içine koymak gibi
        //width: Kullanılacak minimum karakter sayısını belirlemek için kullanılar belirtilen karakter sayısından küçük olursa sıfır ile doldurur.
        //[.precision] virgülden sonra kaç basamaklı olacağını belirlemek için kullanılır.
        //type zorunlu alan diğer 5 alanda isteğe bağlı ama type alanı zorunlu
        System.out.println(String.format("I have %f bugs to fix", 744325325.545454454));

        // %d decimal
        System.out.println(String.format("%d", 42));

        // %f floating point
        System.out.println(String.format("%.3f", 42.000000));

        //%x hexadecimal
        System.out.println(String.format("%x", 42));

        // %c character
        System.out.println(String.format("%c", 42));

        // birden fazla argumen kullanımı

        int one = 20456654;
        double two = 10005666456.656646;
        String oneTwo = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(oneTwo);

        //tc
        System.out.println(String.format("%tc", new Date()));

        //tr
        System.out.println(String.format("%tr", new Date()));

        // day of the week, month and day

        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td", today, today, today));

        //Yukkarıdakinin aynısı fakat başka bir gösterimi

        System.out.println(String.format("%tA, %<tB %<td", today));







    }
}
