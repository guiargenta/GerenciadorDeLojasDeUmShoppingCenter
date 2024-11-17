
public class Cosmetico extends Loja {

    double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;

    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}
