

@Configuration 
public class App {
	
	@Bean
	public Student Mystudent() {
		Student student1 = new Student();
		student1.id("M2");
		student1.firstName("Trudy");
		student1.surname("Jones");
		return student1;
	}

	@Bean
	public Student Mystudent2() {
		Student student2 = new Student();
		student2.id("M6");
		student2.firstName("Andy");
		student2.surname("Brown");
		return student2;
	}

	@Bean
	public Student Mystudent3() {
		Student student3 = new Student();
		student3.id("M7");
		student3.firstName("Morris");
		student3.surname("Smith");
		return student3;
	}

	@Bean
	public Student Mystudent4() {
		Student student4 = new Student();
		student4.id("M8");
		student4.firstName("Jane");
		student4.surname("Andrews");
		return student4;
	}

}
