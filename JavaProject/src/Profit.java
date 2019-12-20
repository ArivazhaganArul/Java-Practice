import java.util.*;
public class Profit{

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased :");
		int dozenCount = v.nextInt();
		
		System.out.println("Enter the price per dozen  :");
		int pricePerDozen = v.nextInt();
		 
		System.out.println("Enter the selling price of 1 toy :");
		int sellPrice = v.nextInt();
		
		Show s = new Show();
		float profit = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);

		System.out.printf("percentage::%.2f",profit);

	}

} 
				 
