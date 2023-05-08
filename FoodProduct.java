package NProductManagement;

public class FoodProduct extends Product {
	private String date;
	private String expiredDate;

	public FoodProduct() {
	}

	public FoodProduct(int code, String name, String make, double price, String date, String expiredDate) {
		super(code, name, make, price);
		this.date = date;
		this.expiredDate = expiredDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}
}
