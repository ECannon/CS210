import java.util.*;
import java.math.BigInteger;

public class Lab6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		ArrayList<Long> ar1 = new ArrayList<Long>();
		ArrayList<Long> subset1 = new ArrayList<Long>();
		ArrayList<Long> subset2 = new ArrayList<Long>();

		for (int i = 0; i < 1000000000; i++) {

			BigInteger subset1Total = new BigInteger("0");
			BigInteger subset2Total = new BigInteger("0");
			BigInteger difference = new BigInteger("0");

			subset1.clear();
			subset2.clear();
			ar1.clear();

		    ar1.addAll(Arrays.asList(
		    410678527411098l,
		    183064013267932758l,
		    8056584603037925167l,
		    1899884129638764508l,
       	    5128941762697709445l,
   		    5047244487910064394l,
		    3305601720113745382l,
		    5776953008539814370l,
		    34988082947722169l,
	   	    7434345681532331612l,
		    5407786886759427803l,
		    688068291500036320l,
		    2068510150417278708l,
		    1868790318480929054l,
		    3425404376196216488l,
		    1131190712360422749l,
		    102967645096808272l,
		    1445942735952374406l,
		    8456737838228485082l,
		    7623544032966572081l,
		    3942629391233399085l,
		    75109850685511728l,
		    223515536869223609l,
		    764673323466830185l,
		    2792331077502901882l,
		    8043871486090449356l,
		    8027891460874623856l,
		    9035205129603316628l,
		    5210176758109223792l,
		    6369027410439876015l,
		    719764136449271247l,
		    6275216998605832028l,
		    7518974182407464286l,
		    8228098362075889963l,
		    4364500170274364383l,
		    5160900320056121570l,
		    3574188741140445768l,
		    3799725687163235416l,
		    8971054323076859594l,
		    303947614746485290l,
		    4072768654844778108l,
		    422948319988286530l,
		    228169257627773589l,
		    4695919214544378987l,
		    5634695221137989240l,
		    2134479954298742138l,
		    7591363728605668117l,
		    227743280468209272l,
		    3815359581987719752l,
		    240831188333789404l,
		    1682051551566226l,
		    7028911732181187415l,
		    8534901095561461575l,
		    604981729275990578l,
		    4379371367686136078l,
		    2561184379973031673l,
		    3251231714574439892l,
		    8507596701451728093l,
		    1479176915196229414l,
		    4596908701725205546l,
		    7434222118200184219l));
 
			int low = 1;
			int high = ar1.size() - 1;

			int random = rd.nextInt(high - low) + low;

			for (int j = 0; j < random; j++) {
				int n1 = rd.nextInt(ar1.size());
				subset1.add(ar1.get(n1));
				subset1Total = subset1Total.add(BigInteger.valueOf(ar1.get(n1)));
				ar1.remove(n1);
			}

			random = rd.nextInt(ar1.size() - 1) + 1;

			for (int j = 0; j < random; j++) {

				int n1 = rd.nextInt(ar1.size());
				subset2.add(ar1.get(n1));
				subset2Total = subset2Total.add(BigInteger.valueOf(ar1.get(n1)));
				ar1.remove(n1);
			}
			
			difference = (subset1Total.subtract(subset2Total)).abs();

			BigInteger lessThan = new BigInteger("10000000000000");

			if (difference.compareTo(lessThan) < 0) {
				System.out.println("Difference: " + difference);
				System.out.println("Subset1: " + subset1);
				System.out.println("Subset2: " + subset2);
			}

		}
	}
}