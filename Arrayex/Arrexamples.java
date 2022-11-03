package Arrayex;
import java.util.*;
public class Arrexamples {
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		
		
		String[]arr2 = new String[3];
		arr2[0] = "Aryan";
		arr2[1] = "Saif";
		arr2[2] = "Mathur Sahab";
		System.out.println(Arrays.toString(arr2));
		
		
	}
}

