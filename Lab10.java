import java.util.*;

public class Lab10 {

	public static void main(String[] args) {
		
		System.out.println(interest(100,1.02,3));	
		
		System.out.println(1-birthdayParadox(10));
				
		
	}
	
	public static double interest(double balance, double rate, int years) {
		
		while(years != 0) {
			return interest(balance*rate,rate, years-1);
		}
		return balance;
	}
	
	//Probability of 2 people having the same birthday out of n people.
	public static double birthdayParadox(int n) {
		
		if(n == 1) return 1.0;
		
		return birthdayParadox(n-1) * (365-(n-1))/365;
	}
	
}
