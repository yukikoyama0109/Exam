package chapter16;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;

@WebServlet(urlPatterns={"/chapter16/attribute"})
public class Attribute extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		Product p=new Product();
//		setで値を生成
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);

//		JSPにProduct型のオブジェクトを渡す
		request.setAttribute("product", p);

//		フォワードして実行
		request.getRequestDispatcher("attribute.jsp")
		.forward(request, response);

	}
}

