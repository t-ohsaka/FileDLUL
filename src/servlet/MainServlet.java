package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String JSP_UPLOAD = "/WEB-INF/jsp/upload.jsp";

	public static final String JSP_DOWNLOAD = "/WEB-INF/jsp/download.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String format = request.getParameter("format");

		switch(format) {
			case "up":
				System.out.println("�A�b�v���[�h�{�^������");
				forward(request, response, JSP_UPLOAD);
				break;

			case "down":
				System.out.println("�_�E�����[�h�{�^������");
				break;

			default:
				System.out.println("�s��");
				break;
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void forward(HttpServletRequest request, HttpServletResponse response, String jspName)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(jspName);
	    dispatcher.forward(request, response);
	}

}
