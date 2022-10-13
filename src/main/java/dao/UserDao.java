package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.ConnectionSQL;
import model.User;

public class UserDao implements CRUD{
	private static Connection connection = ConnectionSQL.CreateConnection();
	private static String sql;

public static void Create(User user) {
	
	sql="INSERT INTO user VALUES(?,?,?,?,?)";
	
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1,user.getCpf());
		preparedStatement.setString(2,user.getNome());
		preparedStatement.setString(3,user.getTelefone());
		preparedStatement.setString(4,user.getEmail());
		preparedStatement.setString(5,user.getRg());
		
		preparedStatement.executeUpdate();
	
		System.out.println("------ DATA INSERT INTO DATABASE-------");
		
	}catch(SQLException e) {
		System.out.println("----- NOT INSERT INTO THE DATABASE -----" + e.getMessage());
	}
	
	
		
	}
	
	public static void Delete(String userCpf) {
		
		String sql = "DELETE FROM user WHERE cpf = ?"; 
		
		//excluir das duas tabelas
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,userCpf);
			preparedStatement.executeUpdate();
			System.out.println("---USER DELETED----");
			
		}catch(SQLException e) {
			System.out.println("----INCORRECTED DELETE-----"+ e.getMessage());
			}
		
		
		
	}
	
	public static List<User> Find(String pesquisa){
		 sql = "SELECT * FROM user"; //or cpf like ?";
		//PreparedStatement preparedStatement;
		try {
			//PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		 //  preparedStatement.setString(1,pesquisa);
	//preparedStatement.setString(2,pesquisa);
		
		List<User> users = new ArrayList<User>();
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			User user= new User();
			
			user.setCpf(resultSet.getString("cpf"));
			user.setNome(resultSet.getString("nome"));
			user.setTelefone(resultSet.getString("telefone"));
			user.setEmail(resultSet.getString("email"));
			user.setRg(resultSet.getString("rg"));
			
			users.add(user);
			
			System.out.println("");
			
			
		}
		System.out.println("------CORRECT SEARCH FOR USERS------");
		return users;
		
		} catch (SQLException e) {
			System.out.println("------INCORRECT SEARCH FOR USERS--------" + e.getMessage());
		}
		
		
		return null;
		
	}
	
	public static User FindByCpf(String userCpf) {
		
		 sql = "SELECT * FROM user WHERE cpf like ?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, userCpf);

			Statement Statement = connection.createStatement();
			ResultSet resultSet = Statement.executeQuery(sql);
			
			User user = new User();
			
			while(resultSet.next()) {
				user.setCpf(resultSet.getString("cpf"));
				user.setNome(resultSet.getString("nome"));
				user.setTelefone(resultSet.getString("telefone"));
				user.setEmail(resultSet.getString("email"));
				user.setRg(resultSet.getString("rg"));
			}
			System.out.println("-----USER FOUND-----");
			
			return user;
			
			
		}catch(SQLException e) {
			System.out.println("-----NOT FOUND SEARCH FOR CPF-----" + e.getMessage());
			return null;
		}
	}
	
	
	
	
	
	
	public static void Update(User user) {
		
		 sql = "UPDATE user SET cpf=?,nome=?,telefone=?,email=?,rg=? WHERE cpf=?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getCpf());
			preparedStatement.setString(2, user.getNome());
			preparedStatement.setString(3, user.getTelefone());
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.setString(5, user.getRg());
			preparedStatement.setString(6, user.getCpf());
			
			preparedStatement.executeUpdate();
			
			System.out.println("------USER CHANGED-------");
			
		}catch(SQLException e) {
			System.out.println("-------INCORRECTE UPDATE-------");
		}
		}
		
	
}











