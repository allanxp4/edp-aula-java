package br.com.edp.luma.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.edp.luma.beans.Atendimento;
import br.com.edp.luma.dao.AtendimentoDao;

public class AtendimentoBo {
	AtendimentoDao dao;
	
	public AtendimentoBo() throws Exception{
		dao = new AtendimentoDao();
	}
	
	public boolean adicionarAtendimento(Atendimento atendimento){
		try {
			return dao.adicionar(atendimento);
		} catch (SQLException e) {
		}
		return false;
	}
	
	public boolean editarAtendimento(Atendimento atendimento){
		try {
			return dao.adicionar(atendimento);
		} catch (SQLException e) {	
		}
		return false;
	}
	
	public boolean removerAtendimento(Atendimento atendimento){
		try{
			return dao.apagar(atendimento);
		}
		catch(SQLException e){
			
		}
		return false;
	}
	
	public Atendimento buscarAtendimento(int id){
		try{
			return dao.getAtendimento(id);
		}
		catch(SQLException e){
			
		}
		return null;
	}
	
	public List<Atendimento> getTodosAtendimentos(){
		try{
			return dao.getAtendimentos();
		}
		catch(SQLException e){
			
		}
		return null;
	}
}
