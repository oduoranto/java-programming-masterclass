public class Cuboid  extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    double getVolume() {

        double volume = getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "Height =" + getHeight() + ", The volume =" + getVolume();

    }
}