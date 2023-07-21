class MinMethodArray {

    static void Min(int arr[])
    {
        int min = arr[0];
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.print(min);
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 2, 1};
        Min(arr);
    }
}