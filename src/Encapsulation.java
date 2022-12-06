
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("Sally");;
		System.out.println(student.getFirstName());
		student.setPhoneNumber("406-274-608");
		student.introduce();
		
		
		Rectangle rec = new Rectangle(10.0,15.0);
		System.out.println(rec.getArea());
		rec.setLength(10.);
		System.out.println(rec.getArea());
		//Access Modifiers:
		//public: Accessible EVerywhere
		//protected: Only Accessible within the same class, package & all subclass
		//private: Only accessible in the class
		//No Modifier same as protected but not accessible in a sub class in a different package 
	}

}
