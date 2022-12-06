
public class SalariedEmployee extends Employee {



	
	
	
	
		public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
		// TODO Auto-generated constructor stub
	}




		
		
		
		@Override
		public double calculatePay() {
			// TODO Auto-generated method stub
			return this.getPay()*80;
		}
		
		
}
