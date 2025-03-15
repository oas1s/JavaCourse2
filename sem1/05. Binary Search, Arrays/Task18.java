import java.util.Arrays;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int findInt = scanner.nextInt();
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,findInt,0,arr.length-1));
    }
    public static int binarySearch(int[] arr,int value,int begin, int end){
        int mid = (begin+end)/2;
        if (arr[mid] == value){
            return mid;
        }
        if (value > arr[mid]){
           return binarySearch(arr,value,mid+1,end);
        }else{
            return binarySearch(arr, value,begin,mid-1);
        }

    }


}
