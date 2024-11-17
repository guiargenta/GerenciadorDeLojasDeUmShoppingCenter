public class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= 31) {
                if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
                    diasPorMes[1] = 29; // Fevereiro tem 29 dias
                }
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

        for(int i = 0; i <= diasPorMes.length - 1; i++)
            if(dia >= 1 && dia <= diasPorMes[i]);

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public Boolean verificaAnoBissexto() {
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }
}
