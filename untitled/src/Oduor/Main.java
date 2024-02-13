package Oduor;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

int[] unsortedArray = getArrays(8);
        System.out.println(Arrays.toString(unsortedArray));

       Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sort(new int[]{23,55,33,29,900,2});
        System.out.println(Arrays.toString(sortedArray));



    }
    public static int[] getArrays(int num) {

        Random random = new Random();
        int[] randomArrays = new int[num];

        for (int i = 0; i < num; i ++){
            randomArrays[i] = random.nextInt(100);
        }
        return randomArrays;
    }

    private static int[] sort(int [] array){
        int[] sortedArrays = Arrays.copyOf(array, array.length);


        boolean flag = false;
        int temp;
        while(flag){

            for(int i = 0; i < sortedArrays.length -1; i++){
                if(sortedArrays[i] < sortedArrays[i + 1]){
                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i + 1];
                    sortedArrays[i + 1] =temp;
                    flag = true;
                    System.out.println("--------> " + Arrays.toString(sortedArrays));
                }
            }
            System.out.println("-------> " + Arrays.toString(sortedArrays));
        }
        return sortedArrays;
    }
}
