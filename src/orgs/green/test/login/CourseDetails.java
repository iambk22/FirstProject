package orgs.green.test.login;

public class CourseDetails {
	private void jUnit() {
		
		System.out.println("Junit Course Started");

	}
	private void testNg() {
		
       System.out.println("TestNg course not started");
       
    }
	private void cucumber() {
		System.out.println("Cucumber Course Started");

	}
	public static void main(String[] args) {
		CourseDetails s = new CourseDetails();
		System.out.println("Just Checking");
		
		s.jUnit();
		s.testNg();
		s.cucumber();
	}

}

