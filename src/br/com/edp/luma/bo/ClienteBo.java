package br.com.edp.luma.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.edp.luma.beans.Cliente;
import br.com.edp.luma.dao.ClienteDao;

public class ClienteBo {
	ClienteDao dao;
	
	public ClienteBo() throws Exception{
		dao = new ClienteDao();
	}
	
	public String novoCliente(Cliente cliente)throws Exception{
		if(cliente.getNome().length()>50){
			return "Nome execedeu a quantidade de caracteres";
		}
		try{
		cliente.setNome(cliente.getNome().toUpperCase());
		String x = dao.adicionar(cliente);
		dao.fechar();
		return x;
		} catch (SQLException e){
			return null;
	}
	}
	public String atualizarCliente(Cliente cliente)throws Exception{
		try{
			cliente.setNome(cliente.getNome().toUpperCase());
			String x = dao.atualizar(cliente);
			dao.fechar();
			return x;
		}
		catch(SQLException e){	
		}
		return null;
	}
			
		public String removerCliente(Cliente cliente)throws Exception{
			try{
				cliente.setNome(cliente.getNome().toUpperCase());
				String x = dao.apagar(cliente);
				dao.fechar();
				return x;
			}
			catch(SQLException e){	
			}
			return null;
		}
		
		public Cliente buscarCliente(int id)throws Exception{
			try{
				Cliente x = dao.getCliente(id);
				dao.fechar();
				return x;
				
			}
			catch(SQLException e){
				
			}
			return null;
		}
		
		public List<Cliente> getTodosClientes(){
			try{
				return dao.getClientes();
			}
			catch(SQLException e){
				
			}
			return null;
		}
	
		
	}
