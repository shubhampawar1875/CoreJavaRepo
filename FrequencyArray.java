public class FrequencyArray {
    public static void main(String args[]) {
        int i, j;
        int arr[] = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};

        int fr[] = new int[arr.length];

        int visited = -1;
        for(i=0;i<arr.length;i++)
        {
            int count = 1;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;

                    fr[j] = visited;
                }
            }
            if(fr[i]!=visited)
            
                fr[i] = count;
            
        }
        for(i=0;i<fr.length;i++)
        {
            if(fr[i]!=visited)
            {
                System.out.println("  " +  arr[i] + "  |  " + fr[i] + " ");
            }
        }
    }
}