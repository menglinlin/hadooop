package myMath;

import java.util.Arrays;

/*方式一：通过临时变了存放交换，最常见的，可读性高，但是需要在内存中存放临时变量，但是对于现在来说，需要的内存空间很小，而且存放临时变量的内存很快就会释放，不存在问题。
 int temp = a;  
 a = b;  
 b = temp; 
 方式二：通过加减计算交换，有缺陷，当两个数相加之后，可能其结果超出了变量类型能表达的最大范围，这个时候结果就会出问题，不推荐使用
 a = a + b;  
 b = a - b;  
 a = a - b; 
 方式三：通过异或运算交换，效率是最高的，但是可读性不是很好
 a = a ^ b;  
 b = a ^ b;  
 a = a ^ b;*/

public class Bubbling {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 5, 1, 4, 9, 7, 0, 22, 44, 22, 77, 76 };

		for (int i = 0; i < arr.length - 1; i++) { // 交换 arr.length-1轮
			for (int j = 0; j < arr.length - i - 1; j++) { // 每轮交换arr.length-i-1次
				if (arr[j] < arr[j + 1]) {
				
					//方式一：通过临时变了存放交换，
					/*
					 * int temp; temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp;
					 */
					// 方式二：通过加减计算交换
					/*arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					*/
					
					// 方式三：通过异或运算交换
					arr[j] = arr[j] ^ arr[j + 1];  
					 arr[j + 1] = arr[j] ^ arr[j + 1];  
					 arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
