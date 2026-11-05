public class Produto {

    //criando as classe
    private String nome;
    private Double  preco;
    private int quantidade;
    private String categoria;

    //criando o construtor
    public Produto(String nome, Double preco, int quantidade, String Categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;

    }
}

   // GETTERS SETTERS
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }

    public Double getpreco() {
        return preco;
    }
    public void setpreco(Double preco) {
        this.preco = preco;
    }
    public int getquantidade() {
         return quantidade;
    }
    public void setquantidade(int quantidade) {
         this.quantidade = quantidade;
    }
    public String getcategoria() {
         return categoria;
    }
    public void setcategoria(String categoria) {
         this.getcategoria;
    }