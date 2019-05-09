class Buble
{

public static void main(String args[])

{


int arr[]={99,-10,30,1000,67,20,1100, 200, 50,60};

int i,j,t;
int size=10;
System.out.print("Orignal arry is:");
for(int a=0; a<size; a++)


System.out.print(" "+ arr[a]);
System.out.println();



System.out.print("Bubble sort");


for(i=1; i<size; i++)
for(j=size-1; j>i ; j--){
if(arr[j-1]>arr[j])
{
t=arr[j-1];
arr[j-1]=arr[j];
arr[j]=t;
}
}
System.out.println("Sorted arry is:");
for(int b=0; b<size; b++)
System.out.print( " " + arr[b]);






}



}