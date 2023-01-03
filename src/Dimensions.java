public class Dimensions {
    private final double width;
    private final double height;
    private final double length;
    private double volume;


    public Dimensions(double length, double height, double width) {
        this.width = width;
        this.height = height;
        this.length = length;
        volume = width * height * length;
    }
    
    public Dimensions setLength(double length) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(length, width, height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public String toString(){
        return "Длина: " + length + " мм" + "\n" +
                "Высота: " + height + " мм" + "\n" +
                "Ширина: " + width + " мм" + "\n" +
                "Объём: " + volume + " cм3";
    }
}
