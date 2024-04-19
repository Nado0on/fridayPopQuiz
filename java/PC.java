
public class PC {
    public Case computerCase;
    public MotherBoard motherBoard;
    public Monitor monitor;


    //constructor for the pc class
    public PC(Case computerCase, MotherBoard motherBoard, Monitor monitor) {
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    private void drawLogo(int x, int y, String color) {
        monitor.drawPixel(x, y, color);
    }

    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today: " + computerCase.toString() + " " + motherBoard.toString() + " " + monitor.toString());
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo(10, 20, "Blue");
        motherBoard.loadProgram("nadins world");

    }
}
