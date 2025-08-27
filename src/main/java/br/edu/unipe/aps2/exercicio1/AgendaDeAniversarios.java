package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
    void adicionarAniversariante(String nome, int dia, int mes);
    ArrayList<String> obterAniversariantesDoDia(int dia, int mes);
    void removerAniversariante(String nomeAniversariante);
}
