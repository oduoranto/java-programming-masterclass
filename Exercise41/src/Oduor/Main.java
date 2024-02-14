package Oduor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //print arrays that are entered
int arr[] = getInteger(4);
System.out.println("----> " + Arrays.toString(arr));

        //prints the elements in the array
int [] arr1 = new int[]{12,45,3039,990,2344,2292,0};
printArray(arr1);

int [] arr2 = new int[]{12,976,76,986,56,223,21};
System.out.println(Arrays.toString(sortInteger(arr2)));

    }
    public static int[] getInteger(int size){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){

            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.println("Element "+ i + " content --> " + array[i]);
        }
    }
    public static  int[] sortInteger(int[] array){

        int[] sortedArray = new int [array.length];
        Arrays.sort(array);

        for(int i =0; i < sortedArray.length; i++){
            sortedArray[i] = array[array.length - (1 + i)];
        }
        return sortedArray;
    }
}
