public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0){
            length = 0;
        }
        if (width < 0){
            width = 0;
        }
        this.length = length;
        this.width = width;
    }
     double getLength(){
        return length;
     }
     double getWidth(){
        return width;
     }
     double getArea(){
         double area = (length * width);
         return area;
     }

    @Override
    public String toString() {
        return
                "length=" + length +
                ", width=" + width +
                ", area =" + getArea();
    }
}
