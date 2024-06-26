

public class BucleOpciones {

    public static void bucleOpciones(String[] DIVISAS, String[] MESES, double[][] tiposDeCambio) {
            
        // Opciones principales del menu 
        String[] opcionesMenu = { "1. Ingrese el dinero en pesos ARG", "2. Ver tipos de cambio histórico", "3. Salir" };
        String tituloMenu = "Conversor de Divisas";
        //opcion elegida por el usuario
        int opcion = Menu.menuPrincipal(opcionesMenu, tituloMenu);

        //bandera para que se pueda salir del bucle si el usuario elige la opcion de "salir"
        boolean bandera = true;
        
        while (bandera) {
            
            //Opción 1: Ingrese el dinero en pesos ARG
            if(opcion == 1) {
                String[] opciones = { "Divisas disponibles: \n1. Dólar (USD)", "2. Euro (EUR)", "3. Libra Esterlina (GBP", "4. Yuan (CNY", "5. Real (BRL)", "6. Ver tipos de cambio histórico", "7. Salir" };
                int opcionMenuUno = Menu.menuOpcionUno(opciones, "Opción 1: Ingrese el dinero en pesos ARG");

                //si elige una moneda extranjera
                if(opcionMenuUno >= 1 && opcionMenuUno <=5) {
                    PrimeraOpcionMenu.primeraOpcionMenu(DIVISAS, MESES, tiposDeCambio, opcionMenuUno, opciones, opcion, opcionesMenu);
                }  
                
                //si elige ver tabla
                if(opcionMenuUno == 6) {
                    opcion = 2;
                }

                //si elige salir
                if(opcionMenuUno == 7) {
                    bandera = false;
                }

                if(opcionMenuUno == -1) {
                    opcion = Menu.menuPrincipal(opcionesMenu, "Conversor de divisas");
                }
            }

            //Opción 2: tabla de cambio historico
            else if(opcion == 2) {
                int opcionDos = Menu.tablaCambioHistorico(MESES, DIVISAS, tiposDeCambio, opcionesMenu);
                opcion = opcionDos;

                if(opcionDos == -1) {
                    opcion = Menu.menuPrincipal(opcionesMenu, tituloMenu);
                }
            }

            //Opción 3: Salir
            else if(opcion == 3) {    
                bandera = false;
            }


            else {
                if(opcion != -1) {
                    ErrorOpcion.errorOpcion();
                    opcion = Menu.menuPrincipal(opcionesMenu, tituloMenu);
                }
            }
        }
    }
}