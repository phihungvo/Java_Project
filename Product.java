package NProductManagement;

import java.util.Scanner;

public class Product {
	private int code;
	private String make, name;
	private double price;

	public Product() {
	}

	public Product(int code, String make, String name, double price) {
		super();
		this.code = code;
		this.make = make;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
