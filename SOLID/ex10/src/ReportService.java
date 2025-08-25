class ReportService {
    private final Logger logger;

    // Dependency injected via constructor
    ReportService(Logger logger) {
        this.logger = logger;
    }

    void generate() {
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}