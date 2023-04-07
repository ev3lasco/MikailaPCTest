public abstract class Case {
    private String model;
    private String manufacture;
    private  String powerSupply;

    public Case(String model, String manufacture, String powerSupply) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
}
