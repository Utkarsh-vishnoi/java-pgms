
public class Student {

	int rollNo, age;
	String course, name;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println("Name = " + st.name);
		System.out.println("Roll Number = " + st.rollNo);
		System.out.println("Course = " + st.course);
		System.out.println("Age = " + st.age);
	}
	
	Student() {
		age = 20;
		name = "SandmaN";
		rollNo = 26;
		course = "BCA";
	}

}
