package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private final ArrayList<Aniversariante> listaAniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.listaAniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante a = new Aniversariante(nome, dia, mes);
        if (!listaAniversariantes.contains(a)) {
            listaAniversariantes.add(a);
        }
    }

 @Override
public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
    ArrayList<String> nomes = new ArrayList<>();
    for (Aniversariante a : listaAniversariantes) {
        if (a.getDataAniversario().getDia() == dia && a.getDataAniversario().getMes() == mes) {
            nomes.add(a.getNome());
        }
    }
    return nomes;
}

    @Override
    public void removerAniversariante(String nome) {
        Aniversariante encontrado = null;
        for (Aniversariante a : listaAniversariantes) {
            if (a.getNome().equals(nome)) {
                encontrado = a;
                break;
            }
        }
        if (encontrado != null) listaAniversariantes.remove(encontrado);
    }
}
