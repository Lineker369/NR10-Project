package lista.jee;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@SuppressWarnings("serial")
@Named("lists")
@SessionScoped

public class Quadro implements Serializable {


	
	private List<String> listaQuadro;
    private List<String> finalidade;
    private List<String> entrada;
    private List<String> seguranca;
    private List<String> protect;
    private List<String> contra;
    private List<String> dispositivo;
    private List<String> portaaterrada;
    private List<String> registro;
    private List<String> diagrama;
    private List<String> identificacao;
    private List<String> circuito;
    private List<String> emergencia;
    private List<String> acessibilidade;
    private List<String> limpeza;


    
    
    
	public List<String> getContra() {
		return contra;
	}

	public void setContra(List<String> contra) {
		this.contra = contra;
	}

	public List<String> getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(List<String> dispositivo) {
		this.dispositivo = dispositivo;
	}

	public List<String> getPortaaterrada() {
		return portaaterrada;
	}

	public void setPortaaterrada(List<String> portaaterrada) {
		this.portaaterrada = portaaterrada;
	}

	public List<String> getRegistro() {
		return registro;
	}

	public void setRegistro(List<String> registro) {
		this.registro = registro;
	}

	public List<String> getDiagrama() {
		return diagrama;
	}

	public void setDiagrama(List<String> diagrama) {
		this.diagrama = diagrama;
	}

	public List<String> getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(List<String> identificacao) {
		this.identificacao = identificacao;
	}

	public List<String> getCircuito() {
		return circuito;
	}

	public void setCircuito(List<String> circuito) {
		this.circuito = circuito;
	}

	public List<String> getEmergencia() {
		return emergencia;
	}

	public void setEmergencia(List<String> emergencia) {
		this.emergencia = emergencia;
	}

	public List<String> getAcessibilidade() {
		return acessibilidade;
	}

	public void setAcessibilidade(List<String> acessibilidade) {
		this.acessibilidade = acessibilidade;
	}

	public List<String> getLimpeza() {
		return limpeza;
	}

	public void setLimpeza(List<String> limpeza) {
		this.limpeza = limpeza;
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

	public List<String> getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(List<String> seguranca) {
		this.seguranca = seguranca;
	}

	public List<String> getProtect() {
		return protect;
	}

	public void setProtect(List<String> protect) {
		this.protect = protect;
	}


	
	
}
