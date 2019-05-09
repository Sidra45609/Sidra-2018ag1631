 class person
{
    private String name;
    private int age;
 public void setName( String n);
 {
    
     name=n;
	 }
	 
	 public void getName()
	 {
	 
	 return(name);
	 }
	 public void setAge(int m );
	 {
	 
	 age=m;
	 }
	 
	 public void getName()
	 {
		 return( name);
		 
	 }
	 
} 
	class student extends person
	{
	private int rolno;
	public void setRolno(int g);
	{
	rolno=g;
	}
	
	public void getRolno()
	{
		
		
		return(rolno);
	}
	
	
	
	
	
	 
}
public class Example
{
	
	public static void main(String args[])
	{
		
		student s =new student();
		s.setName("zaman");
		s.setAge(20);
		s.setRolno(6);
		System.out.println(s.setName() );
		System.out.println(s.setAge() );
		System.out.println(s.setRolno() );
		
		
	}
	
	
}