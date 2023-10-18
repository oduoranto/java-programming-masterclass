public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }
     double getRadius (){
        return radius;
     }

     double getArea(){
        //area =  (radius * radius * PI).
         double area = (radius * radius * Math.PI);
         return area;
     }

    @Override
    public String toString() {
        return "The radius = " + getRadius() + ". The area of the circle = " + getArea();
    }
}
