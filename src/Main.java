
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XClass math = new XClass(0001, 0.25F, true, "Math");
		XClass music = new XClass(1001, 0.20F, false, "Music");
		
		math.setCoreClass(true);
		
		Student kevin = new Student();
		//System.out.println(math.getName());
		
		kevin.enroll(math);
		kevin.enroll(music);
		kevin.printAllClasses();
		kevin.printEnrolledClasses();
		
		kevin.setClassFailed(math);
		kevin.setClassPassed(music);

	}

}
