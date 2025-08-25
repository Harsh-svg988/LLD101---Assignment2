public class Demo10 {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();   // could swap with FileLogger
        ReportService service = new ReportService(logger);

        service.generate();
    }
}