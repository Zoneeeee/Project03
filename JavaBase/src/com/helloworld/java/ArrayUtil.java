package com.helloworld.java;

/**
 * @author sunjiacheng
 * @create 2019-09-29-14:43
 */
public class ArrayUtil
{
    //求数组的最大值
    public int getMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
    //求数组的最小值
    public int getMin(int[] arr)
    {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
    //遍历数组元素
    public void printArray(int[] arr)
    {
        System.out.print("[" + "\t");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("]");
    }
    //求数组的平均数
    public int getAvg(int[] arr)
    {
        int sum = getSum(arr);
        return sum / arr.length;
    }
    //求数组的总和
    public int getSum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    //数组的反转
    public int[] reverse(int[] arr)
    {
        for(int x = 0, y = arr.length-1; x < y; x++, y--)
        {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }
    //实现数组的复制
    public int[] copy(int[] arr)
    {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //对数组进行排序
    public void sort(int[] arr, String desc)
    {
        if(desc == "asc") //从小到大
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if(arr[i] > arr[j])
                    {
                        swap(arr, i, j);
                    }
                }
            }
        }
        else if(desc == "desc")  //从大到小
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if(arr[i] < arr[j])
                    {
                        swap(arr, i, j);
                    }
                }
            }
        }
    }
    //交换数组中指定位置的元素
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
