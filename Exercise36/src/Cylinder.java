public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    double getHeight(){
        return height;
    }
    double getVolume(){
        double volume = getArea() * height;
        return volume;
    }

    @Override
    public String toString() {
        return "The height = " + getHeight()+  ". The volume = " + getVolume() + super.toString();
    }
}
