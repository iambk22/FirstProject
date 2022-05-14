package orgs.green.test.login;

public class CourseDetails {
	private void javaCourse() {
		
		System.out.println("Java Course Started");

	}
	private void pythonCourse() {
		
       System.out.println("Python course not started");
       
    }
	public static void main(String[] args) {
		CourseDetails s = new CourseDetails();
		System.out.println("Just Checking");
		
		s.javaCourse();
		s.pythonCourse();
		
	}

}

