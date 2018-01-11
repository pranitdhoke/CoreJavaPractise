package hackerearth;

import java.util.Scanner;

public class ArrayPlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = 6;
        int arr[] = {-4, 3, -9, 0, 4, 1};
        int positive=0, negative=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            //arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                positive++;
            }else if(arr[arr_i] < 0){
                negative++;
            }
        }
        System.out.printf("%.6f \n",(double)positive/n);
        System.out.printf("%.6f \n",(double)negative/n);
        System.out.printf("%.6f",(double)(n-(positive+negative))/n);
        
	}

}
