package var;

public class ShortCircuit {
	public static void main(String[] args) {
		int a=10, b=10;
		if(a++ == 10 && b++ == 10)
		{
			System.out.println(a+"   "+b);
		}		
	}
}
