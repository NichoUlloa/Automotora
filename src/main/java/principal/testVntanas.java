package principal;
import modelo.Automotora;
import ventana.*;

public class testVntanas {

    public static void main(String[] args) {
    }

    public static void testVentanaRegistrarCliente() {
        Automotora automotora = new Automotora();
        VentanaRegistrarCliente ventana = new VentanaRegistrarCliente(automotora);
        ventana.setVisible(true);


    }
}
