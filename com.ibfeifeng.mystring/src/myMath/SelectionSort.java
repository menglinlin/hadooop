package myMath;

import java.util.Arrays;

/*
 * ѡ�񽻻���
 * ����һ�Σ���¼����ֵԪ������λ�ã����������󣬽�����ֵԪ�ص��������ʵ�λ��

 ����һ�α�����ֻ��һ�ν�������ɽ���ֵ���õ�����λ��
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] v = { 1, 3, 2, 6, 5, 1, 4, 9, 7, 0, 22, 44, 22, 77, 76 };

		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i] > v[j]) {
					int temp;
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(v));
	}

}
