
public class LinearSearch{
    public static void main(String[] args){
        
        int arr[] = {2,5,8,3,4,9,7,6,0};
        int target = 1;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[] array, int target){

        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}