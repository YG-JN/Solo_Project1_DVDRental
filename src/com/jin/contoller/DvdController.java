package com.jin.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jin.dao.DvdDAO;
import com.jin.vo.CustomerVO;
import com.jin.vo.MovieVO;

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
				resp.sendRedirect("/view/mainView.jsp");
			}
			
			else if(action.equals("login"))
			{
				CustomerVO Customer = new CustomerVO();
					Customer.setCustomerEmail(req.getParameter("email"));
					Customer.setCustomerPass(req.getParameter("pass"));
				
					DvdDAO dao = new DvdDAO();
					
				if(dao.login(Customer))
				{
					req.getSession().setAttribute("login", "success");
					
					//이메일 구해오기
					String getEmail = req.getParameter("email");
					req.getSession().setAttribute("info", getEmail);
					
					//이름 구해오기
					String getName = dao.selectName(getEmail);
					req.getSession().setAttribute("name", getName);
					
					System.out.println("로그인성공~!!");
					resp.sendRedirect("/dvdProject/control");
					
					
					
				}else {
					req.getSession().setAttribute("login", "fail");
					System.out.println("로그인실패~!!");
				
				
				}
				//dao.insert(Customer);
				//resp.sendRedirect("/view/mainView.jsp");
			}else if(action.equals("category"))
			{
				System.out.println("카테고리 고고");
				DvdDAO dao = new DvdDAO();
				List<MovieVO> movieList = dao.AllMovieInfo();
				System.out.println("영화 갯수:" + movieList.size());
				req.getSession().setAttribute("list", movieList);
				resp.sendRedirect("/view/categoryView.jsp");
				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // service
} // DvdController
