package firstsession;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int temp;
		
		System.out.println("Array length :"+arr.length);
		System.out.println("Array :"+Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array Sorting :");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("\nSecond largest :"+arr[1]);
	}

}
