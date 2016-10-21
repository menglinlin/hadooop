package mystring;

import java.util.Iterator;
import java.util.Vector;
/*Vector是在Collections API之前就已经产生了的, 而ArrayList是在JDK1.2的时候才作为Collection framework的一部分引入的.  
它们都是在内部用一个Obejct[]来存储元素的.
ok, 现在来说他们的差别:
1. 线程安全
Vector是同步的, 而ArrayList不是.
因为Vector是同步的, 所以它是线程安全的.
同样, 因为Vecotr是同步的, 所以他需要额外的开销来维持同步锁, 所以它要比ArrayList要慢.(理论上来说)

当然, 如果你对ArrayList有偏好, 你也可以用Collection.synchronizedList(List)来得到一个线程安全的List.

2. 容量增长
Vector允许用户设置capacityIncrement这样在每次需要扩充数组的size的时候, Vector会尝试按照预先设置的capacityIncrement作为增量来设置, 而ArrayList则会把数组的大小扩大一倍.

比如现在同样一个长度为10的Vector和ArrayList, 我们把Vector的capacityIncrement设为1
那么我们在插入第11个对象的时候, Vector会将长度变成11, 然后分配空间, 然后将对象添加进去, 而ArrayList则会分配20个对象的空间, 然后将对象添加进去.

如果capacityIncrement设为0或者负值, Vector就会做和ArrayList一样, 每次都将数组大小扩大一倍.

3. 性能比较
刚刚在上面已经说过了, 由于Vector是同步的, 而ArrayList不是, 所以Vector的性能要比ArrayList要稍第一点, 用性能换安全嘛.

不过, 据Jack Shirazi在OnJava上的一篇文章来看, 似乎这并不是什么问题, 他认为对于现在的JVM来说, 这两个类在同步这个问题上的性能差异, 甚至还不如每次跑测试的时候环境变化引起的差异大.
Consequently Vector is thread-safe, and ArrayList isn't. This makes ArrayList faster than Vector. For some of the latest JVMs the difference in speed between the two classes is negligible: strictly speaking, for these JVMs the difference in speed between the two classes is less than the variation in times obtained from tests comparing the performance of these classes. ---- The Performance of Java's Lists

这样看来, 性能上的差别应该不大.*/
public class MyVector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		Iterator<Integer> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

}
