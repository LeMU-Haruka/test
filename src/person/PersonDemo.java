package person;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonDemo {

	public static void printAll(Person[]arr){

		for(int i = 0;i<arr.length;i++){
			if(arr[i] !=null){
				System.out.print("["+i+"]");
				System.out.println(arr[i].toString());
			}
		}
	}

	private static String getTodaysDay() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		Date d = new Date();
		String dayOfWeek = sdf.format(d);
		return dayOfWeek;
		
	}

	public static void main(String[] args) {

		Person [] p = new Person[4];
		p[0]=new Person("joe",25,"New York","212-555-1212");
		p[1]=new Student("jill",27,"Chicago","312-555-1212",4.0);
		p[3]=new Employee("bob",29,"Boston","617-555-1212",100000.0);

		printAll(p);

		Person test = null;
		if(getTodaysDay().equalsIgnoreCase("Tuesday"))
			test=p[1];
		else
			test=p[3];
		System.out.println("That person is "+test.toString());
		
		if(p[3] instanceof Employee)
			((Employee)p[3]).raise(0.04);
		System.out.println("The salary of "+((Employee) p[3]).getName()+" is $"+((Employee) p[3]).getSalary());
	}

}
