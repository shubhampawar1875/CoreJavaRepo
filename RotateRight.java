public class RotateRight {
    public static void main(String args[]) {
        int arr[] = new int[] {1, 2, 3, 4, 5};
        int i, j;
        int n = 3;
        System.out.println("Original Array is: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            int last;
            last = arr[arr.length - 1];
            for(j=arr.length - 1;j>0;j--)
            {
                arr[j] = arr[j-1];
            }
            arr[j] = last;
        }
        for(i=0;i<arr.length;i++)
        {
        System.out.print(arr[i] + "  ");
        }
    }
    
}
