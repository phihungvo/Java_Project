package NProductManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Product> products = new ArrayList<Product>();

	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("Ops 1: Tạo sản phẩm thường");
			System.out.println("Ops 2: Tạo sản phẩm điện");
			System.out.println("Ops 3: Tạo sản phẩm gốm sứ");
			System.out.println("Ops 4: Tạo sản phẩm thực phẩm");
			System.out.println("Ops 5: Liệt kê danh sách sản phẩm");
			System.out.println("Ops 6: Yêu cầu nhập mã sản phẩm. Sau đó, hiển thị thông tin sản phẩm");
			System.out.println("Ops 7: Yêu cầu nhập thông tin sản phẩm cần chỉnh sửa");
			System.out.println("Ops 8: Yêu cầu nhập mã sản phẩm. Sau đó, xóa sản phẩm");
			System.out.println("Ops 9: Thoát chương trình");

			System.out.print("Hãy chọn một phép toán: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				createProduct();
				break;
			case 2:
				createElectric();
				break;
			case 3:
				createCeramic();
				break;
			case 4:
				createFood();
				break;
			case 5:
				listProducts();
				break;
			case 6:
				getProductByCode();
				break;
			case 7:
				updateProduct();
				break;
			case 8:
				deleteProduct();
				break;
			case 9:
				System.out.println("Chương trình đã kết thúc!");
				break;
			default:
				System.out.println("Phép toán không hợp lệ! Hãy chọn lại.");
			}
		} while (choice != 9);
	}

// Create Product Method
	public static void createProduct() {
		Product product = new Product();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập mã sản phẩm: ");
		product.setCode(scanner.nextInt());

		System.out.print("Nhập tên sản phẩm: ");
		product.setName(scanner.next());

		System.out.print("Nhà sản xuất: ");
		product.setMake(scanner.next());

		System.out.print("Nhập giá sản phẩm: ");
		product.setPrice(scanner.nextDouble());

		products.add(product);

		System.out.println("Sản phẩm thường đã được tạo thành công!");
	}

	public static void createElectric() {
		ElectricProduct electric = new ElectricProduct();

		System.out.print("Nhập mã sản phẩm: ");
		electric.setCode(scanner.nextInt());

		System.out.print("Nhập tên sản phẩm: ");
		electric.setName(scanner.next());

		System.out.print("Nhà sản xuất: ");
		electric.setMake(scanner.next());

		System.out.print("Nhập giá sản phẩm: ");
		electric.setPrice(scanner.nextDouble());

		System.out.print("Thời gian bảo hành: ");
		electric.setGuaranty(scanner.nextInt());

		System.out.print("Điện áp: ");
		electric.setVoltage(scanner.nextDouble());

		System.out.print("Công suất: ");
		electric.setPower(scanner.nextDouble());

		products.add(electric);

		System.out.println("Sản phẩm điện đã được tạo thành công!");
	}

	public static void createCeramic() {
		CeramicProduct ceramic = new CeramicProduct();

		System.out.print("Nhập mã sản phẩm: ");
		ceramic.setCode(scanner.nextInt());

		System.out.print("Nhập tên sản phẩm: ");
		ceramic.setName(scanner.next());

		System.out.print("Nhà sản xuất: ");
		ceramic.setMake(scanner.next());

		System.out.print("Nhập giá sản phẩm: ");
		ceramic.setPrice(scanner.nextDouble());

		System.out.print("Loại: ");
		ceramic.setType(scanner.next());

		products.add(ceramic);

		System.out.println("Sản phẩm gốm sứ đã được tạo thành công!");
	}

	public static void createFood() {
		FoodProduct food = new FoodProduct();

		System.out.print("Nhập mã sản phẩm: ");
		food.setCode(scanner.nextInt());

		System.out.print("Nhập tên sản phẩm: ");
		food.setName(scanner.next());

		System.out.print("Nhà sản xuất: ");
		food.setMake(scanner.next());

		System.out.print("Nhập giá sản phẩm: ");
		food.setPrice(scanner.nextDouble());

		System.out.print("Ngày sản xuất (dd/MM/yyyy): ");
		food.setDate(scanner.next());

		System.out.print("Ngày hết hạn (dd/MM/yyyy): ");
		food.setExpiredDate(scanner.next());

		products.add(food);

		System.out.println("Sản phẩm thực phẩm đã được tạo thành công!");
	}

	public static void listProducts() {
		System.out.println("Danh sách sản phẩm:");
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}

	public static void getProductByCode() {
		System.out.print("Nhập mã sản phẩm: ");
		int code = scanner.nextInt();

		for (Product product : products) {
			if (product.getCode() == code) {
				System.out.println(product.toString());
				return;
			}
		}

		System.out.println("Không tìm thấy sản phẩm với mã " + code);
	}

	public static void updateProduct() {
		System.out.print("Nhập mã sản phẩm: ");
		int code = scanner.nextInt();

		for (Product product : products) {
			if (product.getCode() == code) {
				System.out.print("Tên sản phẩm (" + product.getName() + "): ");
				String name = scanner.next();
				if (!name.equals("")) {
					product.setName(name);
				}

				System.out.print("Nhà sản xuất (" + product.getMake() + "): ");
				String make = scanner.next();
				if (!make.equals("")) {
					product.setMake(make);
				}

				System.out.print("Giá sản phẩm (" + product.getPrice() + "): ");
				double price = scanner.nextDouble();
				if (price != 0.0) {
					product.setPrice(price);
				}

				if (product instanceof ElectricProduct) {
					ElectricProduct electric = (ElectricProduct) product;

					System.out.print("Thời gian bảo hành (" + electric.getGuaranty() + "): ");
					int guaranty = scanner.nextInt();
					if (guaranty != 0) {
						electric.setGuaranty(guaranty);
					}

					System.out.print("Điện áp (" + electric.getVoltage() + "): ");
					double voltage = scanner.nextDouble();
					if (voltage != 0.0) {
						electric.setVoltage(voltage);
					}

					System.out.print("Công suất (" + electric.getPower() + "): ");
					double power = scanner.nextDouble();
					if (power != 0.0) {
						electric.setPower(power);
					}
				} else if (product instanceof CeramicProduct) {
					CeramicProduct ceramic = (CeramicProduct) product;

					System.out.print("Loại (" + ceramic.getType() + "): ");
					String type = scanner.next();
					if (!type.equals("")) {
						ceramic.setType(type);
					}
				} else if (product instanceof FoodProduct) {
					FoodProduct food = (FoodProduct) product;

					System.out.print("Ngày sản xuất (" + food.getDate() + "): ");
					String date = scanner.next();
					if (!date.equals("")) {
						food.setDate(date);
					}

					System.out.print("Ngày hết hạn (" + food.getExpiredDate() + "): ");
					String expiredDate = scanner.next();
					if (!expiredDate.equals("")) {
						food.setExpiredDate(expiredDate);
					}
				}

				System.out.println("Sản phẩm đã được cập nhật thành công!");
				return;
			}
		}

		System.out.println("Không tìm thấy sản phẩm với mã " + code);
	}

	public static void deleteProduct() {
		System.out.print("Nhập mã sản phẩm: ");
		int code = scanner.nextInt();

		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product.getCode() == code) {
				products.remove(i);
				System.out.println("Sản phẩm đã được xóa thành công!");
				return;
			}
		}

		System.out.println("Không tìm thấy sản phẩm với mã " + code);
	}
}
