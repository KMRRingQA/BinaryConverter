package com.qa.main;

public class Runner {

	public static void main(String[] args) {
//		Q1_ConvertFromBinary conversion = new Q1_ConvertFromBinary();
//		System.out.println(conversion.convertFromBinary("1110"));

		Q2_ConvertToBinary conversion2 = new Q2_ConvertToBinary();
		conversion2.convertToBinary(14);
		System.out.println("");
		conversion2.convertToBinary(76);
		System.out.println("");
		conversion2.convertToBinary(2874145);

	}

}
