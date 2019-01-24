/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください

		Boolean b2 = Boolean.valueOf(b);
		boolean b3 =b2.booleanValue();

		Byte by2 = Byte.valueOf(by);
		byte by3 =by2.byteValue();

		Short s2 = Short.valueOf(s);
		short s3 =s2.shortValue();

		Character c2 = Character.valueOf(c);
		char c3 =c2.charValue();

		Integer i2 = Integer.valueOf(i);
		int i3 =i2.byteValue();

		Long l2 = Long.valueOf(l);
		long l3 =l2.longValue();

		Float f2 = Float.valueOf(f);
		float f3 =f2.floatValue();

		Double d2 = Double.valueOf(d);
		double d3 =d2.doubleValue();


	}
}
