
public class Product {

	private long id;
	private String ProductName;
	private String SupplierName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Product() {
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	
	
	public Product (int id, String ProductName, String SupplierName) {
		super();
		this.id = id;
		this.ProductName = ProductName;
		this.SupplierName = SupplierName;
	}
	public void display()
	{
		System.out.println("Product id \n" + getId());
		System.out.println("Product Name is \n " +getProductName());
		System.out.println("Supplier Name is \n " +getSupplierName());
}
} 




