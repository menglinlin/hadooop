package mystring;

import java.util.Stack;

/*ѧϰ��̵�ʱ�򣬾����ῴ��stack����ʣ������������ֽ���"ջ"��
 stack�ĵ�һ�ֺ�����һ�����ݵĴ�ŷ�ʽ���ص�ΪLIFO��������ȳ���Last in, first out����
 ���������ݽṹ�У��������ľ����һ���������������������ݾͷ������ϲ㡣ʹ�õ�ʱ�����ϲ�����ݵ�һ�����õ�����ͽ���"����ȳ�"��


 push�������������ݡ�
 pop�����ز��Ƴ��������ݡ�
 top������������ݵ�ֵ�������Ƴ�����
 isempty������һ������ֵ����ʾ��ǰstack�Ƿ�Ϊ��ջ��

 ջ�ѵ���Ҫ�����ǣ�stack���нṹ�ģ�ÿ�����鰴��һ�������ţ�������ȷ֪��ÿ������Ĵ�С��heap��û�нṹ�ģ����ݿ��������š�
 ��ˣ�stack��Ѱַ�ٶ�Ҫ����heap��
 ÿ���̷߳���һ��stack��ÿ�����̷���һ��heap��Ҳ����˵��stack���̶߳�ռ�ģ�heap���̹߳��õġ�
 ���⣬stack������ʱ�򣬴�С��ȷ���ģ����ݳ��������С���ͷ���stack overflow���󣬶�heap�Ĵ�С�ǲ�ȷ���ģ���Ҫ�Ļ����Բ������ӡ�*/

public class MyStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("linbing1");
		stack.push("linbing2");
		stack.push("linbing3");
		stack.push("linbing4");
		/*����ȳ�ԭ��
		 * ��ӡ���˳��linbing4 linbing3 linbing2 linbing1
		 */
		for (int i = 0; i < 4; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("====================================");

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.pop());
		}
	}

}
