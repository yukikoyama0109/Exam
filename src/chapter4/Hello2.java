package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//コンテキストパス
@WebServlet(urlPatterns={"/chapter4/hello2"})
//ファイル名と同じクラス
public class Hello2 extends HttpServlet {
	//	固定
	public void doGet (
			HttpServletRequest request,  HttpServletResponse response
			) throws ServletException, IOException {


		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out=response.getWriter();
//		HTMLを作成する関数
		out.println("Hello");
//		現在時刻の取得と表示
		out.println(new java.util.Date());
		out.println("こんにちは");
		out.println("猫");
	}
}