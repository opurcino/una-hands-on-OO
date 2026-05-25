import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {
        
        ArrayList<String> listaCompras = new ArrayList<>();

        
        listaCompras.add("Leite");
        listaCompras.add("Pão");
        listaCompras.add("Ovos");
        listaCompras.add("Frutas");
        listaCompras.add("Cerveja");

        
        System.out.println("Lista de Compras:");
        for (String produto : listaCompras) {
            System.out.println("- " + produto);
        }

        System.out.println("--------------------");

        
        System.out.println("Quantidade de itens na lista: " + listaCompras.size());
    }
}






    
