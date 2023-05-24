package OopsTest;

public class UseAc {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		String n1=a[0];
		int n2=Integer.parseInt(a[1]);
		float n3=Float.parseFloat(a[2]);
		Compressor c=new Compressor(n1,n2,n3);
		
		String[] b=args[1].split(",");
		String n4=b[0];
		int n5=Integer.parseInt(b[1]);
		boolean n6=Boolean.parseBoolean(b[2]);
		Ac d=new Ac(n4,n5,n6,c);
		System.out.println(d);
	}

}
