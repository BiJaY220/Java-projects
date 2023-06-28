package Productweb;

public class Product {
	long id;
	String name;
	String manufacturer;
	String description;
	float price;
	boolean inStock;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", description="
				+ description + ", price=" + price + ", inStock=" + inStock + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public Product(long id, String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
	}
	public Product(String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
	}
	public Product(long id, String name, String manufacturer, float price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
}
