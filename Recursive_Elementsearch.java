public class Recursive_Elementsearch {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Search(arr,10,0));
    }
    public static int Search(int[] arr, int target, int index){
        if (arr[index] == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return Search(arr,target,index+1);
    }
}
