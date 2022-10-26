package co.edu.common;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
		
		public static void forward(HttpServletRequest req, HttpServletResponse resp, String path) {
			RequestDispatcher rs = req.getRequestDispatcher(path);
			try {
				rs.forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
}
