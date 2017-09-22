package br.com.edp.luma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.edp.luma.beans.UserPermission;
import br.com.edp.luma.connection.ConnectionFactory;

public class UserPermissionDao{
	private Connection conn;
	
	
	public UserPermissionDao() throws Exception{
		conn = ConnectionFactory.getConnection();
			
		}
	public void fechar() throws Exception{
		conn.close();
	}
		public UserPermission avaliar(int id_user, String tipo_pessoa) throws SQLException{
			UserPermission permissao = new UserPermission();
			String sql = "SELECT ID FROM USERPERMISSIONS WHERE ID = ? AND TIPO_PESSOA =?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id_user);
			stmt.setString(2, tipo_pessoa);
			
			ResultSet resultado = stmt.executeQuery();
			
			if(resultado.next()){
				permissao.setNivelPermissao(resultado.getInt("TIPO_PERMISSAO"));
				permissao.setTipoPessoa(resultado.getString("TIPO_PESSOA"));
				permissao.setUserId(resultado.getInt("ID"));
			}
			
			return permissao;
			
		}
	
		public boolean adicionarPermissao(UserPermission permissao) throws SQLException{
			String sql = "INSERT INTO USERPERMISSIONS (ID, TIPO_PERMISSAO, TIPO_PESSOA)"
					+ "VALUES (?, ?, ?)";;
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, permissao.getUserId());
			stmt.setInt(2, permissao.getNivelPermissao());
			stmt.setString(3, permissao.getTipoPessoa());
			return stmt.execute();
		}
		
		public boolean alterarPermissao(UserPermission permissao) throws SQLException{
			String sql = "UPDATE USERPERMISSIONS SET TIPO_PERMISSAO = ?"
					+ " WHERE ID = ? AND TIPO_PESSOA = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(2, permissao.getUserId());
			stmt.setInt(1, permissao.getNivelPermissao());
			stmt.setString(3, permissao.getTipoPessoa());
			return stmt.execute();
		}
		
		
}
