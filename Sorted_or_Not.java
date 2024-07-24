public class Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,14,12};
        System.out.println(Sorted(arr,0));
    }

    public static boolean Sorted(int[] arr, int index) {
        if (index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && Sorted(arr, index+1);
    }
}
