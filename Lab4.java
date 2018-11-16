/*
 * This program uses a Monte Carlo Simulation to predict the odds of the three dragons (casey, gallagher, duffy) finishing in the last three places, in any order, in the Irish presidential election.
 * The odds are from a betting site.
 */

import java.util.*;
public class Lab4 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int numElections = 100000;	
		int count = 0;
				
		ArrayList<String> ar2 = new ArrayList<String>();
		
		for(int i = 1; i <= numElections; i++) {
			double higgins = (double)25/26;	
			double casey = (double)1/10;
			double gallagher = (double)1/66;
			double liadh = (double)1/80;
			double freeman = (double)1/250;
			double duffy = (double)1/500;
						
			for(int j = 0; j < 6; j++) {
				
				double sumOdds = (higgins + casey + gallagher + liadh + freeman + duffy);
				double randomValue = rd.nextDouble() * sumOdds;
				
				if(randomValue <= higgins) {
					ar2.add("higgins");
					higgins = 0;
				}
				else if(randomValue <=  higgins + casey) {
					ar2.add("casey");
					casey = 0;
				}
				else if(randomValue <= higgins + casey + gallagher) {
					ar2.add("gallagher");
					gallagher = 0;
				}
				else if(randomValue <= higgins + casey + gallagher + liadh) {
					ar2.add("liadh");
					liadh = 0;
				}
				else if(randomValue <= higgins + casey + gallagher + liadh + freeman) {
					ar2.add("freeman");
					sumOdds-= freeman;
					freeman = 0;
				}
				else if(randomValue <= higgins + casey + gallagher + liadh + freeman + duffy) {
					ar2.add("duffy");
					duffy = 0;
				}	
			}
			
			if(ar2.get(3).equals("casey")|| ar2.get(4).equals("casey") || ar2.get(5).equals("casey")) {
				
				if(ar2.get(3).equals("gallagher") || ar2.get(4).equals("gallagher") || ar2.get(5).equals("gallagher")) {
					
					if(ar2.get(3).equals("duffy") || ar2.get(4).equals("duffy") || ar2.get(5).equals("duffy")) {
						
						count++;
					}
				}
			}
			
			ar2.clear();	
		}	
		System.out.println((double)count/numElections);
	}	
}