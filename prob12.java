public class prob12
{
	public static void main(String args[]){
		int num = 0;
		int i = 1;
		while(check(num) < 500){
			num += i;
			i++;
		}
		
		System.out.println(num);
	}
	
	public static int check(int n){
		int k = 0;
		int sq = (int) Math.sqrt(n);
		
		for(int i=1;i<=sq;i++){
			if(n % i == 0){
				k +=2;
			}
		}
		
		if(sq * sq == n){
			k--;
		}
		return k;
	}
}
