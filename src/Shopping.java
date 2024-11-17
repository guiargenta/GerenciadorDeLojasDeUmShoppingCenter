import java.util.Arrays;

public class Shopping {

    String nome;
    Endereco endereco;
    Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString() {
        return
                "------Informações do Shopping------" +
                        "\nNome:" + nome +
                        "\nEndereço: " + endereco +
                        "\nLojas:" + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja loja) {

        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {

        if(     !tipoLoja.equalsIgnoreCase("Alimentacao") &&
                !tipoLoja.equalsIgnoreCase("Bijuteria") &&
                !tipoLoja.equalsIgnoreCase("Cosmético") &&
                !tipoLoja.equalsIgnoreCase("Informática") &&
                !tipoLoja.equalsIgnoreCase("Vestuário")) {
            return -1;
        }

        int contador = 0;

        for(Loja loja: lojas) {
            if(loja != null) {
                if(     tipoLoja.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao ||
                        tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria ||
                        tipoLoja.equalsIgnoreCase("Cosmético") && loja instanceof Cosmetico ||
                        tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica ||
                        tipoLoja.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {

        Informatica seguroMaisCaro = null;

        for(Loja loja: lojas) {
            if(loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;

                if(seguroMaisCaro == null || lojaInformatica.getSeguroEletronicos() > seguroMaisCaro.getSeguroEletronicos()) {
                    seguroMaisCaro = lojaInformatica; // Atualiza a loja com o seguro mais caro
                }
            }
        }

        return seguroMaisCaro;
    }
}
