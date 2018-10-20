//Luhns Algorithm

import java.util.Scanner;

public class Lab1{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "4618704162027265";
		System.out.println(luhnsAlgorithm(s1));
	}
	
	public static boolean luhnsAlgorithm(String s1){
		int sum = 0;
		boolean flag = true;
		
		for(int i = 0; i < s1.length(); i ++){
			int d = Integer.parseInt(s1.substring(i, i + 1)) * 2;			

			if(flag)
				sum += Integer.parseInt(s1.substring(i, i+1));
			else{				
				if(d > 9){
					int num1 = d % 10;
					int num2 = d/10 %10;
					sum += num1 + num2;
				}
				else
					sum += d;
			}
			
			flag = !flag;		
		}
			
		if(sum % 10 == 0)
			return true;
		else
			return false;
	}
}
