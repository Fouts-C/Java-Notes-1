public class ArrayUtil {
    
    public int[] copy(int[] arr){
       
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public int[] expand(int[] arr, int size){

        if(size < arr.length){
            return arr;
        }

        int[] newArr = new int[size];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public boolean find(int[] arr, int value){

        for(int num : arr){
            if(num == value){
                return true;
            }
        }
        return false;
    }

    public boolean isFalsey(int[] arr){

        boolean flag = true;
        for(int num : arr){
            if(arr[num] != 0){
                flag = false;
            }
        }
        return flag;
    }
}
