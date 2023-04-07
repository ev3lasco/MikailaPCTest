public abstract class Monitor extends Resolution {
    private double modelNumber;
    private double manufactureName;

    public Monitor(int width, int height) {
        super(width, height);
    }

    public void drawPixel(int x, int y , String color){
        System.out.println( "Drawing pixel at" + x + y + "in color" + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "modelNumber=" + modelNumber +
                ", manufactureName=" + manufactureName +
                '}';
    }
}
