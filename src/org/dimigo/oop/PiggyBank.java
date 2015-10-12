/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBank
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 6. 15.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount){
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "�� ����");
	}
	
	public static void printBalance(){
		System.out.println("���������� �� �ݾ� : " + balance + "��");
	}
	
	public static void stealMoney(FamilyMember member, int amount){
		balance -= amount;
		System.out.println(member.getMemberName() + " " + amount + "�� ����");
	}
}