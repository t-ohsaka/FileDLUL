package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import util.ServletUtil;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String PATH_UPLOAD = "C:\\pleiades\\workspace\\FileDLUL\\WebContent\\WEB-INF\\upload\\";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part = request.getPart("file");
		String fileName = extractFileName(part);

		boolean isError = false;

		if(fileName.equals("")) {
			System.out.println("�A�b�v���[�h���s---�t�@�C����I������Ă��Ȃ�");
			isError = true;
			request.setAttribute("isError", isError);
			ServletUtil.forward(request, response, ServletUtil.JSP_UPLOAD);
		}else {
			part.write(PATH_UPLOAD + fileName);
			System.out.println("�A�b�v���[�h����---" + PATH_UPLOAD + fileName);

			request.setAttribute("fileName", fileName);
			ServletUtil.forward(request, response, ServletUtil.JSP_COMPLETE);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * �t�@�C���������o��
	 * @param part �p�[�g
	 * @return �t�@�C����
	 */
	private String extractFileName(Part part) {
		// System.out.println(part.getHeader("Content-Disposition"));
		// ���ꂪ�o�͂����->	form-data; name="file"; filename="pic_278.png"
		String[] splitedHeader = part.getHeader("Content-Disposition").split(";");

		String fileName = null;
		for(String item: splitedHeader) {
			if(item.trim().startsWith("filename")) {
				int equalsIndex = item.indexOf('=');
				fileName = item.substring(equalsIndex+1).replaceAll("\"", "");
			}
		}

		return fileName;
    }

}
