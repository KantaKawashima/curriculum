package check;

public class Check {

	private static String firstName = "貫太";
	private static String lastName = "川嶌";

	private static void printName() {
		System.out.println("printNameメソッド" + "→" + lastName + firstName);
	}

	public static void main(String[] args) {
		printName();
		Pet pt = new Pet("java吉", "hoge");
		RobotPet rpt = new RobotPet("R202", "ルーク");
		pt.introduce();
		rpt.introduce();
	}

}