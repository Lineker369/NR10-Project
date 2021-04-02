package lista.jee;



import java.io.Serializable;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;





@SuppressWarnings({ "serial" })
@Named("pagina")
@SessionScoped




public class Paginas implements Serializable{


	
	private Integer pagin= 1;



public Integer getPagin() {
		return pagin;
	}

	public void setPagin(Integer pagin) {
		this.pagin = pagin;
	}


/*public void pag() {
	

	
}*/


	
}


	