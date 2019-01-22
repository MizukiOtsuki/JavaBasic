package practice14.common;

public class JavaCourse implements Course {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */



	public String getCourseName() {
		return "「【Eラーニング】Java」";

	}

	public String[] getCourseUnit() {

		String Course[] = new String[7];

		Course[0] = "式と演算子";
		Course[1] = "制御構文";
		Course[2] = "メソッド";
		Course[3] = "配列";
		Course[4] = "オブジェクト指向";
		Course[5] = "継承";
		Course[6] = "高度な継承";

		return Course;

	}

}

