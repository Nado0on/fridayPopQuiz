public class Monitor {
    public String model;
    public String resolution;
    public String manufacturer;

    public Monitor(String model, String resolution, String manufacturer) {
        this.model = model;
        this.resolution = resolution;
        this.manufacturer = manufacturer;

    }


    public void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at" + x + "," + y + " " + "in color" + color);
    }


}
