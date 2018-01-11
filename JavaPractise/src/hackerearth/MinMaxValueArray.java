package hackerearth;

import java.util.Scanner;

public class MinMaxValueArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int sum=0;
        int min=9999,max=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            //arr[arr_i] = in.nextInt();
            sum+=arr[arr_i];
            if(arr[arr_i] > max ){
                max=arr[arr_i];
            }
            if(min> arr[arr_i]){
                min = arr[arr_i];
            }
        }
        System.out.println((sum-min)+" "+(sum-max));
        //System.out.println(min+" "+max);
    }
}

