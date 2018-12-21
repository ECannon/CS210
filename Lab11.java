import java.util.*;

public class Lab11 {
	
	public static void main(String []args)
	{
		
		Random rd = new Random();		
		
		int count = 0;
		int roll;	
		int numOccur = 0;
		int totalRollsTil6 = 0;
		boolean start = false;
		boolean btcMined = false;
		
		for(int i = 0; i < 10000000; ++i) {
			
			if(i % 600 == 0) {
				btcMined = true;
				numOccur++;
			}
		
			roll = rd.nextInt(6)+1;
				
			if(roll == 6) start = true;
				
			if(start) count++;
				
			if(btcMined && roll == 6) {
					
				totalRollsTil6 += count;
				count = 0;
				btcMined = false;
			} 
				
			if(roll == 6) count = 0;
			
			
		}
		
		System.out.println((double)totalRollsTil6/numOccur);
		
	}
	
}