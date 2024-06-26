import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ErrorOpcion {

    public static void errorOpcion() {      
        JOptionPane.showMessageDialog(
            null, 
            "Opción no válida. Por favor, elige una opción válida." ,
            "Opción no válida", 
            JOptionPane.PLAIN_MESSAGE, 
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png") 
        );   
    }

    public static void errorMonto() { 
        JOptionPane.showMessageDialog(
            null, 
            "Debe ingresar un monto mayor a 0",
            "Monto inválido", 
            JOptionPane.PLAIN_MESSAGE, 
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png") 
        );     
    }
}