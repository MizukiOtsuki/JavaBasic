/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                String[] a = line.split(",");

                Player p = new Player();

                p.setPosition(a[0]);
                p.setName(a[1]);
                p.setCountry(a[2]);
                p.setTeam(a[3]);

                array.add(p);

            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

        Collections.shuffle(array);

        int countGk = 0;

        int countDf = 0;

        int countMf = 0;

        int countFw = 0;


        for(Player str : array) {

        	if(str.getPosition().equals("GK") && countGk < 1) {
        		System.out.println(str);
        		countGk++;
        	}

        	if(str.getPosition().equals("DF") && countDf < 4) {
        		System.out.println(str);
        		countDf++;
        	}

        	if(str.getPosition().equals("MF") && countMf < 4) {
        		System.out.println(str);
        		countMf++;
        	}

        	if(str.getPosition().equals("FW") && countFw < 2) {
        		System.out.println(str);
        		countFw++;
        	}

        }

	}
}
