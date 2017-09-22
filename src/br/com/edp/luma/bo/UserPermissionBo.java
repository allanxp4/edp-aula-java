package br.com.edp.luma.bo;

import java.sql.SQLException;
import java.util.Arrays;

import br.com.edp.luma.beans.UserPermission;
import br.com.edp.luma.dao.UserPermissionDao;

public class UserPermissionBo {


	
	public UserPermission avaliar(int id_user, String tipo_pessoa) throws Exception{
		
		UserPermission userPermission = new UserPermission();
		
		//Valida��o ID
		if(id_user <=99999 && id_user >= 1000000){
			userPermission.setNivelPermissao(-1);
			userPermission.setTipoPessoa("Inv�lido");
			userPermission.setUserId(-1);
			return userPermission;
		}
		if(tipo_pessoa == ""){
			userPermission.setNivelPermissao(-1);
			userPermission.setTipoPessoa("Inv�lido");
			userPermission.setUserId(-1);
			return userPermission;
		}
		
		public boolean adicionarPermissao(UserPermission permissao) throws SQLExceptin{
			if()
		}
		
		
		
		UserPermissionDao dao = new UserPermissionDao();
		UserPermission x = dao.avaliar(id_user, tipo_pessoa);
		dao.fechar();
		return x;
		
	}
}
