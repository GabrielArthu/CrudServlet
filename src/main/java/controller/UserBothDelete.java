package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.UserDao;


public class UserBothDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UserBothDelete() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String userCpf = request.getParameter("userCpf");
		
		UserDao.Delete(userCpf);						
		
		UserCreateAndFind userCreateAndFind = new UserCreateAndFind() ;		
		userCreateAndFind.doGet(request, response);
	
	
	}

	
	

}
