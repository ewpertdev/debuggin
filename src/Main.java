import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        URL direccion = new URL("https://www.ingles.com/traductor/perro");

        String html = obtenerHTML(direccion);
//        System.out.println(html);

        buscarHtml(html);

    }

    private static void buscarHtml(String html) {
        int inicio = html.indexOf("<a href=\"/traductor/dog?langFrom=en\" class=\"MhZ0VHvJ\">");

        // Devuelve la cadena resultante empezando en ese indice y hasta al final de la cadena
        String resultado = html.substring(inicio + 54, inicio + 57);
        System.out.println("La palabra traducida es: " + resultado);
    }

    private static String obtenerHTML(URL direccion) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(direccion.openStream()));
        String inputline, codigo = " ";

        while ((inputline = in.readLine()) != null) {
            codigo += inputline;

        }

        in.close();


        return null;
    }
}
