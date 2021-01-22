package NumberMatter;

public class Bar {
    public static final double BAR_SIGN;

    static {
        BAR_SIGN = (double) (Math.random() * 10);
    }


    public static void main(String[] args) {
        System.out.println(BAR_SIGN);
    }
}
