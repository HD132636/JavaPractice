/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.abstractclass
 * 	 |_ IPhone
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 9. 3.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class IPhone extends SmartPhone {
	public IPhone() {
		
	}
	
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("�������̷� �����մϴ�");
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop ����� ����մϴ�");
	}
}
