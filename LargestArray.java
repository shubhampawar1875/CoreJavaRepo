public class LargestArray {

    static int getThirdLargest(int arr[], int a)
    {
        int temp = 0;
        for(int i = 0; i<a;i++)
        {
            for(int j = i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[a-3];
    }


    public static void main(String args[]) 
    {
        int a[] = {3, 5, 8, 9, 1};
        int arr[] = {4, 2, 8, 7, 5, 1, 10};

        System.out.println("Third Largest Element: " + getThirdLargest(a, 5));
        System.out.println("Third Largest Element: " + getThirdLargest(arr, 7));
    }
    
}
