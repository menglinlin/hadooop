package mystring;

import java.util.Iterator;
import java.util.Vector;
/*Vector����Collections API֮ǰ���Ѿ������˵�, ��ArrayList����JDK1.2��ʱ�����ΪCollection framework��һ���������.  
���Ƕ������ڲ���һ��Obejct[]���洢Ԫ�ص�.
ok, ������˵���ǵĲ��:
1. �̰߳�ȫ
Vector��ͬ����, ��ArrayList����.
��ΪVector��ͬ����, ���������̰߳�ȫ��.
ͬ��, ��ΪVecotr��ͬ����, ��������Ҫ����Ŀ�����ά��ͬ����, ������Ҫ��ArrayListҪ��.(��������˵)

��Ȼ, ������ArrayList��ƫ��, ��Ҳ������Collection.synchronizedList(List)���õ�һ���̰߳�ȫ��List.

2. ��������
Vector�����û�����capacityIncrement������ÿ����Ҫ���������size��ʱ��, Vector�᳢�԰���Ԥ�����õ�capacityIncrement��Ϊ����������, ��ArrayList��������Ĵ�С����һ��.

��������ͬ��һ������Ϊ10��Vector��ArrayList, ���ǰ�Vector��capacityIncrement��Ϊ1
��ô�����ڲ����11�������ʱ��, Vector�Ὣ���ȱ��11, Ȼ�����ռ�, Ȼ�󽫶�����ӽ�ȥ, ��ArrayList������20������Ŀռ�, Ȼ�󽫶�����ӽ�ȥ.

���capacityIncrement��Ϊ0���߸�ֵ, Vector�ͻ�����ArrayListһ��, ÿ�ζ��������С����һ��.

3. ���ܱȽ�
�ո��������Ѿ�˵����, ����Vector��ͬ����, ��ArrayList����, ����Vector������Ҫ��ArrayListҪ�Ե�һ��, �����ܻ���ȫ��.

����, ��Jack Shirazi��OnJava�ϵ�һƪ��������, �ƺ��Ⲣ����ʲô����, ����Ϊ�������ڵ�JVM��˵, ����������ͬ����������ϵ����ܲ���, ����������ÿ���ܲ��Ե�ʱ�򻷾��仯����Ĳ����.
Consequently Vector is thread-safe, and ArrayList isn't. This makes ArrayList faster than Vector. For some of the latest JVMs the difference in speed between the two classes is negligible: strictly speaking, for these JVMs the difference in speed between the two classes is less than the variation in times obtained from tests comparing the performance of these classes. ---- The Performance of Java's Lists

��������, �����ϵĲ��Ӧ�ò���.*/
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
