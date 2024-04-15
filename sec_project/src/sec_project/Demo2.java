package sec_project;
import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		Scanner scan=new Scanner(System.in);
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) 
			{
				arr[i][j]=scan.nextInt();
			}
	}
		//System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
}
}