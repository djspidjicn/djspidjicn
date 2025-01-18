package PEP_Class;

public class prodOfMaxMin {
    public static boolean multi(int[] arr) {
        int min = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[max]<arr[i])
            {
                max=i;
            } else if (arr[min]>arr[i])
            {
                min=i;
            }
        }
        if(arr[max]%arr[min]==0)
        {
            return true;
        }
        else return false;
    }
    public static void main(String args[])
    {
        int [] arr={10,20,60,3};
        boolean result=multi(arr);
        System.out.println(result);

    }
}
