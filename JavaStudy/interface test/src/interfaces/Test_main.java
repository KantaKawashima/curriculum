package interfaces;

/**
 * 3. 七海クラス: メイン処理
 * <pre>インターフェースを実装したクラスのインスタンス生成してメソッドを呼び出す<pre>
 */
public class Test_main{

 public static void main(String[] args) {
  // 3. 現実（1, 2 を使ってみる）
test test = new test("七海", "2019/01");

 final String message = test.doCreateJavaCurriculum();
 System.out.println("message = " + message);
 }
}