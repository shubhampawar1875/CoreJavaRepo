public class RotateArray {
    public static void main(String args[]) {
        int arr[] = new int[] {1, 2, 3, 4, 5};
        int i, j;
        int n = 3;
        System.out.println("Enter Original Array: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

        for(i=0;i<n;i++)
        {
            int first;
            first = arr[0];
            for(j=0;j<arr.length - 1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println("Left Rotation of an array is: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
}