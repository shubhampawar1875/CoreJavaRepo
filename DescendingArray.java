public class DescendingArray {
    public static void main(String args[]) {
        int arr[] = new int[] {1, 5, 3, 4, 2};
        int i, j;
        int temp = 0;
        System.out.println("Original Array: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Descending Order: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
    
}
