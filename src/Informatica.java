
public class Informatica extends Loja {

    double seguroEletronico;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double seguroEletronico) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronico = seguroEletronico;
    }

    public double getSeguroEletronicos() {
        return seguroEletronico;
    }

    public void setSeguroEletronicos(double seguroEletronico) {
        this.seguroEletronico = seguroEletronico;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSeguro Eletronico: " + seguroEletronico;
    }
}
