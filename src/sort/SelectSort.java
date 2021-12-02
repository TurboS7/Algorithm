package sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    private int[] arr;

    /**
     * 构造器
     * @param arr 随机数组
     */
    public SelectSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * 获取排序后的结果数组
     * @return
     */
    public int[] getNewArr(){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];/*定义一个最小的数，让它等于数组的第一位*/
            int index = i; /*记录这个数的下标*/
            /*循环右侧无序的数组，找出最小值并记录下标*/
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<min){
                    min = arr[j];/*获取最小值*/
                    index = j;/*获取最小值下标*/
                }
            }
            int target = arr[i];/*保存当前i位置的值*/
            arr[i] = min;/*将当前位置的值赋值为右侧无序数组中最小的值*/
            arr[index] = target;/*将原来最小的值的位置赋值为之前i位置的值*/
        }
    
        return arr;
    }

    @Override
    public String toString() {
        return "SelectSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,23,73,28,51,31,5,32,532,5,61,2,6,7,33};
        SelectSort selectSort = new SelectSort(arr);
        /*进行排序*/
        selectSort.getNewArr();
        System.out.println(selectSort.toString());

    }
}
