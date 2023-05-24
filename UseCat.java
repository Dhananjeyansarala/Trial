package OopsTest;

public class UseCat {
	public static void main(String[] args) {
		Cat c1=new Cat("guster","black");
		c1.age=10000;
		c1.isMale=true;
		
		Cat c2=new Cat("bruder","white");
		c2.age=20000;
		c2.isMale=false;
		Cat [] cats= {c1,c2};
		for( Cat y :cats) {
			System.out.println("BREED="+y.breed+" "+"COLOUR="+y.colour);
			System.out.println("AGE="+y.age+" "+"ISMALE="+y.isMale);
		}
	}

}
