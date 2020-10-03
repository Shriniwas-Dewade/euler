public class prob14
{
	public static void main(String args[]){
		final int i = 1000000;
		long num = 2;
		long tmp = 0;
		int count;
		long max = 0;
		long ans = 0;
		
		for(;num<=i;num++){
			count = 1;
			tmp = num;
			while (tmp > 1){
				if(tmp % 2 == 0){
					tmp /= 2;
					count++;
				}
				else {
					tmp = (3 * tmp) + 1;
					count++;
				}
			}
			if (count > max){
				ans = num;
	 			max = count;
				count = 1;
			}
		}
		System.out.println(ans + " has " + max + " terms.");
		System.out.println("finish");
	}
}
