public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(findIndex(arr, 11));
        System.out.println(findIndexRecursion(arr,9,0,9));
    }

    public static int findIndexRecursion(int[] arr, int find_num, int low, int hight) {
        int middle =(low+hight)/2;
        if(find_num>arr[middle]){
           return findIndexRecursion(arr, find_num, low=middle+1, hight);
        }else if(find_num<arr[middle]){
            return findIndexRecursion(arr, find_num, low, hight=middle-1);
        }
        else {
            return middle;
        }
    }

    public static int findIndex(int[] arr, int find_num) {
        int low = 0;
        int hight = arr.length - 1;
        while (low <= hight) {
            int middle = (low + hight) / 2;
            if (find_num > arr[middle]) {
                low = middle + 1;
            } else if (find_num < arr[middle]) {
                hight = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
