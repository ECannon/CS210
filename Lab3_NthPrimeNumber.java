import java.util.Scanner;
public class Lab3_NthPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] ar1 = primeSieve();
		
		int n = sc.nextInt();
		
		for(int i = 2; i < ar1.length; i++){
			
			if(n == 1 && ar1[i] == true){
				System.out.println(i);
				break;
			}
			if(ar1[i] == true){
				n--;
			}
		}
	}
	
	public static boolean[] primeSieve(){
		
		int n = 2000000;
		
		boolean[] ar1 = new boolean[n];
		
		for(int i = 2; i < ar1.length; i++){
			ar1[i] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			
			if(isPrime(i)){
				for(int j = i; j*i < n; j++){
					ar1[i*j] = false;
				}
			}
		}
		return ar1;
	}
	
	public static boolean isPrime(int n){
		boolean isPrime = true;
		
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				isPrime = false;
			}
		}
		return isPrime;
	}
}