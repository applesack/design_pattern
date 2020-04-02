package 享元模式;

public class Manager implements Employee {

    private String depaerment;
    private String reportContent;

    public Manager(String depaerment) {
        this.depaerment = depaerment;
    }

    @Override
    public void report() {
        System.out.println();
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
