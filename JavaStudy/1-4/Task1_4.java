public class Task1_4 {

    // 定数（アカウント情報）
    private static final String 
    Namea = "alice";
    
    private static final String 
    Passa = "pass";
    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";
    public static void main(String[] args) {
         String name = "alice";
         String pass = "pass";
  
        if (name.equals(Namea) && pass.equals(Passa)){
          System.out.println(CONST_MSG_SUCCESS) ;
        }else if (name.equals(Namea)){
          System.out.println(CONST_MSG_ERROR_PASS) ;
        }else if (pass.equals(Passa)){
          System.out.println(CONST_MSG_ERROR_NAME) ;
        }else  {
          System.out.println(CONST_MSG_ERROR_INPUT);
        } 
    }

}
