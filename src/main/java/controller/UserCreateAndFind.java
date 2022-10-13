package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

import java.io.IOException;
import java.util.List;

import dao.UserDao;

public class UserCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserCreateAndFind() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		if(pesquisa == null) {
			pesquisa = "";
		}
		List<User> users = UserDao.Find(pesquisa);
		request.setAttribute("users", users);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("pesquisa.jsp");
		
		requestDispatcher.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		
		user.setCpf(request.getParameter("cpf"));
		user.setNome(request.getParameter("nome"));
		user.setTelefone(request.getParameter("telefone"));
		user.setEmail(request.getParameter("email"));
		user.setRg(request.getParameter("rg"));
		
		UserDao.Create(user);
		
		
		
		doGet(request, response);
	}

}
