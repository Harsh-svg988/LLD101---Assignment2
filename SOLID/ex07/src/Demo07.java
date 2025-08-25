public class Demo07 {
    public static void main(String[] args) {
        Printer basic = new BasicPrinter();
        basic.Print("Hello");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.Print("Report");
        mfp.scan("/tmp/out");
        mfp.fax("12345");
    }
}