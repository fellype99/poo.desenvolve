import java.util.Date;
public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro[] livro;
    private Usuario usuario;
    public Date getDataRetirada() {
        return this.dataRetirada;
    }
    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }
    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public Livro[] getLivro() {
        return this.livro;
    }
    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}