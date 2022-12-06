
public class Manager extends Employee{
	private double bonusPercentage;

	public Manager(String firstName, String lastName, double pay, double bonusPercentage ) {
		super(firstName, lastName, pay);
		this.bonusPercentage=bonusPercentage;
	}


	public double calculatePay() {
		// TODO Auto-generated method stub
		return getPay()*80*bonusPercentage;
	}


	
	


}
