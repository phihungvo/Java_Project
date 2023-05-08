package NProductManagement;

public class CeramicProduct extends Product {
	private String type;

	public CeramicProduct() {
	}

	public CeramicProduct(int code, String name, String make, double price, String type) {
		super(code, name, make, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
