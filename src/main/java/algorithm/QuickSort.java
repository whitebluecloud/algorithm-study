package algorithm;


public class QuickSort {

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
    }

    private static void partition(int[] arr, int start, int end) {
        int pivot = (start + end) / 2;

        while(start <= end){
            while(arr[start] < arr[pivot]) start++;
            while(arr[end] > arr[pivot]) end--;
            if (start <= end) {
            }
        }




    }
    int[] left;
    int[] right;

    public int[] solution(int[] A){


        return new int[]{};
    }
}
