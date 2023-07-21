public class SumArray {
    public static void main(String args[]) {
        int arr[] = new int[] {1, 2, 3, 4, 5};
        int i, sum = 0;
        for(i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements of array are: " + sum);
    }
    
}
