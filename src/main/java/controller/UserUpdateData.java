package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;

import dao.UserDao;


public class UserUpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserUpdateData() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String userCpf = request.getParameter("userCpf");
		User user = UserDao.FindByCpf(userCpf);
		
		request.setAttribute("user",user);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserUpdate.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		user.setCpf(request.getParameter("cpf"));
		user.setNome(request.getParameter("nome"));
		user.setEmail(request.getParameter("email"));
		user.setTelefone(request.getParameter("telefone"));
		user.setRg(request.getParameter("rg"));
		
		UserDao.Update(user);
		
		UserCreateAndFind usercreateAndFind = new UserCreateAndFind();
		usercreateAndFind.doGet(request,response);
		//doGet(request, response);
		}

}
