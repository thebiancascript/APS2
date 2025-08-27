package br.edu.unipe.aps2.exercicio1;

public class DataAniversario {

    private final int dia;
    private final int mes;

    public DataAniversario(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DataAniversario)) return false;
        DataAniversario outra = (DataAniversario) obj;
        return this.dia == outra.dia && this.mes == outra.mes;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(dia) * 31 + Integer.hashCode(mes);
    }

    @Override
    public String toString() {
        return dia + "/" + mes;
    }
}
