package Other;

public class Power {

	
	public static void pow(int num,int p) {
		int res=1;
		for(int i=1;i<=p;i++) {
			res=res*num;
		}
		System.out.println(res);
	}

}
