public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,3));
        System.out.println(shouldWakeUp(false ,7));
        System.out.println(shouldWakeUp(false,24));
        System.out.println(shouldWakeUp(false,0));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfday){
        if (hourOfday < 0 || hourOfday > 23){
            return false;
        }
        else if (barking == true && hourOfday < 8 || hourOfday > 22){
            return true;
        }
        else {
            return false;
        }

    }
}