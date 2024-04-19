package principal;

import modelo.Automotora;
import ventana.VentanaMenuBienvenida;

public class Main {
    public static void main(String[] args) {
        // test de la ventana de menu de bienvenida
        Automotora automotora = new Automotora();
        VentanaMenuBienvenida ventana = new VentanaMenuBienvenida(automotora);
        ventana.setVisible(true);

    }
}
