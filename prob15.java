public class prob15
{
	public static void main(String args[]){
		long arr[][] = new long[21][21];
		
		byte i,j;
		
		for(i = 0;i<20;i++){
			arr[i][20] = 1;
			arr[20][i] = 1;
		}
		
		for(i=19;i>=0;i--){
			for(j=19;j>=0;j--){
				arr[i][j] = arr[i+1][j] + arr[i][j+1];
			}
		}
		
		System.out.println(arr[0][0]);
	}
}
