import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConversionMoneda {
    
    public static double conversiones(int opcionDivisa, double[][] tiposDeCambio, String[] meses, String[] divisas) {
        
        //moneda que eligió el usuario para realizar la conversion
        String divisaExtranjera = divisas[opcionDivisa -1];
        double cambio = tiposDeCambio[opcionDivisa -1][meses.length - 1];
        boolean bandera = true;

        while(bandera){        
            String input = (String) JOptionPane.showInputDialog(
                null, 
                "Ingresar la cantidad en pesos ARG que desea convertir a " + divisaExtranjera, 
                "Conversión", 
                JOptionPane.PLAIN_MESSAGE, 
                new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png"), 
                null, 
                ""
            );
    
    
            //mostrar resultado
            if (input != null) {           
                double monto = Double.parseDouble(input);
                if(monto > 0) {
                    double resultado = monto / cambio;
                    String resultadoFormateado = String.format("%.2f", resultado);
                    JOptionPane.showMessageDialog(
                        null, 
                        "El resultado del tipo de cambio es: " + resultadoFormateado, 
                        "Conversión", 
                        JOptionPane.PLAIN_MESSAGE, 
                        new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png") 
                    );
                    bandera = false;
                    return monto;
                } else {
                    ErrorOpcion.errorMonto();
                }          
            } 
        }
        return -1; 
    }

    public static double nuevaConversion(int opcionDivisa, double[][] tiposDeCambio, String[] meses, double montoConversion) {

        double cambio = tiposDeCambio[opcionDivisa -1][meses.length - 1];
        double resultado = montoConversion / cambio;
        String resultadoFormateado = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(
            null, 
            "El resultado del tipo de cambio es: $ " + resultadoFormateado, 
            "Conversión", 
            JOptionPane.PLAIN_MESSAGE, 
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png")
        );

        return montoConversion;
    }

    public static int preguntaConversion() {

        int si_no_opcion = (int) JOptionPane.showConfirmDialog(
            null, 
            "desea realizar otra conversión con la misma cantidad en pesos?", 
            "Conversión", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            new ImageIcon("C:\\Users\\Usuario\\Desktop\\tp-final\\src\\img\\conversor.png")
        );
        
        return si_no_opcion;
    }
}
