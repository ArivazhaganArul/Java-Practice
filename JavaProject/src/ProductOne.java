import java.util.Scanner;

public class ProductOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Prod pd = new Prod();
			
				System.out.println("Enter the product id");
				long id = Integer.parseInt(sc.nextLine());
				pd.setId(id);
				
				System.out.println("Enter the product name");
				pd.setProductName(sc.nextLine());
				
				System.out.println("Enter the supplier name");
				pd.setSupplierName(sc.nextLine());
				public void display()
				{
					System.out.println("Product id" + pd.getId());
					System.out.println("Product id" + pd.getProductName());
					System.out.println("Product id" + pd.getSupplierName());
			}
			
		}

		}
