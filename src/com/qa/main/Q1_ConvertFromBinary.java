package com.qa.main;

public class Q1_ConvertFromBinary {
	public int convertFromBinary(String binary) {
		int sum = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.substring(i, i + 1).equals("0")) {
			} else {
				sum += Math.pow(2, binary.length() - i - 1);
			}
		}

		return sum;
	}
}
