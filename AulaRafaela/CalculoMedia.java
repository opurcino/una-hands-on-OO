import java.util.ArrayList;

public class CalculoMedia {
    public static void main(String[] args) {
              
        ArrayList<Double> notas = new ArrayList<>();
      
        notas.add(8.5);
        notas.add(6.0);
        notas.add(7.5);
        notas.add(9.0);

       
        double soma = 0;
       
        for (Double nota : notas) {
            soma += nota;
        }
        
        double media = soma / notas.size();

       
        System.out.println("Notas registradas: " + notas);
        System.out.println("Média da turma: " + media);
        System.out.println("-----------------------------------");

       
        if (media >= 7.0) {
            System.out.println("Resultado: A turma alcançou a média! (Média maior ou igual a 7)");
        } else {
            System.out.println("Resultado: A turma não alcançou a média. (Média menor que 7)");
        }
    }
}
