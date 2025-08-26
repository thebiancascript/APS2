package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {

    private String nome;
    private DataAniversario dataAniversario;

    // Construtor 1: recebe nome, dia e mês
    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    // Construtor 2: recebe nome e objeto DataAniversario
    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataAniversario getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(DataAniversario dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aniversariante outro = (Aniversariante) obj;
        boolean mesmoNome = (nome == null) ? (outro.nome == null) : nome.equals(outro.nome);
        boolean mesmaData = (dataAniversario == null) ? (outro.dataAniversario == null) : dataAniversario.equals(outro.dataAniversario);
        return mesmoNome && mesmaData;
    }

    @Override
    public int hashCode() {
        int result = (nome != null) ? nome.hashCode() : 0;
        result = 31 * result + ((dataAniversario != null) ? dataAniversario.hashCode() : 0);
        return result;
    }
}
