package com.qa.main;

public class Q2_ConvertToBinary {
	public void convertToBinary(int num1) {
		int pow2 = 1;
		int counter = 0;
		String BinaryString = "1";
		while (true) {
			if (num1 / pow2 != 1) {
				pow2 *= 2;
				counter++;
			} else {
				break;
			}
		}
		num1 -= pow2;
		for (; counter > 0; counter--) {
			pow2 = pow2 / 2;
			if (num1 / pow2 >= 1) {
				BinaryString += "1";
				num1 -= pow2;
			} else {
				BinaryString += "0";
			}
		}
		System.out.println(BinaryString);
	}
}
