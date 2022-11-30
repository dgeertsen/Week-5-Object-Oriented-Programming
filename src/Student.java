
public class Student {
	
	static int numberOfStudents;
	String firstName;
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	
	
	
	
	//Constructors
	public Student(String firstName,String lastName,String phoneNumber,int gradeLevel) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.gradeLevel=gradeLevel;
	}
	public Student(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;

	}
	public Student() {}
	
	
	//Methods
	public  void introduce() {
		System.out.println("My name is, "+firstName+" "+lastName);
		System.out.println("I am in grade "+gradeLevel);
		System.out.println("My phoneNumber is "+phoneNumber);
	}
	
	
}
