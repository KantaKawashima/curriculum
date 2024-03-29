package controller;

/**
 * 社員情報管理コントローラー
 */

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;
import service.EmployeeService;

public class EmployeeController extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

 try {
  // 問① index.htmlから送信されたIDとPassWordの値を取得できるように修正しましょう。
 String ID = request.getParameter("id");
 String PASSWORD = request.getParameter("password");

 /*
 * IDとPassWordと元に、社員情報を検索する関数の呼び出し、結果をJSPに渡す処理
 * ※ EmployeeBeanとEmployeeServiceをimportするのを忘れないでください。
 */

  // 問② EmployeeServiceクラスをインスタンス化する。
  EmployeeService  ES= new  EmployeeService();

  // 問③ EmployeeBeanに、EmployeeServiceよりsearch関数を呼び出し、返り値を格納する。
  EmployeeBean setData = ES.search(ID, PASSWORD);
  // 問④ nullの部分に適切な引数をセットする。
 request.setAttribute("EmployeeBean", setData);

 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 ServletContext context = this.getServletContext();
 RequestDispatcher dispatcher = context.getRequestDispatcher("/index.jsp");
 dispatcher.forward(request, response);
 }
 }
}