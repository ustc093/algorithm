package leetcode.array;

/**
 * @author gaozhen@cloudwalk.cn
 * 2020年01月02日 17:31
 */
public class BinarySearch {
    public static int search(int[] sortedArray, int target) {
        int i = 0;
        int j = sortedArray.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sortedArray[mid] == target) {
                return mid;
            } else if (sortedArray[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
    public static int left(int[] sortedArray,int target){
        int i = 0;
        int j = sortedArray.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sortedArray[mid] == target) {
                j = mid - 1;
            } else if (sortedArray[mid] < target) {
                i = mid + 1;
            } else if(sortedArray[mid] > target){
                j = mid - 1;
            }
        }
        if(i<sortedArray.length){
            return i;
        }
        return -1;
    }

    public static int right(int[] sortedArray,int target){
        int i = 0;
        int j = sortedArray.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sortedArray[mid] == target) {
                i = mid + 1;
            } else if (sortedArray[mid] < target) {
                i = mid + 1;
            } else if(sortedArray[mid] > target){
                j = mid - 1;
            }
        }
        if(j>0){
            return j;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] sortedArray = new int[]{1,3,5,7,12,12,12,12,13};
        System.out.println(left(sortedArray, 12)+","+right(sortedArray, 12));

        StringBuilder sb1  = new StringBuilder('c');
        StringBuilder sb2 = new StringBuilder();
        sb1 = sb2;
        System.out.println(sb1.toString());
    }
}
