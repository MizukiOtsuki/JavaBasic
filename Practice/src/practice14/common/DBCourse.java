package practice14.common;

public class DBCourse implements Course {


	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */


	public String getCourseName() {
		return "「【Eラーニング】DB基礎」";

	}

	public String[] getCourseUnit() {

		String DBC[] = new String[4];

		DBC[0] = "DB基礎";
		DBC[1] = "SQL基礎";
		DBC[2] = "正規化";
		DBC[3] = "SQL応用";


		return DBC;

	}

}
