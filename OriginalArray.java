import java.util.Scanner;
public class OriginalArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        int arr[] = new int[10];
        System.out.println("Elenter number of elements you want to add: ");
        n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
