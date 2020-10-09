import java.math.*;

public class prob16 {

	public static void main(String[] args) {

		long ans=0;
		char a[]= new char [1000];
		BigInteger two = BigInteger.valueOf(2);

		a= two.pow(1000).toString().toCharArray();

		for(int i=0;i<a.length;i++)
		{
			ans+= a[i]-'0';
		}

		System.out.println(ans);

	}

}
