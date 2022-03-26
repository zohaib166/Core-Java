package var;

import java.math.BigInteger;

public class BigFactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BigFact.factorial(100));
	}

}

class BigFact {
	public static String factorial(int num) {
		BigInteger bnum = BigInteger.valueOf(1);
		while(num>0) {
			bnum = bnum.multiply(BigInteger.valueOf(num));
			num--;
		}
		
		return bnum.toString();
		
	}
}
