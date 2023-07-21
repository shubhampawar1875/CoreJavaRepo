import java.util.Scanner;
public class ReverseArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, n;
    int arr[] = new int[10];
    System.out.println("Enter number of elements you want to add into array: ");
    n = sc.nextInt();
    System.out.println("Enter elements of array: ");
    for(i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();

    }

    System.out.println("Array is: ");
    for(i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }

    System.out.println("Array is reverse order: ");
    for(i=n-1;i>=0;i--)
    {
        System.out.print(arr[i] + " ");
    }
  }    
}
