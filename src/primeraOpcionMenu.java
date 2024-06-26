public class PrimeraOpcionMenu {


    public static void primeraOpcionMenu(String[] DIVISAS, String[] MESES, double[][] tiposDeCambio, int opcionMenuUno, String[] opciones, int opcion, String[]opcionesMenu) {

        double montoConversion = ConversionMoneda.conversiones(opcionMenuUno, tiposDeCambio, MESES, DIVISAS);
        int si_o_no_opcion = ConversionMoneda.preguntaConversion();

        //si el usuario decide realizar otra conversion con el mismo monto
        if(si_o_no_opcion == 0) {
            boolean banderaOpcionUno = true;
            while(banderaOpcionUno) {
                int nuevaOpcion = Menu.menuOpcionUno(opciones, "Opción 1: Ingrese el dinero en pesos ARG");
                if(nuevaOpcion >= 1 && nuevaOpcion<=5) {
                    ConversionMoneda.nuevaConversion(nuevaOpcion, tiposDeCambio, MESES, montoConversion);
                    int si_o_no_opcion_bucle = ConversionMoneda.preguntaConversion();
                    if(si_o_no_opcion_bucle != 0) {
                        banderaOpcionUno = false;
                    }
                }
            }
        } 
        else {
            opcion = 0;
        }
    }
}
