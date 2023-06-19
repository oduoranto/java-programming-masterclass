public class Main {
    public static void main(String[] args) {

      System.out.println ("4Ft, 7In = " + convertToCentimeters(4,7) + "Cm");
      System.out.println( "15In = "+ convertToCentimeters(15) + "Cm");


    }
    public static double convertToCentimeters (int inches){
        // 1 Inch == 2.54Cm
       return inches * 2.54;
       
    }
    public static double convertToCentimeters (int feet, int inches ) {

        int result2 = (feet * 12) + (inches);

        return convertToCentimeters(result2);

    }
}