/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 * 	 |_ Galaxy
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 9. 3.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class Galaxy extends SmartPhone {
	public Galaxy() {
		
	}
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("�Ｚ���̷� �����մϴ�");
	}
	
	public void useWirelessCharging() {
		System.out.println("���� ��������� ����մϴ�");
	}
}
