public class primeraOpcionMenu {


    public static void primeraOpcionMenu(String[] DIVISAS, String[] MESES, double[][] tiposDeCambio, int opcionMenuUno, String[] opciones, int opcion, String[]opcionesMenu) {

        double montoConversion = conversionMoneda.conversiones(opcionMenuUno, tiposDeCambio, MESES, DIVISAS);
        int si_o_no_opcion = conversionMoneda.preguntaConversion();

        //si el usuario decide realizar otra conversion con el mismo monto
        if(si_o_no_opcion == 0) {
            boolean banderaOpcionUno = true;
            while(banderaOpcionUno) {
                int nuevaOpcion = menu.menuOpcionUno(opciones, "Opción 1: Ingrese el dinero en pesos ARG");
                if(nuevaOpcion >= 1 && nuevaOpcion<=5) {
                    conversionMoneda.nuevaConversion(nuevaOpcion, tiposDeCambio, MESES, montoConversion);
                    int si_o_no_opcion_bucle = conversionMoneda.preguntaConversion();
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
