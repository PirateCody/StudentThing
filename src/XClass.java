
public class XClass {
	
	private long id;
	private String name;
	private float creditVal;
	private boolean coreClass;
	
	public XClass(long id, float creditVal, boolean coreClass, String name)
	{
		this.id = id;
		this.creditVal = creditVal;
		this.name = name;
		this.setCoreClass(coreClass);
	}
	
	public XClass()
	{
		this(000001, 1.0f, false, "SampleClass");
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public float getCreditVal() {
		return creditVal;
	}

	public boolean isCoreClass() {
		return coreClass;
	}

	public void setCoreClass(boolean coreClass) {
		this.coreClass = coreClass;
	}
	


}
