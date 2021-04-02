package lista.jee;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;



@SuppressWarnings("serial")
@Named("lists")
@RequestScoped

public class Quadro implements Serializable {

//ATRIBUTOS.....	
//Características do Painel.
	private List<String> listaQuadro;
    private List<String> finalidade;
    private List<String> entrada;
    
    
// Ítens de segurança.    
    private Character seguranca;
    private Character contra;
    private Character dispositivo;
    private Character portaaterrada;
    private Character registro;
    private Character diagrama;
    private Character identificacao;
    private Character circuito;
    private Character emergencia;
    private Character acessibilidade;
    private Character limpeza;


//Características e Conservação. 
    private Character cabo;
    private Character protect;
    private Character interliga;

    
 //Comentarios e observações.
    private String seg;
	private String obs;
	
	
    
	
//MÉTODOS.....
/*	
	public String Qd( ) {
			
		Quadro painel=new Quadro();
		painel.getSeguranca();

				
		
	if (painel.getSeguranca().equals('N')) {
		
		 this.setSeg("Recomenda-se o aterramento do quadro, ");

	}



		
		}	
	
*/    
	
	
	
	

//GETTERS and SETTERS....

	public String getSeg() {
		return seg;
	}

	public void setSeg(String seg) {
		this.seg = seg;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Character getCabo() {
		return cabo;
	}

	public void setCabo(Character cabo) {
		this.cabo = cabo;
	}


	public void setSDparcial(Character sDparcial) {
	}

	public Character getInterliga() {
		return interliga;
	}

	public void setInterliga(Character interliga) {
		this.interliga = interliga;
	}


	public Character getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Character dispositivo) {
		this.dispositivo = dispositivo;
	}

	public List<String> getEntrada() {
		return entrada;
	}

	public void setEntrada(List<String> entrada) {
		this.entrada = entrada;
	}

	public List<String> getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(List<String> finalidade) {
		this.finalidade = finalidade;
	}

	public List<String> getListaQuadro() {
		return listaQuadro;
	}

	public void setListaQuadro(List<String> listaQuadro) {
		this.listaQuadro = listaQuadro;
	}


	public Character getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Character seguranca) {
		this.seguranca = seguranca;
	}

	public Character getProtect() {
		return protect;
	}

	public void setProtect(Character protect) {
		this.protect = protect;
	}

	public Character getContra() {
		return contra;
	}

	public void setContra(Character contra) {
		this.contra = contra;
	}

	public Character getPortaaterrada() {
		return portaaterrada;
	}

	public void setPortaaterrada(Character portaaterrada) {
		this.portaaterrada = portaaterrada;
	}

	public Character getRegistro() {
		return registro;
	}

	public void setRegistro(Character registro) {
		this.registro = registro;
	}

	public Character getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(Character diagrama) {
		this.diagrama = diagrama;
	}

	public Character getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Character identificacao) {
		this.identificacao = identificacao;
	}

	public Character getCircuito() {
		return circuito;
	}

	public void setCircuito(Character circuito) {
		this.circuito = circuito;
	}

	public Character getEmergencia() {
		return emergencia;
	}

	public void setEmergencia(Character emergencia) {
		this.emergencia = emergencia;
	}

	public Character getAcessibilidade() {
		return acessibilidade;
	}

	public void setAcessibilidade(Character acessibilidade) {
		this.acessibilidade = acessibilidade;
	}

	public Character getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(Character limpeza) {
		this.limpeza = limpeza;
	}
	


}
	
	

