package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
    
	private Connection con = null;
	private Statement stm  = null;
	private ResultSet result = null;
	
	public void conecta() {
		String servidor = "jdbc:mysql://localhost:3306/projetomvc";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			this.con = DriverManager.getConnection(servidor, usuario, senha);
			this.stm = this.con.createStatement();
		} catch (Exception e) {
			System.out.println("erro na conex�o : " + e.getMessage());
		}
	}
	public boolean estaConectado() {
		if (this.con != null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void listar() {
		try {
			String minhaQuery = "SELECT * FROM Produto ORDER BY nome";
			this.result = this.stm.executeQuery(minhaQuery);
			ResultSet resultset = result;
			while (this.result.next()) {
				System.out.println("ID: " + this.result.getString("id") + " - Nome: " + this.result.getString("nome") );
			}
		} catch(Exception e) {
			System.out.println("Erro na lista: " + e.getMessage());
		}
	}
	public void inserir(String nome, double valorUnitario, String tipoUnidade, int qtdEstoque) {
		try {
			String query = "INSERT INTO produto (nome, valorUnitario, tipoUnidade, qtdEstoque) VALUES('" + nome + "', '" + valorUnitario +"', '" + tipoUnidade + "', '"+ qtdEstoque +"');";
			this.stm.executeUpdate(query);
			System.out.println("produto " + nome +  "Incluido com SUCESSO" );
			
		} catch(Exception e) {
			System.out.println("Erro na Inclusao: " + e.getMessage());
		}
	}
	public void editar(int id, int qtdItem) {
		try {
			String query = "UPDATE produto SET qtdEstoque = qtdEstoque - '" + qtdItem + "'  WHERE id = " + id + ";";
			this.stm.executeUpdate(query);
			System.out.println("ID: " + id + " alterado com sucesso" );
		} catch(Exception e) {
			System.out.println("Erro na Alteracao: "+ e.getMessage());
		}
	}
    

}
