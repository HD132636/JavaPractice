package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int bus_pair = 850, light_car_pair = 300, else_car_pair = 600;
		int distance = 10;
		int money;
		String car = "��ӹ���";		// "��ӹ���", "����", "�� ��";
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + distance + "km");
		
		switch(car) {
		case "��ӹ���":
			money = bus_pair + (distance - 1) / 10 * 300;
			System.out.println("���� : " + car);
			System.out.println("����� : " + money + "��");
			break;
			
		case "����":
			money = light_car_pair + (distance - 1) / 10 * 200;
			System.out.println("���� : " + car);
			System.out.println("����� : " + money + "��");
			break;
			
		case "�� ��":
			money = else_car_pair + (distance - 1) / 10 * 200;
			System.out.println("���� : " + car);
			System.out.println("����� : " + money + "��");
			break;
			
		default:
			System.out.println("�߸��� ����");
			break;
		}
	}
}
