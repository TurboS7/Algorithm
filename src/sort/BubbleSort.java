package sort;

import java.util.Arrays;

/**
 * 排序算法
 * 冒泡排序
 */
public class BubbleSort {
    private int[] arr;

    /**
     * 构造器
     * @param arr 随机数组
     */
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * 获取排序后的结果数组
     * @return
     */
    public int[] getNewArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                int taget = arr[j];
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = taget;
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,23,73,28,51,31,5,32,532,5,61,2,6,7,33};
        BubbleSort bubbleSort = new BubbleSort(arr);
        /*进行排序*/
        bubbleSort.getNewArr();
        System.out.println(bubbleSort.toString());

    }

}
