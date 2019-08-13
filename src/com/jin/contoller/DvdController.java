package com.jin.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jin.dao.DvdDAO;
import com.jin.vo.CustomerVO;

@WebServlet("/dvdProject/control")
public class DvdController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String action = req.getParameter("action");
			
			if(action==null)
			{
				req.getRequestDispatcher("/view/mainView.jsp")
				.forward(req, resp);
				
				
			}else if(action.equals("join"))
			{
				CustomerVO Customer = new CustomerVO(
											req.getParameter("email"),
											req.getParameter("name"),
											req.getParameter("pass"),
											req.getParameter("addr"),
											req.getParameter("tel"),
													"N");
				DvdDAO dao = new DvdDAO();
				dao.insert(Customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	} //service
} //DvdController
