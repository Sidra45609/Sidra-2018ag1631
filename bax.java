public class bax
{

private int a,b;

 void setData(int m, int n)
{
a=m;

b=n;
}

 void showData()
{
                    System.out.println("the value of a="+a);
                    System.out.println("the value of b="+b);


}
void sum(bax o1,bax o2)

{
	
	this.a=o1.a+o2.a;
	this.b=o1.b+o2.b;
}



public static void main(String []args)
{


bax obj1=new bax();
bax obj2=new bax();
obj1.setData(3,6);
obj2.setData(4,8);
bax obj3=new bax();
obj3.sum(obj1,obj2);
obj3.showData();
}

}