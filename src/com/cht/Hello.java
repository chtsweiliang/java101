package com.cht;

import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		// 快速鍵: alt+/
		// 刪除: ctrl+D
		// 執行Java: ctrl+F11
		// 字體大小: Ctrl+"+"或"-"
		// 改變數名稱:Refactor->rename
//		System.out.println("Hello world!");
		Random random = new Random();
		int number = random.nextInt();
		long big = 11234424445555L;
		double weight = 85.4d;
		float height = 173.5f;
		byte b = 12;
		char c = 'A';
		char c2 = 123;
		boolean adult = false;
		boolean paid = true;
		System.out.println(number);
		System.out.println(weight);
		System.out.println(height);

		// 類別與物件的關係
		String data = "123";
		System.out.println(Integer.parseInt(data) + 1);

		int num = 6;
		num = num + 2; // 8
		num = num - 5; // 3
		num = num /2 ; // ?

		System.out.println(num);

	}

}
