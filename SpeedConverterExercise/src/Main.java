public class Main {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(34) + " Mi/h");
         printConversion(34);
    }
    public static long toMilesPerHour (double kilometersPerHour){
     if (kilometersPerHour > 0){
    //1 mile = 1.609km
     double conversion = (kilometersPerHour * 1.609);
     return   Math.round(conversion);
}
      else {
     return -1;
}

    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " Km/h = " + milesPerHour + " Mi/h");


        }
    }
}