package in.vinayit.entity;

public class Main {

	public static void main(String[] args) {
		Employee e =new Employee();
	     e.setFName("VINAY REDDY");
	     e.setLName("KOPPULA");
	     
	     String fName = e.getFName();
	     String lName = e.getLName();
	     Integer id = e.getId();
	     int hashcode = e.hashCode();
	     String s= null;
	     s.toLowerCase();
	     
	     System.out.println(e);
	     
	     Main m = new Main();
	    int sum = m.m1(10, 20);
	     System.out.println("sum : "+sum);
	     
		
	}
	public int m1(int a,int b) {
		int sum = a+b;
		return sum;
	}
}
