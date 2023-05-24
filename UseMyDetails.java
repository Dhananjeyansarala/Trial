package OopsTest;

public class UseMyDetails {
	public static void main(String[] args) {
		
		MyDetails a=new MyDetails("DHANANJEYAN",25);
		a.setMarried(false);
		a.setWeight(70);
		MyDetails [] det= {a};
		
		for( MyDetails y : det) {
		
		System.out.println(y);
		System.out.println("NAME= "+y.getName()+" "+"AGE= "+y.getAge());
		}
		
		
		
		
		
	}

}
