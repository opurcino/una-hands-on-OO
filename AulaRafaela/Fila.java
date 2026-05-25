import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        
        Queue<String> filaClientes = new LinkedList<>();

        
        filaClientes.add("Otavio");
        filaClientes.add("Ana Cecilia");
        filaClientes.add("Helena");
        filaClientes.add("Heitor");
        filaClientes.add("Vanessa");

        System.out.println("Fila inicial: " + filaClientes);
 
        System.out.println("Próximo a ser atendido: " + filaClientes.peek());

        System.out.println("Atendendo cliente: " + filaClientes.poll());
        System.out.println("Atendendo cliente: " + filaClientes.poll());

        System.out.println("Fila atualizada: " + filaClientes);
    }
}