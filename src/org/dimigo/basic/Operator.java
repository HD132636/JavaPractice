package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a1 = 9, b1 = 10, a2 = 9;
		double h1 = 5.8, h2 = 5.4;
		double s1 = (a1 + b1) * h1 / 2;
		double s2 = a2 * h2;
		
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : " + s1);
		System.out.println("����纯�� ���� : " + s2);
		
		System.out.println("");
		System.out.println("");
		
		if(s1 > s2) {
			System.out.println("��ٸ����� ����纯�� ���� " + (s1 - s2) + " �� Ů�ϴ�.");
		} else if(s1 < s2) {
			System.out.println("����纯���� ��ٸ��� ���� " + (s2 - s1) + " �� Ů�ϴ�.");
		} else {
			System.out.println("��ٸ��ð� ����纯���� ���̰� �����ϴ�.");
		}
	}
}
