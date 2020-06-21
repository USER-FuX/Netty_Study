package xyz.fuxnet.test;

/**
 * 功能描述: <br>
 *
 * @author FuX
 * @CalssName xyz.fuxnet.test.HelloWorld
 * @Date 2020/4/24 9:55
 * @Version V1.0
 */
public class HelloWorld {

    public static void main(String[] args) {

    }

    /**
     * 功能描述: <br>
     * 〈冒泡排序〉
     *
     * @Param: [arr]
     * @Return: int[]
     * @Author: FuX
     * @Date: 2020/6/21 15:47
     * @Update:
     */
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
