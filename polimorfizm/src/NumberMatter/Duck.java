package NumberMatter;

public class Duck {
    private int size;
    private int duckCount = 0;
    private static int staticDuckCount = 0;

    public Duck() {
        duckCount++;
        staticDuckCount++;
    }
    public void setSize(int s) {
        size = s;
    }
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Duck d1 = new Duck();
        System.out.println("Eğer instance variable'ı static olarak tanımlarsak nesne ilk oluşturulduğu\n " +
                "zaman tanımlanır sonra aynı değişken kullanılır.\n" +
                "Fakat static olarak tanımlanmazsa bu değişken her bir new operatörü kullanılarak\n" +
                "yeni obje tanımlandığında yeniden tanımlanır.");
        System.out.println("duck count: " + d1.duckCount);
        System.out.println("static duck count: " + d1.staticDuckCount);
        Duck d2 = new Duck();
        System.out.println("duck count: " + d2.duckCount);
        System.out.println("static duck count: " + d2.staticDuckCount);
        Duck d3 = new Duck();
        System.out.println("duck count: " + d3.duckCount);
        System.out.println("static duck count: " + d3.staticDuckCount);
        Duck d4 = new Duck();
        System.out.println("duck count: " + d4.duckCount);
        System.out.println("static duck count: " + d4.staticDuckCount);
    }
}
