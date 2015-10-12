/**
 * 
 */
package org.dimigo.collection;

import java.util.*;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_ MelonChart
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 9. 24.
 * </pre> 
 * 
 * @author	: 2636 ȫ���� 111
 * @version : 1.0
 */

public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("�ٶ��̳� �� ��", "����"));
		list.add(new Music("���뿬��", "�ڰ�"));
		list.add(new Music("��������", "iKon"));
		
		System.out.println("--<< �����Ʈ >>--");
		printList(list);
		
		System.out.println("\n--<< 2�� �� �߰� >>--");
		list.add(1, new Music("����", "��������"));
		printList(list);
		
		System.out.println("\n--<< 3�� �� ���� >>--");
		list.set(2, new Music("���һ�", "Ȳ����"));
		printList(list);
		
		System.out.println("\n--<< 4�� �� ���� >>--");
		list.remove(3);
		printList(list);
		
		System.out.println("\n--<< ��ü ���� >>--");
		list.clear();
		printList(list);
	}
	
	public static void printList(List<Music> list) {
		int i = 1;
		for(Music music : list) {
			System.out.println(i + ". " + music);
			i++;
		}
		
	}
}
