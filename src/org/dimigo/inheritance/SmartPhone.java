/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhone
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 8. 28.
 * </pre> 
 * 
 * @author	: 2636 ȫ����
 * @version : 1.0
 */

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println(model + "�� ������ ���ϴ�.");
	}
	
	public void pay() {
		if(this instanceof Galaxy) {
			Galaxy G = (Galaxy)this;
			G.pay();
		}
		
		else {
			IPhone I = (IPhone)this;
			I.pay();
		}
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(this instanceof IPhone) {
			IPhone i = (IPhone)this;
			i.useAirDrop();
		}
		else if(this instanceof Galaxy) {
			Galaxy g = (Galaxy)this;
			g.useWirelessCharging();
		}
	}

	public String toString() {
		return "�𵨸� : " + model + ", ȸ��� : " + company + ", ���� : " + price + "��";
	}
	
	
}
