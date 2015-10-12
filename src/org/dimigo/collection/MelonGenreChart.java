/**
 * 
 */
package org.dimigo.collection;

import java.util.*;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_ MelonGenreChart
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 10. 1.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class MelonGenreChart {
	
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("�� ù���", "������"));
		ballad.add(new Music("�� �ٽ� ���", "��â��"));
		ballad.add(new Music("�λ꿡 ����", "������"));
		
		map.put("�߶��", ballad);
		
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("Ŀ��", "����ȯ, �迹��"));
		dance.add(new Music("�� �ߵɰž�", "��"));
		
		map.put("��", dance);
		
		System.out.println("-----<< ��� �帣�� ��Ʈ >>-----");
		printMap(map);
		
		System.out.println("-----<< �߶�� 3���� ���� >>-----");
		ballad.set(2, new Music("����� ������", "������"));
		printMap(map);
		
		System.out.println("-----<< �߶�� 1���� ���� >>-----");
		ballad.remove(0);
		printMap(map);
		
		System.out.println("-----<< ��ü ����Ʈ ���� >>-----");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		int i = 1;
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(Music music : map.get(key)) {
				System.out.println(i + ". " + music);
				i++;
			}
			i = 1;
		}
		System.out.println();
	}

}
