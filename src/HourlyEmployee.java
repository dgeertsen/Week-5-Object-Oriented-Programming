
public class HourlyEmployee extends Employee {

	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) {
		super(firstName, lastName, pay);
		// TODO Auto-generated constructor stub
		this.hoursWorked=hoursWorked;
	}


	public double hoursWorked;
	
	
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return this.getPay()*hoursWorked;
	}
	
	
	
	
	
	
}
