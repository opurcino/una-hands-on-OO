import java.util.HashSet;

public class ListaPresenca {
    public static void main(String[] args) {       
        
        HashSet<String> presentes = new HashSet<>();
  
        presentes.add("Otavio");
        presentes.add("Heitor");
        presentes.add("Lucas");     
        presentes.add("Ana Cecilia");
        presentes.add("Theo");    
        presentes.add("Sofia");

        System.out.println("=== Alunos Presentes (Sem Duplicações) ===");
        for (String aluno : presentes) {
            System.out.println("- " + aluno);
        }

        System.out.println("-----------------------------------------");

       
        System.out.println("Total de alunos presentes únicos: " + presentes.size());
    }
}