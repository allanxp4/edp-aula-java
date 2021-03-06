package br.com.edp.luma.beans;

import java.sql.Date;

public class Atendimento {
	private int atendente_id;
	private int cliente_id;
	private int local_id;
	private int ocorrencia_id;
	private float temp_atendimento;
	private Date date;
	private String avaliacao;
	public int getAtendente_id() {
		return atendente_id;
	}
	public void setAtendente_id(int atendente_id) {
		this.atendente_id = atendente_id;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public int getLocal_id() {
		return local_id;
	}
	public void setLocal_id(int local_id) {
		this.local_id = local_id;
	}
	public int getOcorrencia_id() {
		return ocorrencia_id;
	}
	public void setOcorrencia_id(int ocorrencia_id) {
		this.ocorrencia_id = ocorrencia_id;
	}
	public float getTemp_atendimento() {
		return temp_atendimento;
	}
	public void setTemp_atendimento(float temp_atendimento) {
		this.temp_atendimento = temp_atendimento;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Atendimento(int atendente_id, int cliente_id, int local_id, int ocorrencia_id, float temp_atendimento,
			Date date, String avaliacao) {
		super();
		this.atendente_id = atendente_id;
		this.cliente_id = cliente_id;
		this.local_id = local_id;
		this.ocorrencia_id = ocorrencia_id;
		this.temp_atendimento = temp_atendimento;
		this.date = date;
		this.avaliacao = avaliacao;
	}
	public Atendimento() {
		super();
	}
	
}
