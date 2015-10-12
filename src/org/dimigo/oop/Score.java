/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Score
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 5. 14.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �Է� => ");
		int kor = scanner.nextInt();
		System.out.println("���� ���� �Է� => ");
		int math = scanner.nextInt();
		System.out.println("���� ���� �Է� => ");
		int eng = scanner.nextInt();
		
		int tot = kor + math + eng;
		double avg = tot/3;
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n\n<< ������� >>\n")
		  .append("���� ���� : ")
		  .append(kor)
		  .append(" ��\n")
		  .append("���� ���� : ")
		  .append(math)
		  .append(" ��\n")
		  .append("���� ���� : ")
		  .append(eng)
		  .append(" ��\n")
		  .append("���� : ")
		  .append(tot)
		  .append(" ��\n")
		  .append("��� : ")
		  .append(avg)
		  .append(" ��\n").toString();
		
		System.out.println(sb);
		
		scanner.close();
		  
	}
	
}
