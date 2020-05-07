package task2.main;

import task2.bean.Payment;
import task2.logic.PaymentLogic;
import task2.view.PaymentView;

public class DemoPayment {
	public static void main(String [] args) {
		PaymentLogic logic = new PaymentLogic();
		PaymentView view = new PaymentView();
		
		Payment pay1 = new Payment("������ �������"); 
		Payment pay2 = new Payment("������ �������"); 
	
		logic.setPayment(pay1);
		logic.setPayment(pay2);
		
		view.printCheque(pay1);
		view.printCheque(pay2);
	}
}
