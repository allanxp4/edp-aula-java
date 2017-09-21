package br.com.edp.luma.beans;

public class UserPermission {
	private int userId;
	private int nivelPermissao;
	private String tipoPessoa;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNivelPermissao() {
		return nivelPermissao;
	}
	public void setNivelPermissao(int nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
	public UserPermission(int userId, int nivelPermissao, String tipoPessoa) {
		super();
		this.userId = userId;
		this.nivelPermissao = nivelPermissao;
		this.tipoPessoa = tipoPessoa;
	}
	public UserPermission() {
		super();
	}
	
	
	
	
	
	
}
