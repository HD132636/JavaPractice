/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 5. 14.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String answerA = "���";
		String answerB = "���μ�";
		String answerC = "�ڹ�";		
		
		System.out.println("���� �����ϴ� ������?");
		String answer1 = scanner.nextLine();
		if(answerA.equals(answer1)) {
			System.out.println("�����Դϴ�!! ^^");
		} else System.out.println("Ʋ�Ƚ��ϴ�!! ��");
		
		System.out.println("���� �����ϴ� ����?");
		String answer2 = scanner.nextLine();
		if(answerB.equals(answer2)) {
			System.out.println("�����Դϴ�!! ^^");
		} else System.out.println("Ʋ�Ƚ��ϴ�!! ��");
		
		System.out.println("���� �����ϴ� ������?");
		String answer3 = scanner.nextLine();
		if(answerC.equals(answer3)) {
			System.out.println("�����Դϴ�!! ^^");
		} else System.out.println("Ʋ�Ƚ��ϴ�!! ��");
		
		scanner.close();
	}

}
