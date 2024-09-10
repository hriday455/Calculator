package Other;

public class Factorial {

	
	public void getfactorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
