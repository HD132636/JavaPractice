/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ IdolGruop
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 5. 28.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class IdolGruop {

	public static void main(String[] args) {
		String[] idolGroup = {"���", "2NE1", "�ɽ�����"};
		String[][] members = {
				{"GD", "�¾�", "�뼺", "ž", "�¸�"},
				{"CL", "��ٶ��", "�ں�", "����"},
				{"����", "����", "����", "�ξ�"}
		};
		
		for(int i = 0; i < members.length; i++) {
			System.out.println("<< " + idolGroup[i] + " ���>>");
			for(int j = 0; j < members[i].length; j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
