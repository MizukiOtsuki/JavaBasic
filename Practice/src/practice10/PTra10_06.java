package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
			car1.color = "Blue";
			car1.gasoline = 40;


		 Car car2 = new Car();
		 	car2.color = "Black";
		 	car2.gasoline = 60;


		 Car car3 = new Car();
		 	car3.color = "Green";
		 	car3.gasoline = 70;


       final int distance = 300;
       

       int n1 = 0;
       
       int count1 = 0;

       while(n1 < distance) {

			int run1 = car1.run();

			if(run1 < 0) {
				System.out.println("目的地に到達できませんでした");
				break;

			}else {

			n1 += run1;
			count1++;

			}
       }

       if(n1 > distance) {
    	   System.out.println("目的地まで"  + count1 + "時間かかりました。残りのガソリンは" + car1.gasoline + "リットルです。");
       }



       int n2 = 0;
       int count2 = 0;


       while(n2 < distance) {

    	   int run2 = car2.run();


    	   if(run2 < 0) {
				System.out.println("目的地に到達できませんでした");
				break;

			}else {

			n2 += run2;
			count2++;

			}

       }

	if(n2 > distance) {

		System.out.println("目的地まで"  + count2 + "時間かかりました。残りのガソリンは" + car2.gasoline + "リットルです。");


	}


		int n3 = 0;
		int count3 = 0;


		while(n3 < distance) {

			int run3 = car3.run();



			if(run3 < 0) {
				System.out.println("目的地に到達できませんでした");
				break;

			}else {

			n3 += run3;
			count3++;

			}

    }

	if(n3 > distance) {

		System.out.println("目的地まで"  + count3 + "時間かかりました。残りのガソリンは" + car3.gasoline + "リットルです。");


	}

}

}



