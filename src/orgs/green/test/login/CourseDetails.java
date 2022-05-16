package orgs.green.test.login;

public class CourseDetails {
	private void javaCourse() {
		
		System.out.println("Java Course Started");

	}
	private void jenkinsCourse() {
		
       System.out.println("Jenkins course not started");
       
    }
	private void gitCourse() {
		System.out.println("Git Course Started");

	}
	public static void main(String[] args) {
		CourseDetails s = new CourseDetails();
		System.out.println("Just Checking");
		
		s.javaCourse();
		s.jenkinsCourse();
		s.gitCourse();
	}

}

