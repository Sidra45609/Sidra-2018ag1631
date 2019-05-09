class LengthDemo{

public static void main(String args[])
{

int list[]=new int[10];
int nums[]={1,2,3};
int table[][]= {
	
{1,2,3},{4,5},{6,7,8,9}
};
System.out.println("length of list is"+list.length);
System.out.println("length of nums is"+nums.length);
System.out.println("length of table is"+table.length);
System.out.println();

for(int i=0; i<list.length ;i++)
list[i]=i*i;

System.out.println("Here is a list");

for(int i=0; i<list.length;i++)

System.out.println(list[i]+ "");
}


}