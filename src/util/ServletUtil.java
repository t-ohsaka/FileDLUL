package util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUtil {

	public static final String JSP_UPLOAD = "/WEB-INF/jsp/upload.jsp";

	public static final String JSP_DOWNLOAD = "/WEB-INF/jsp/download.jsp";

	public static void forward(HttpServletRequest request, HttpServletResponse response, String jspName)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(jspName);
	    dispatcher.forward(request, response);
	}
}
