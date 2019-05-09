class A

{
public void fun(int a)
{
	
}	
	

}
 class B extends A
 {
	 
	 public void fun(int a)
	 {
		 super.fun(5);
		 
	 }
	 
	 
	 
 }
 public class test
 {
	 
	 public static void main(String args[])
	 
	 {
		 
		 B object= new B();
		 object.fun(3);
	 }
	 
	 
 }