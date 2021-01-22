package NumberMatter;

public class SharpenYourPencil {
    Integer i;
    int j;

    public static void main(String[] args) {
        SharpenYourPencil t = new SharpenYourPencil();
        t.go();
    }

    private void go() {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
