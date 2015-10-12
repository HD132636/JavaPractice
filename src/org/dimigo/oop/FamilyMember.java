/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ FamilyMember
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 6. 15.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName){
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName(){
		return this.memberName;
	}
	
	public static void printMemberCnt(){
		System.out.println("���� �� �ο� �� : " + memberCnt + "��");
	}

}
