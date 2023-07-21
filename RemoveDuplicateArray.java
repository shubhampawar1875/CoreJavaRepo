public class RemoveDuplicateArray {
    public static void main(String args[]) 
    {
        int arr[] = new int[] {1, 2, 3, 8, 2, 2, 2, 5, 1};
        int i, j;
        int visited = -1;
        System.out.println("Original Array: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for(i=0;i<arr.length;i++)
        {
            
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[j] = visited;
                }
            }
           
        }
        System.out.println("Array after removing duplicate elements: ");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] != visited)
            {
                System.out.print(arr[i] + "  ");
            }
        }
    }
    
}
