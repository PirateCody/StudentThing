import java.util.ArrayList;

public class Student {
	
	private float gpa;
	private float numCredits = 0;
	private ArrayList<XClass> allClasses = new ArrayList<XClass>();
	private ArrayList<XClass> currEnrolledClasses = new ArrayList<XClass>();
	private ArrayList<XClass> passedClasses = new ArrayList<XClass>();
	private ArrayList<XClass> failedClasses = new ArrayList<XClass>();


	
	public void printAllClasses()
	{
		for(int i = 0; i < allClasses.size(); i++)
		{
			System.out.println(allClasses.get(i).getName());
		}
	}
	
	public void printEnrolledClasses()
	{
		for(int i = 0; i < currEnrolledClasses.size(); i++)
		{
			System.out.println(currEnrolledClasses.get(i).getName());		
		}
	}
	
	public void enroll(XClass course)
	{
		allClasses.add(course);
		currEnrolledClasses.add(course);
	}
	
	public void setClassPassed(XClass course)
	{
		passedClasses.add(course);
		this.numCredits += course.getCreditVal();
		if(currEnrolledClasses.contains(course))
		{
			currEnrolledClasses.remove(course);
		}
	}
	
	public void setClassFailed(XClass course)
	{
		failedClasses.add(course);
		if(currEnrolledClasses.contains(course))
		{
			currEnrolledClasses.remove(course);
		}
	}
	

}
