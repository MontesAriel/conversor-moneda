import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class errorOpcion {
    public static void errorOpcion() {
        
        JOptionPane.showMessageDialog(
            null, 
            "Opción no válida. Por favor, elige una opción válida." ,
            "Opción no válida", 
            JOptionPane.PLAIN_MESSAGE, 
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp final\\tp-final\\src\\img\\conversor.png")
        );
        
    }
}