public class AscendingArray {
    public static void main(String args[]) 
    {
        int arr[] = new int[] {5, 6, 3, 2, 4};
        int i, j;
        int temp = 0;
        System.out.println("Original array is: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        System.out.println("Ascending Order: ");
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + "  ");
            }
    }
    
}
