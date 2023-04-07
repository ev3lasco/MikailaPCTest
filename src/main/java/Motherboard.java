public abstract class Motherboard {

    private String model;
    private String manufacture;
    private  String bios;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String model, String manufacture, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacture = manufacture;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String programName){
        System.out.println(programName + "photoshop is now running...");

    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", bios='" + bios + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                '}';
    }
}
