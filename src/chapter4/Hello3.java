package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//コンテキストパス
@WebServlet(urlPatterns={"/chapter4/hello3"})
//ファイル名と同じクラス
public class Hello3 extends HttpServlet {
	//	固定
	public void doGet (
			HttpServletRequest request,  HttpServletResponse response
			) throws ServletException, IOException {


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("Hello");
//		現在時刻の取得と表示
		out.println("<p>" + new java.util.Date() + "</p>");
		out.println("<p>こんにちは</p>");
		out.println("<p>猫</p>");

		out.println("</body>");
		out.println("</html>");
	}
}