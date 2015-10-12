/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBankTest
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 6. 15.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("�ƺ�");
		FamilyMember mother = new FamilyMember("����");
		FamilyMember me = new FamilyMember("��");
		FamilyMember brother = new FamilyMember("������");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
		PiggyBank.stealMoney(brother, 2000);
		PiggyBank.printBalance();
		
	}

}
