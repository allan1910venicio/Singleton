package attsingleton;


import java.util.LinkedList;

public class DataManeger {

    private static DataManeger instance;

    private LinkedList<Pedidos> pedidos;

    private DataManeger() {
        pedidos = new LinkedList<Pedidos>();
    }

    public static DataManeger getInstance() {

        if(instance == null) {
            instance = new DataManeger();
        }

        return instance;

    }

    public void addPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }

    public LinkedList<Pedidos> getProdutos(){
        return pedidos;
    }

}
