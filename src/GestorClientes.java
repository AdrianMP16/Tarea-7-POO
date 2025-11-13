import java.util.ArrayList;
import java.util.List;
public class GestorClientes {
    private List<Cliente> listaClientes;

    public GestorClientes(){
        listaClientes=new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
        System.out.println("Cliente agregado correctamente");
    }
    public void mostrarCliente(Cliente cliente){
        System.out.println("==== Lista de clientes ====");
        for (Cliente c : listaClientes){
            c.mostrarDatos()
        }
    }

}
