import javax.management.monitor.Monitor;

public abstract class PC extends Monitor {
    private String pcCase;
    private String motherboard;
    private String monitor;

    public PC(String pcCase, String motherboard, String monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }


    public String getPcCase() {
        return pcCase;
    }

    public void setPcCase(String pcCase) {
        this.pcCase = pcCase;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void drawLogo(){
        System.out.println("not accepted");

    }

    public void powerUp(){

    }



    public void description(){
        System.out.println("Welcome to the wost buy below us the description of the pc on sale today");
        System.out.println("Monitor : " + getMonitor());
        System.out.println("Motherboard: " + getMotherboard());
        System.out.println("PC Case:" + getPcCase());

    }

    @Override
    public String toString(){
        return "Welcome to the wost buy below us the description of the pc on sale today" +
        "Monitor : " + getMonitor()
        + "Motherboard: " + getMotherboard()
        + "PC Case:" + getPcCase();
    }

}
