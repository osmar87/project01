package rh;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private static double salarioBase = 2000.0;
    private static ArrayList<String> candidadosSelecionados = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Proceço seletivo");
        int selecionado = 0;
        int cadidatoAtual = 0;
        String[] candidato = cadidatos();
        while (selecionado < 5 && cadidatoAtual < candidato.length) {
            
            double salario = valorPretendido();
            System.out.println("O cadidato " + candidato[cadidatoAtual] + " solicidou este valor de salario R$ " + salario);

            if (salarioBase >= salario) {
                System.out.println(candidato[cadidatoAtual] + " foi selecionado para a vaga.");
                candidadosSelecionados.add(candidato[cadidatoAtual]);
                selecionado++;
            }
            cadidatoAtual++;
        }

        System.out.println("===========================================");
        System.out.println("Lista de Candidados aprovados para as vagas");
        System.out.println("===========================================");

        for (String selct : candidadosSelecionados) {
            System.out.println(selct);
        }
    }

    public static String[] cadidatos() {
        String[] nomes = {
                "Carlos",
                "Maria",
                "João",
                "Ana",
                "Pedro",
                "Juliana",
                "Lucas",
                "Fernanda",
                "Rafael",
                "Beatriz"
        };
        return nomes;
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendito) {
        if (salarioBase > salarioPretendito) {
            System.out.println("LIGA PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendito) {
            System.out.println("lIGA PARA O CANDIDATO  COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUADANDO O RESULTADO DOS DEMAIS CANDIDATO");
        }
    }
}
