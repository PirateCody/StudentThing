import java.util.ArrayList;

public class Student {
	
	private String fname;
	private String lname;
	private String mname; 
	private float gpa;
	private float numCredits = 0;
	private int id;
	private ArrayList<XClass> allClasses = new ArrayList<XClass>();
	private ArrayList<XClass> currEnrolledClasses = new ArrayList<XClass>();
	private ArrayList<XClass> passedClasses = new ArrayList<XClass>();
	private ArrayList<XClass> failedClasses = new ArrayList<XClass>();

	public Student(String fname, String mname, String lname, int id)
	{
		this.fname = fname;
		this.mname = mname;
		this.lname = lname; 
		this.id = id; 
	}
	
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public float getNumCredits() {
		return numCredits;
	}

	public void setNumCredits(float numCredits) {
		this.numCredits = numCredits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * Returns a string representation of a Student object in the form of:
	 * First Middle Last, ID, GPA
	 */
	@Override
	public String toString()
	{
		return this.getFname() + " " + this.getMname() + " " + this.getLname() + ", " + this.getId() + ", " + this.getGpa();
	}
	

}
