/**
 * Created by shubham on 3/21/2017.
 */
import java.util.*;
public class Digital_Hour {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers to determine time in 24 Hour clock format: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] array = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            array[i] = Integer.parseInt(str1[i]);
        }
        int temp;
        //boolean j= true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                //if numbers[j-1] > numbers[j], swap the elements
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Input after sorting: " + Arrays.toString(array));

        int n;
        int j = 0, p = 0;
        while (j <= 2) {                                                        // Fixing First Digit
            for (int i = 0; i < array.length; i++) {
                if (array[i] == j) {
                    n = array[0];
                    array[0] = array[i];
                    array[i] = n;
                }
            }
            j++;
        }
        System.out.println("First Digit Fix: " + Arrays.toString(array));

        int k =0;
        int m , max;
        if(array[0] <=1) {                                                             // Second digit fix
            while (k <= 9) {
                for (int l = 1; l < array.length; l++) {
                    if (array[l] == k) {
                        m = array[1];
                        array[1] = array[l];
                        array[l] = m;
                    }
                }
                k++;
            }
            System.out.println("Second Digit Fix: " + Arrays.toString(array));
        }        /*if(array[0] ==1) {
            while (k <= 1) {
                if (array[0] == k) {
                    max = array[1];
                    for (int w = 2; w < array.length; w++) {

                        if (array[w] > max) {
                            m = max;
                            array[1] = array[w];
                            array[w] = m;
                            max = array[w];
                        }
                    }
                }
                k++;
            }
           System.out.println("Input after sorting: " + Arrays.toString(array));
        } */

        else if (array[0] == 2) {
            while (k <= 3) {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] == k) {
                        n = array[1];
                        array[1] = array[i];
                        array[i] = n;
                    }
                }
                k++;
            }
            System.out.println("Second Digit Fix: " + Arrays.toString(array));
        }
            int b;
            while (p <= 5) {                                                           // Fixing Third Digit
                for (int i = 2; i < array.length; i++) {
                    if (array[i] == p) {
                        b = array[2];
                        array[2] = array[i];
                        array[i] = b;
                    }
                }
                p++;
            }
            System.out.println("Third Digit Fix: " + Arrays.toString(array));
            string sbe = new string();
            System.out.println("Our final MAXIMUM digital time in 24 Hour Format is: " + string.toString(array));



        }
}

    class string{
    public static String toString(int[] arr){
        String s2 = "";
        s2 = s2 + arr[0];
        s2 = s2 + arr[1];
        s2 = s2 + ":";
        s2 = s2 + arr[2];
        s2 = s2 + arr[3];
        return s2;
    }
    }




