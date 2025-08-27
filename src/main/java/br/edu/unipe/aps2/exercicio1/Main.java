package br.edu.unipe.aps2.exercicio1;

public class Main {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        // Adicionando aniversariantes
        agenda.adicionarAniversariante("Bianca", 26, 8);
        agenda.adicionarAniversariante("Matheus", 26, 8);
        agenda.adicionarAniversariante("Jay", 1, 1);

        // Exibindo aniversariantes do dia 26/8
        System.out.println("Aniversariantes de 26/8:");
        for (String nome : agenda.obterAniversariantesDoDia(26, 8)) {
            System.out.println(nome);
        }

        // Remover Matheus
        agenda.removerAniversariante("Matheus");

        // Exibindo novamente
        System.out.println("\nApós remover Matheus:");
        for (String nome : agenda.obterAniversariantesDoDia(26, 8)) {
            System.out.println(nome);
        }
    }
}
