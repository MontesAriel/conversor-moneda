
public class App {

     // Arreglo de meses
     public static final String[] MESES = { "Ago", "Sep", "Oct", "Nov", "Dic", "Ene", "Feb","Mar", "Abr", "May" };
    
     // Arreglo de divisas
     public static final String[] DIVISAS = { "Dólar", "Euro", "Libra", "Yuan", "Real" };
    public static void main(String[] args) throws Exception {

        //tipos de cambio "1.Dólar", "2.Euro", "3.Libra", "4.Yuan", "5.Real"
        double[][] tiposDeCambio = {
            { 660.75, 720.80, 805.90, 851.20, 981.21, 1150.00, 1064.71, 1125.50, 1030.00, 1230.50},
            { 117.94, 120.48, 122.82, 121.54, 128.99, 131.23, 134.12, 139.51, 144.34, 155.05 },
            { 213.84, 231.94, 237.60, 257.55, 280.77, 300.84, 325.86, 353.28, 429.61, 428.63 },
            { 16.50, 17.01, 17.50, 17.44, 18.01, 18.68, 19.46, 20.12, 20.69, 21.47 },
            { 19.79, 20.81, 23.41, 23.18, 25.38, 23.81, 25.36, 26.75, 27.19, 30.28 }
        };
    
        //bucle del menu con opciones
        BucleOpciones.bucleOpciones(DIVISAS, MESES, tiposDeCambio);
    }  
}
