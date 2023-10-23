public class PalabraMedio {
    public static String obtenerPalabraMedio(String texto) {
        String[] palabrass = texto.split("\\s+");
        int longituds = palabrass.length;
        int longitud;
        String[] palabras;
        if (longituds % 2 == 0) {
             palabras = new String[longituds+1];
            for (int i = 0; i <longituds ; i++) {
                palabras[i]=palabrass[i];
            }
            palabras[longituds]= " ";
            longitud = palabras.length;
        }else {
            palabras = new String[longituds];
            for (int i = 0; i <longituds ; i++) {
                palabras[i]=palabrass[i];
            }
            longitud = palabras.length;
        }
        String[] pmitad = new String[longitud/2];
        String[] smitad = new String[longitud/2];
        for (int i = 0; i < longitud/2 ; i++) {
            pmitad[i]=palabras[i];
        }
        for (int i = 0 ; i < longitud/2; i++) {

            smitad[i]=palabras[i+(longitud/2)];
        }
        return convertirAOracion(pmitad) +" "+ convertirAOracion(smitad);
    }
    public static String convertirAOracion(String[] palabras) {
        StringBuilder oracion = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            // Agregar la palabra actual al StringBuilder
            oracion.append(palabras[i]);

            // Agregar un espacio si no es la última palabra
            if (i < palabras.length - 1) {
                oracion.append(" ");
            }
        }
        // Convertir el StringBuilder a String y devolver la oración
        return oracion.toString();
    }

    public static void main(String[] args) {
        String texto = "Este es un ejemplo no muy bueno";
        String palabraDelMedio = obtenerPalabraMedio(texto);
        System.out.println("Palabra del medio: " + palabraDelMedio);
    }
}
