import java.util.HashMap;
import java.util.Map;

public class Alunos {
    public static void main(String[] args) {
        
        
        HashMap<Integer, String> alunos = new HashMap<>();

       
        alunos.put(1001, "Otavio Purcino");
        alunos.put(1002, "Heitor Purcino");
        alunos.put(1003, "Lucas Nery");
        alunos.put(1004, "Ana Cecilia");

        System.out.println("=== Alunos Cadastrados Inicialmente ===");
        mostrarAlunos(alunos);

        
        int matriculaBusca = 1002;
        System.out.println("\n>>> Buscando a matrícula " + matriculaBusca + "...");
        if (alunos.containsKey(matriculaBusca)) {
            String alunoEncontrado = alunos.get(matriculaBusca);
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        } else {
            System.out.println("Matrícula não encontrada.");
        }

        
        
        int matriculaRemover = 1003;
        System.out.println("\n>>> Removendo a matrícula " + matriculaRemover + "...");
        alunos.remove(matriculaRemover);

        
        System.out.println("\n=== Lista de Alunos Atualizada ===");
        mostrarAlunos(alunos);
    }

   
    public static void mostrarAlunos(HashMap<Integer, String> listaAlunos) {
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            
            for (Map.Entry<Integer, String> registro : listaAlunos.entrySet()) {
                System.out.println("Matrícula: " + registro.getKey() + " | Aluno: " + registro.getValue());
            }
        }
    }
}