package produtos;

import java.util.Objects;

public class Livro {

    private String nome;
    private String descricao;
    private String preco;
    private int quantidade;

    public Livro(){

    }
    public Livro(String nome, String descricao, String preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return quantidade == livro.quantidade && Objects.equals(nome, livro.nome) && Objects.equals(descricao, livro.descricao) && Objects.equals(preco, livro.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, preco, quantidade);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
