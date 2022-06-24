package firstsession;

import java.util.Scanner;

public class CountOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String str = in.nextLine();
		
		//String str = "vaabbcv";
		
		StringBuilder str1 = new StringBuilder(str);
		
		for (int i = 0; i < str1.length(); i++) {
			int count=1;
			for (int j = i+1; j < str1.length(); j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					count++;
					str1.setCharAt(j, ' ');
				}
			}
			
			if (str1.charAt(i)!=' ') {
				System.out.println(str1.charAt(i)+" " +count);
			}
		}
		
		//System.out.println("New String :"+str1);
	}

}
