package OopsTest;

public class Ac {
	 private String brand;
	 private  int price;
	 private boolean isAutomatic;
	 private Compressor compressor;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean IsAutomatic() {
		return isAutomatic;
	}
	public void setIsAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public Compressor getCompressor() {
		return compressor;
	}
	public void setCompressor(Compressor compressor) {
		this.compressor = compressor;
	}
	public Ac(String brand, int price, boolean isAutomatic, Compressor compressor) {
		this.brand = brand;
		this.price = price;
		this.isAutomatic = isAutomatic;
		this.compressor = compressor;
	}
	public String toString() {
		return "Brand: "+brand+", "+"Price: "+price+", "+"isAutomatic: "+isAutomatic+", "+compressor;
	}
	 
	 

}
