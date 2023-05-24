package OopsTest;

public class UseTelephone {
	public static void main(String[] args) {
		Telephone tel1=new Telephone("SONY",100,"black",true);
		Telephone tel2=new Telephone("LENOVA",200,"GREEN",false);
		Telephone tel3=new Telephone("REDMI",300,"RED",true);
		
		Telephone [] tels= {tel1,tel2,tel3};
				for( Telephone y :tels) {
			if(y.getWireless()==false) {
				System.out.println(y);
				
		
		}
		}
	}
		
		

}
