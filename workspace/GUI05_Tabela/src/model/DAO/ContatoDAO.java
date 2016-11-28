package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import util.Conexao;
import model.Contato;

public class ContatoDAO {
	public static Contato inserir(String nome,String email,String mensagem){
		Contato contato = null;
		
		String sql = "insert into contato (nome,email,mensagem) values (?,?,?)";
		
		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd", "com.mysql.jdbc.Driver", "root", "aluno");
		
		Connection con = conexao.obterConexao();
		
		try {
			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);
			
			if(comando.executeUpdate()>0){
				contato=new Contato(nome, email, mensagem);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao acessar o Banco de Dados.\nVerifique sua instrução SQL.");
			System.out.println(e.getMessage());
		}
		
		return contato;
	}
	
	public static List<Contato> buscarTodos(){
		List<Contato> contatos = new LinkedList<Contato>();
		
		String sql = "select * from contato";
		
		Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd", "com.mysql.jdbc.Driver", "root", "aluno");
		
		Connection con = conex.obterConexao();
		
		try {
			Statement comando = con.createStatement();
			
			ResultSet rs = comando.executeQuery(sql);
			
			
			while(rs.next()){
				Contato c=new Contato(rs.getInt("id"),
						rs.getString("nome"),
						rs.getString("email"),
						rs.getString("mensagem"));
				contatos.add(c);
			}
			
			rs.close();
			comando.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao acessar o Banco de Dados.\nVerifique sua instrução SQL.");
			System.out.println(e.getMessage());
		}
		
		return contatos;
	}
	
	 
	public static boolean excluir(int id){
		boolean ok=false;
		
		String sql = "delete from contato where id=?";
		
		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd", "com.mysql.jdbc.Driver", "root", "aluno");
		
		Connection con = conexao.obterConexao();
		
		try {
			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setInt(1, id);
			
			if(comando.executeUpdate()>0){
				ok=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao acessar o Banco de Dados.\nVerifique sua instrução SQL.");
			System.out.println(e.getMessage());
		}
		
		return ok;
	}
	
	public static boolean atualizar(String mensagem,int id){
		boolean ok = false;
		
		String sql = "update contato set mensagem=? where id=?";
		
		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd", "com.mysql.jdbc.Driver", "root", "aluno");
		
		Connection con = conexao.obterConexao();
		
		try {
			PreparedStatement comando = con.prepareStatement(sql);
			
			comando.setString(1, mensagem);
			comando.setInt(2, id);
			
			if(comando.executeUpdate()>0){
				ok=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao acessar o Banco de Dados.\nVerifique sua instrução SQL.");
			System.out.println(e.getMessage());
		}
		
		return ok;
	}
	
}










