import java.util.Scanner;

public class ThirdHighestElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

      int thirdHN=findThirdHighestNumber(arr, n);
      System.out.println("Third Highest Element: "+ thirdHN);
	}

	private static int findThirdHighestNumber(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int first=arr[0];
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				third=second;
				second=first;
				first=arr[i];
			} else
			if(arr[i]>second && arr[i] != first)
			{
				third=second;
				second=arr[i];
			} 
			else if(arr[i]>third && arr[i] != first && arr[i] != second)
			 {
				 third=arr[i];
			 }				
		}
		
		return third;
	}

}
