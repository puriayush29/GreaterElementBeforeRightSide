import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int flag=0;
		int arr[] =  new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++)
		{
		    for(int j=i+1;j<size;j++){
		    if(arr[i]>=arr[j])
		    {
		       flag=1; 
		    }
		    else {
		        flag=0;
		        break;
		    }
		    
		    }
		    if(flag==1)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	if(flag==0)
	{
	    System.out.println("No element is greater than or equal to all the right side of elements..");
	}
	}
}
