 /**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ CarTest
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */  

public class CarTest {
	public static void main(String[] args) {
		Car3 a = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000); 
		System.out.println("<< �ڵ��� ��� >>"); 
		System.out.println("������� : "+ a.getCompany()); 
		System.out.println("�𵨸� : "+ a.getModel()); 
		System.out.println("���� : "+ a.getColor()); 
		System.out.println("�ִ�ӵ� : "+ a.getMaxSpeed()); 
		System.out.println("���� : "+ String.format("%,d", a.getPrice())); 
		System.out.println("");
		
		Car3 b = new Car3("����ڵ���", "k7", "���", 246); 
		System.out.println("������� : " + b.getCompany()); 
		System.out.println("�𵨸� : " + b.getModel()); 
		System.out.println("���� : " + b.getColor()); 
		System.out.println("�ִ�ӵ� : " + b.getMaxSpeed()); 
		System.out.println("���� : "+ String.format("%,d", b.getPrice())); 
		System.out.println("");

		Car3 c = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��"); 
		System.out.println("������� : " + c.getCompany()); 
		System.out.println("�𵨸� : " + c.getModel()); 
		System.out.println("���� : " + c.getColor()); 
		System.out.println("�ִ�ӵ� : " + c.getMaxSpeed()); 
		System.out.println("���� : "+ String.format("%,d", c.getPrice()));
	} 
}
