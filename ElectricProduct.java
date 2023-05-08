package NProductManagement;

public class ElectricProduct extends Product {

	private int guaranty;
	private double voltage, power;

	public ElectricProduct() {
	}

	public ElectricProduct(int code, String name, String make, double price, int guaranty, double voltage,
			double power) {
		super(code, name, make, price);
		this.guaranty = guaranty;
		this.voltage = voltage;
		this.power = power;
	}

	public int getGuaranty() {
		return guaranty;
	}

	public void setGuaranty(int guaranty) {
		this.guaranty = guaranty;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
}
