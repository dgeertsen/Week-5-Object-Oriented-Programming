
public class Player {
		private String name;
		private String position;
		private String specialty;
		
		//Constructors
		public Player(String name, String position,String specialty) {
			this.name = name;
			this.position = position;
			this.specialty = specialty;
		}
		public void describe() {
			System.out.println("Player: "+name+"\nPosition: "+position+"\nSpecialty: "+specialty);
		}

		//Setters
		public void setName(String name) {
			this.name = name;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		
		//Getters
		public String getName() {
			return name;
		}
		
		public String getPosition() {
			return position;
		}


		public String getSpecialty() {
			return specialty;
		}


}
