package in.vinayit.copy;

public class Demo {

	public static void main(String[] args) {
		int num =20;
		int count=0;
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=2;j<=i/2;j++) {
				if(i%j == 0) {
					count++;
					break;
				}
			}
		}
		if(count == 0) {
			System.out.println(i);
		}
	}
}
