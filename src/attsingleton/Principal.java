package attsingleton;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        DataManeger pedidos = DataManeger.getInstance();

        Pedidos p = new Pedidos();

            p.setId(1);
            p.setName("Costela");
            p.setDescription("Assada");
            p.setQuantity(2);
            p.setValue(28.3);
            pedidos.addPedido(p);

        for (int i = 0;i<pedidos.getProdutos().size();i++){
            System.out.println(pedidos.getProdutos().get(i).toString());
        }
    }
}
