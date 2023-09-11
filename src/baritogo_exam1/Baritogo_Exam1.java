/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baritogo_exam1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.StringArrays;
/**
 *
 * @author Tovi Myer
 */
public class Baritogo_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       main();
    }
    public static void main(){
         Scanner scn = new Scanner(System.in);
         System.out.println("Where do you want to go?\n1, 2, 3, 4 or 5?");
         int input = scn.nextInt();
         
         if (input == 1){
             uno();
         } else if (input == 2){
             dos();
         }  else if (input == 3){
             tres();
         }  else if (input == 4){
             kwatro();
         }  else if (input == 5){
             singko();
         } else {
             System.out.println("Ayaw pasagad og type!!");
             main();
         }
         
    }
    public static void uno(){
        Scanner scn = new Scanner(System.in);
        int [] arr = {1, -2, 3, -4, 5};
       
        System.out.println("the array:"+ Arrays.toString(arr));
        if (arr[0]<0&&arr[1]<0&&arr[2]<0&&arr[3]<0&&arr[4]<0){
            System.out.println("0");
        }
            else {
                     int sum = (arr[0])+(arr[2]+arr[4]);
        System.out.println("sum of all positive integers: "+ sum);
                    }    
    }
    public static void dos(){
          Scanner scn = new Scanner(System.in);
          String [] StringArrays = {"banana", "apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas"};
          bubbleSort(StringArrays);
          System.out.println("Sorted");
          for (String str: StringArrays){
              System.out.println(str +"");
          }
    }
    public static void tres(){        
          int [] myArray = {2, 4, 6, 8, 10};
          
          int arrayLength = myArray.length;
          System.out.println(Arrays.toString(myArray));
          System.out.println("The length of myArray is:"+ arrayLength);
    }
    public static void kwatro(){
         int size = 10;
         
         int [] positiveEvenNumbers = new int[size];
         
         int currentnumber = 2;
         for(int i=0; i< size; i++){
             positiveEvenNumbers[i] = currentnumber;
             currentnumber += 2;
         }
         System.out.println("Positve Even Number Array:");
         for(int number: positiveEvenNumbers){
             System.out.println(number + "");
         }
    }
    public static void singko(){
         System.out.println("wala ko naminaw sa fibonacci!!");
    }
    public static void bubbleSort(String arr[]){
        int n = arr.length;
        boolean swap;
        for(int i = 0; i < n - 1; i++){
            swap = false;
        for(int j= 0; j < n -1; j++){
            if(arr[j].compareTo(arr[j+1]) > 0){
                String m = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = m;
                swap = true;
             }
          }
        if (!swap){
            break;
        }
      }
    }
   
}
