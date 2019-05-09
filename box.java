 class Box
{
	public int a,b;
Box( int m, int n)
{
a=m;
b=n;

}
void showData()
{
	
	
	System.out.println(a);
	System.out.println(b);
	
	
}

public static void main (String args[])

{

Box b1 = new Box(13,14);
b1.showData();

}
}