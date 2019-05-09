 class person
{
    private String name;
    private int age;
 public void setName( String n)
 {
    
     name=n;
	 }
	 
	 public String getName()
	 {
	 
	 return(name);
	 }
	 public void setAge(int a )
	 {
	 
	 age=a;
	 }
	 
	 public int getAge()
	 {
		 return( age);
		 
	 }
	 
} 
	class student extends person
	{
	private int roll;
	public void setRoll(int r)
	{
	roll=r;
	}
	
	public int  getRoll()
	{
		
		
		return(roll);
	}
	
	
	
	
	
	 
}
public class Example
{
	
	public static void main(String args[])
	{
		
		student s =new student();
		s.setName("zaman");
		s.setAge(20);
		s.setRoll(6);
		System.out.println("Name=" + s.getName() );
		System.out.println("Age=" + s.getAge() );
		System.out.println("Roll=" + s.getRoll() );
		
		
	}
	
	
}