package mystring;

import java.util.Stack;

/*学习编程的时候，经常会看到stack这个词，它的中文名字叫做"栈"。
 stack的第一种含义是一组数据的存放方式，特点为LIFO，即后进先出（Last in, first out）。
 在这种数据结构中，数据像积木那样一层层堆起来，后面加入的数据就放在最上层。使用的时候，最上层的数据第一个被用掉，这就叫做"后进先出"。


 push：在最顶层加入数据。
 pop：返回并移除最顶层的数据。
 top：返回最顶层数据的值，但不移除它。
 isempty：返回一个布尔值，表示当前stack是否为空栈。

 栈堆的主要区别是：stack是有结构的，每个区块按照一定次序存放，可以明确知道每个区块的大小；heap是没有结构的，数据可以任意存放。
 因此，stack的寻址速度要快于heap。
 每个线程分配一个stack，每个进程分配一个heap，也就是说，stack是线程独占的，heap是线程共用的。
 此外，stack创建的时候，大小是确定的，数据超过这个大小，就发生stack overflow错误，而heap的大小是不确定的，需要的话可以不断增加。*/

public class MyStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("linbing1");
		stack.push("linbing2");
		stack.push("linbing3");
		stack.push("linbing4");
		/*后进先出原则：
		 * 打印结果顺序：linbing4 linbing3 linbing2 linbing1
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
