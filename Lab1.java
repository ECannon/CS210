//Luhn's Algorithm

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			if(luhn(sc.nextLine()) == true)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		}
		
	}
	
	public static boolean luhn(String s1) {
		
		boolean check = false;
		int total = 0;
		
		for(int i = s1.length()-1; i >= 0; i--) {
			
			if(check) {
				
				int n = 2*Integer.parseInt(s1.charAt(i)+"");
				
				if(n < 10) {
					total+=n;
				} else {
					total += n % 10;
					total+= n/10%10;
				}
			} else {
				total+= Integer.parseInt(s1.charAt(i)+"");
			}
			
			check = !check;
		}
		
		if(total%10 == 0) return true;
		else return false;
		
	}

}
