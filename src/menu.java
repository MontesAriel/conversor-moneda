import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class menu {

    public static int menuOpcionUno(String[] opcionesMenu, String titulo) {
        String input = (String) JOptionPane.showInputDialog(
            null, 
            opcionesMenu, 
            titulo, 
            JOptionPane.PLAIN_MESSAGE,  
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp final\\tp-final\\src\\img\\conversor.png"), 
            null, 
            ""
        );

        if (input != null) {           
            int seleccion = Integer.parseInt(input);
            System.out.println(seleccion);
            if (seleccion >= 1 && seleccion <= opcionesMenu.length) {
                return seleccion;
            }
        }    
        return -1;   
    }

    public static int menuPrincipal(String[] opcionesMenu, String titulo) {
        String[] inputMenu = { "1. Ingrese dinero", "2. Tabla cambio historico", "3. Salir" };

        int seleccion = JOptionPane.showOptionDialog(
            null, 
            opcionesMenu, 
            titulo, 
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, 
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp final\\tp-final\\src\\img\\conversor.png"),
            inputMenu,
            inputMenu[0]
        );

        if (seleccion >= 0 && seleccion < inputMenu.length) {
            return seleccion + 1; // Devuelve la opción seleccionada (ajustada para ser 1-based)
        }

        return -1;
    }

    //menu opcion 2
    public static int tablaCambioHistorico(String[] meses, String[] divisas, double[][] tiposDeCambio, String[] opcionesMenu) {    
        String formatMeses = "%-17s";  

        String tabla = String.format(formatMeses, "Divisa");

        for (int i = 0; i < meses.length; i++) {
            tabla += String.format(formatMeses, meses[i]) ;
        }
        tabla += "\n";

        for (int i = 0; i < tiposDeCambio.length; i++) {
            tabla += String.format(formatMeses, divisas[i]);
            for (int j = 0; j < tiposDeCambio[i].length; j++) {
                String formatoNumero = String.format("%.2f", tiposDeCambio[i][j]);
               
                if (formatoNumero.length() < 6) {
                    tabla += String.format("%-16s", formatoNumero) ;
                } else if (formatoNumero.length() < 7) {
                    tabla += String.format("%-14s", formatoNumero);
                }
                else {
                    tabla += String.format("%-12s", formatoNumero);
                }
            }
            tabla += "\n";
        }

        String menu = "";

        for (int i = 0; i < opcionesMenu.length; i++) {
            menu += opcionesMenu[i] + "\n";
        }

        String input = (String) JOptionPane.showInputDialog(
            null,
            tabla + "\n" + menu,
            "Opción 2: Tipos de cambio histórico",
            JOptionPane.PLAIN_MESSAGE  
        );

        if (input != null) {           
            int seleccion = Integer.parseInt(input);
            if (seleccion >= 1 && seleccion <= opcionesMenu.length) {
                return seleccion;
            }
        } 

        return -1;          
    }
}
