public class Resolution {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;


    @Override
    public String toString() {
        return "Resolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
