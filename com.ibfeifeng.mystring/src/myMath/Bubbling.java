package myMath;

import java.util.Arrays;

/*��ʽһ��ͨ����ʱ���˴�Ž���������ģ��ɶ��Ըߣ�������Ҫ���ڴ��д����ʱ���������Ƕ���������˵����Ҫ���ڴ�ռ��С�����Ҵ����ʱ�������ڴ�ܿ�ͻ��ͷţ����������⡣
 int temp = a;  
 a = b;  
 b = temp; 
 ��ʽ����ͨ���Ӽ����㽻������ȱ�ݣ������������֮�󣬿������������˱��������ܱ������Χ�����ʱ�����ͻ�����⣬���Ƽ�ʹ��
 a = a + b;  
 b = a - b;  
 a = a - b; 
 ��ʽ����ͨ��������㽻����Ч������ߵģ����ǿɶ��Բ��Ǻܺ�
 a = a ^ b;  
 b = a ^ b;  
 a = a ^ b;*/

public class Bubbling {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 5, 1, 4, 9, 7, 0, 22, 44, 22, 77, 76 };

		for (int i = 0; i < arr.length - 1; i++) { // ���� arr.length-1��
			for (int j = 0; j < arr.length - i - 1; j++) { // ÿ�ֽ���arr.length-i-1��
				if (arr[j] < arr[j + 1]) {
				
					//��ʽһ��ͨ����ʱ���˴�Ž�����
					/*
					 * int temp; temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp;
					 */
					// ��ʽ����ͨ���Ӽ����㽻��
					/*arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
					*/
					
					// ��ʽ����ͨ��������㽻��
					arr[j] = arr[j] ^ arr[j + 1];  
					 arr[j + 1] = arr[j] ^ arr[j + 1];  
					 arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
