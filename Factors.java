package Other;

public class Factors {

	
	public static void getFactors(int a){
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
	}

}
