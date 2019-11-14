
import java.util.*;

public class arraysum {

	static void check(int arr[] , int num) {

		int l = arr.length;

		for(int i=0;i<l;i++)
		{

			int temp=0;

			for(int j=i;j<l;j++) {


				temp=temp+arr[j];

				if(temp==num)
				{
					System.out.println("Starting index is : " + i + ",");
					System.out.println("Ending index is : " + j);
					break;
				}
			}

		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements");

		int n = sc.nextInt();


		int arr[] = new int[n];

		System.out.println("Enter the elements ");

		for(int i=0;i<n;i++)
		{

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Number");

		int Number= sc.nextInt();

		check(arr,Number);


	}


}
