package sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class InsertSort {
    private int[] arr;

    /**
     * 构造器
     * @param arr 随机数组
     */
    public InsertSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * 获取排序后的结果数组
     * @return
     *
     */
    public int[] getNewArr(){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    int target = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = target;
                 }else {
                    break;
                }
            }
        }

        return arr;
    }

    @Override
    public String toString() {
        return "InsertSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,23,73,28,51,31,5,32,532,5,61,2,6,7,33};
        InsertSort insertSort = new InsertSort(arr);
        /*进行排序*/
        insertSort.getNewArr();
        System.out.println(insertSort.toString());

    }
}
