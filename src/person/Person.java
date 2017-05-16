package person;


public class Person{
	private String name;
	private int age;
	private String address;
	private String phone;
	
	public Person(String n, int ag, String ad, String p){
		name = n;
		age = ag;
		address = ad;
		phone = p;	
	}
	
	public String toString(){
		return getName()+" "+getAge()+" "+getPhone();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
class Employee extends Person{
	private double salary;
	
	public Employee(String n, int ag, String ad, String p, double s){
		super(n,ag,ad,p);
		salary = s;
		
	}
	
	public String toString(){
		return super.toString()+" $"+getSalary();
	}

	public double getSalary() {
		return salary;
	}
	
	public void raise(double percentRaise){
		salary *=(1+percentRaise);
	}
}
	 class Student extends Person{
		
		private double gpa;
		
		public Student(String n, int ag, String ad, String p, double g){
			super(n,ag,ad,p);
			gpa = g;
		}
		
		public String toString(){
			return super.toString()+" "+getGpa();
		}

		public double getGpa() {
			return gpa;
		}
	}


