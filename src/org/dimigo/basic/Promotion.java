package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		long average_salary = 1700000;
		int staff = 3;
		int total_store = 1500;
		long year_salary = average_salary * 12 * staff * total_store;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");		
		System.out.println("�� ��� �޿� : " + String.format("%,d", average_salary) + "��");
		System.out.println("���� �� ���� �� : " + staff + "��");
		System.out.println("���� �� : " + String.format("%,d", total_store) + "��");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("���� �ΰǺ� : " + String.format("%,d", year_salary) +"��");

	}

}