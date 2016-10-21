package mystring;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//HashMap不支持Iterator所以要通过其他的方式迭代Map中的key和value,keySet()或entrySet();
//entrySet返回此映射中包含的映射关系的 Set视图,对此Set视图的操作会反映到原来的HashMap
//HashSet支持Inter
/**HashMap* 							*HashSet*
HashMap实现了Map接口 					HashSet实现了Set接口
HashMap储存键值对 						HashSet仅仅存储对象
使用put()方法将元素放入map中 				使用add()方法将元素放入set中
HashMap中使用键对象来计算hashcode值 		HashSet使用成员对象来计算hashcode值，对于两个对象来说hashcode可能相同，所以equals()方法用来判断对象的相等性，如果两个对象不同的话，那么返回false
HashMap比较快，因为是使用唯一的键来获取对象 		HashSet较HashMap来说比较慢*/
public class MyString5 {

	public static void main(String[] args) {
	HashMap<String, String> hashMap =new HashMap<String, String>();
	hashMap.put("1", "aa");
	hashMap.put("2", "ss");
	hashMap.put("3", "dd");
	hashMap.put("4", "ff");
	/*Set<Entry<String, String>> entrySet = hashMap.entrySet();
	
	for (Entry<String, String> entry : entrySet) {
		System.out.print(entry.getKey());
		System.out.print(entry.getValue());
		System.out.println();
	}*/

	Set<String> keySet = hashMap.keySet();
	for (String string : keySet) {
		System.out.println(string);
		System.out.println(hashMap.get(string));
	}
	
	
	}

}
