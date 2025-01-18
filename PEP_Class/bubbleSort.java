package PEP_Class;

import java.util.Arrays;

//public class bubbleSort {
//    static void sorting(int [] arr)
//    {
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-i-1;j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }
//    public static void main(String args[]) {
//        int arr[] = {20,5,9,40,32,11};
//        sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

public class bubbleSort {
    public static int diff(int[] arr) {
        int max=0;
        int min=0;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
            else if (arr[min]>arr[i])
            {
                min=i;
            }
        }
        System.out.println(arr[max]);
        System.out.println(arr[min]);
        return (arr[max]-arr[min]);
    }
    public static void main(String args[]) {
        int num[] = {20,5,9,40,32,11};
        int result=diff(num);
        System.out.println(result);

    }
}
