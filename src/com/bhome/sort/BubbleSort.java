package com.bhome.sort;

/**
 * @program: algorithm
 * @description: 冒泡排序
 * @author: Mr.Huang
 * @create: 2019-05-09 13:53
 **/
public class BubbleSort {

	public static void sort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}

		int length = array.length;
		//外层：需要length-1次循环比较
		for (int i = 0; i < length - 1; i++) {
			//内层：每次循环需要两两比较的次数，每次比较后，都会将当前最大的数放到最后位置，所以每次比较次数递减一次
			for (int j = 0; j < length - 1 - i; j++) {
				System.out.println(array[j]);
				System.out.println(array[j + 1]);
				//过第一个大于第二个就交换位置
				if (array[j] > array[j+1]) {
					//交换数组array的j和j+1位置的数据
					swap(array, j, j+1);
				}
			}
		}

		for (int j =0; j < array.length; j ++){
			System.err.print(array[j] +"\t");
		}
	}

	/**
	 * 交换数组array的i和j位置的数据
	 * @param array 数组
	 * @param i 下标i
	 * @param j 下标j
	 */
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public  static  void main(String [] args){
		int arrayDemo[] = {69,36,25,2,15,46,32,11,66,102,10};
		sort(arrayDemo);
	}
}

