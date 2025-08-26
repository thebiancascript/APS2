package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private List<Aniversariante> listaAniversariantes;

    // Construtor
    public MinhaAgendaDeAniversarios() {
        this.listaAniversariantes = new ArrayList<>();
    }

    // Adicionar aniversariante
    @Override
    public void adicionar(Aniversariante a) {
        if (!listaAniversariantes.contains(a)) { // evita duplicatas
            listaAniversariantes.add(a);
        }
    }

    // Remover aniversariante
    @Override
    public void remover(Aniversariante a) {
        listaAniversariantes.remove(a);
    }

    // Listar todos os aniversariantes
    @Override
    public List<Aniversariante> listar() {
        return new ArrayList<>(listaAniversariantes); // retorna cópia para não alterar a lista interna
    }

    // Buscar por nome
    @Override
    public Aniversariante buscarPorNome(String nome) {
        for (Aniversariante a : listaAniversariantes) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null; // não encontrado
    }
}
