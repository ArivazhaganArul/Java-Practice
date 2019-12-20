
public class Prod {

public Prod(long id, String productName, String supplierName) {
		super();
		this.id = id;
		ProductName = productName;
		SupplierName = supplierName;
	}
private long id;
private String ProductName;
private String SupplierName;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
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
}
