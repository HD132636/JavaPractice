/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "����", 700000),
				new Galaxy("������ S6", "������", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			// Iphone or Galaxy ��� ���
			phone.useSpecialFunction(phone);
			
			phone.turnOff();
			System.out.println();
		}		

	}

}
