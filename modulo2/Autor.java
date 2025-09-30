public class Autor extends Pessoa{
	private String nacionalidade;
	private String[] obrasPublicadas;  
    	private String[] obrasPorGenero;
	public String getNacionalidade(){
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
        	this.nacionalidade = nacionalidade;
    	}
	public String[] getObraspublicadas(){
		return this.obrasPublicadas;
	}
	public void setObrasPublicadas(String[] obrasPublicadas) {
        	this.obrasPublicadas = obrasPublicadas;
   	}
    	public String[] getObrasPorGenero() {
        	return this.obrasPorGenero;
    	}

    	public void setObrasPorGenero(String[] obrasPorGenero) {
        	this.obrasPorGenero = obrasPorGenero;
    	}
}