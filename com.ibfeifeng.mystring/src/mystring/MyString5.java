package mystring;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//HashMap��֧��Iterator����Ҫͨ�������ķ�ʽ����Map�е�key��value,keySet()��entrySet();
//entrySet���ش�ӳ���а�����ӳ���ϵ�� Set��ͼ,�Դ�Set��ͼ�Ĳ����ᷴӳ��ԭ����HashMap
//HashSet֧��Inter
/**HashMap* 							*HashSet*
HashMapʵ����Map�ӿ� 					HashSetʵ����Set�ӿ�
HashMap�����ֵ�� 						HashSet�����洢����
ʹ��put()������Ԫ�ط���map�� 				ʹ��add()������Ԫ�ط���set��
HashMap��ʹ�ü�����������hashcodeֵ 		HashSetʹ�ó�Ա����������hashcodeֵ����������������˵hashcode������ͬ������equals()���������ж϶��������ԣ������������ͬ�Ļ�����ô����false
HashMap�ȽϿ죬��Ϊ��ʹ��Ψһ�ļ�����ȡ���� 		HashSet��HashMap��˵�Ƚ���*/
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
