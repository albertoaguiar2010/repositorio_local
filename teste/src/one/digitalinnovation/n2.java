package one.digitalinnovation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class n2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        List<Participante> participantes = new ArrayList<>();

        while (!linha.equals("FIM")) {
            var participante = new Participante();
            var entrada = linha.split(" ");
            participante.setNome(entrada[0]);
            participante.setAmigo(entrada[1].equals("SIM"));
            participante.setOrdemInscricao(participantes.size());
            var participanteExistente = participantes.stream()
                    .filter(p -> p.getNome().equals(participante.getNome()))
                    .findFirst()
                    .orElse(null);

            if(participanteExistente == null) {
                participantes.add(participante);
            }
            linha = br.readLine();
        }

        var participantesOrdenados = participantes.stream().sorted(Comparator
                .comparing(Participante::isAmigo).reversed()
                .thenComparing(Participante::getNome)).collect(Collectors.toList());

        participantesOrdenados.forEach(p -> {
            if(!p.getNome().equals("Abhay")) {
                System.out.println(p.getNome());
            }
        });

        List<Participante> amigos = participantesOrdenados.stream().filter(Participante::isAmigo).collect(Collectors.toList());
        Participante escolhido = null;

        for (Participante p : amigos) {
            if(escolhido == null) {
                escolhido = p;
            } else if (escolhido.getNome().length() < p.getNome().length()) {
                escolhido = p;
            } else if (escolhido.getNome().length() == p.getNome().length()
                    && escolhido.getOrdemInscricao() > p.getOrdemInscricao()) {
                escolhido = p;
            }
        }

        System.out.println("");
        System.out.println("Amigo do Pablo:");
        System.out.println(escolhido.getNome());
    }

    public static class Participante {
        private String nome;
        private boolean amigo;
        private int ordemInscricao;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public boolean isAmigo() {
            return amigo;
        }

        public void setAmigo(boolean amigo) {
            this.amigo = amigo;
        }

        public int getOrdemInscricao() {
            return ordemInscricao;
        }

        public void setOrdemInscricao(int ordemInscricao) {
            this.ordemInscricao = ordemInscricao;
        }

        @Override
        public String toString() {
            return nome;
        }
    }
}