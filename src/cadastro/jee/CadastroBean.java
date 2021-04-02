package cadastro.jee;

import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;







@SuppressWarnings("serial")
@SessionScoped
@Named("cadastro")



public class CadastroBean implements Serializable  {

	
	private String cliente;
	private String setor;
	private String nome;
	private String tec;
	private String data;
	
	
	
//	private Character nao = 'N';

	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTec() {
		return tec;
	}
	public void setTec(String tec) {
		this.tec = tec;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	
	

/*	public void Cad() {
		
		CadastroBean observ= new CadastroBean();
		Quadro seg= new Quadro();		

		
		if(seg.getSeguranca()==nao) {
			
			this.setObs("Falta aterrar a porta");

		}		
		
	}*/
		
	
}
