package task2.logic;

import java.util.Scanner;

import task2.bean.Payment;
import task2.bean.Payment.Product;

public class PaymentLogic {
public Payment setPayment(Payment pay) {
		
		@SuppressWarnings("resource")
		Scanner br = new Scanner(System.in);
		
		System.out.println("������� ���������� ���������");
		
		int dim = br.nextInt(); 
		
		Product[] product = new Product[dim];
		
		for(int i = 0; i < dim; i++){

			System.out.println("����� " + (i+1) + ": "); 
			System.out.print("������������: ");
			String str_name = br.next(); 
			System.out.print("����: "); 
			int prod_cost = br.nextInt();

			product[i] = pay.new Product(str_name, prod_cost); 
			pay.setTotal(pay.getTotal() + product[i].getPrice());

		}
		
		pay.setProduct(product);
		
		return pay;
	}
}
