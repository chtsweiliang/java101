package com.cht;

import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		// �ֳt��: alt+/
		// �R��: ctrl+D
		// ����Java: ctrl+F11
		// �r��j�p: Ctrl+"+"��"-"
		// ���ܼƦW��:Refactor->rename
//		System.out.println("Hello world!");
		Random random = new Random();
		int num = random.nextInt();
		long big = 11234424445555L;
		double weight = 85.4d;
		float height = 173.5f;
		byte b = 12;
		char c = 'A';
		char c2 = 123;
		boolean adult = false;
		boolean paid = true;
		System.out.println(num);
		System.out.println(weight);
		System.out.println(height);
		
		//���O�P�������Y
		String data="123";
		System.out.println(Integer.parseInt(data)+1);

	}

}
