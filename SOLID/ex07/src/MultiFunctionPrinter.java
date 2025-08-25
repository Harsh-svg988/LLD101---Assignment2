class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void Print(String text) {
        System.out.println("Print: " + text);
    }
    public void scan(String dstPath) {
        System.out.println("Scan saved to " + dstPath);
    }
    public void fax(String number) {
        System.out.println("Fax sent to " + number);
    }
}