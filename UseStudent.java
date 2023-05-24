package OopsTest;

public class UseStudent {
	public static void main(String[] args) {
		Student a=new Student();
		a.setName ("jajina");
		a.SetSection('B');
		a.isRegular=true;
		a.std=10;
		
		System.out.println("NAME= "+a.getName()+" "+"SECTION= "+a.getSection());
		System.out.println("ISREGULAR= "+a.isRegular+" "+"STD= "+a.std);
		
	}

}
