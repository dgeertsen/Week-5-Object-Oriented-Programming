

public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		
		Employee salary = new SalariedEmployee("Tom","Hanks",2500.0);
		Employee hourly = new HourlyEmployee("Robin","Williams",15.0,75.5);
		Employee manager = new Manager("Stan","Lee",4500,15.5);
		
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		
		
		
		

	}

}
