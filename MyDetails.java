package OopsTest;

public class MyDetails {
	private String name;
	private int age;
	private boolean isMarried;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public MyDetails(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "MyDetails [isMarried=" + isMarried + ", weight=" + weight + "]";
	
	
		
	}
	
	

}
