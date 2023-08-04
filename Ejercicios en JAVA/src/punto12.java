public class punto12 { // Contador de genero

    public static void main(String[] args) {
        // Arreglo con los objetos que representan el género
        String[] arr = { "m", "f", "f", "f", "m", "f" };

        // Contadores para niñas y niños
        int ninos = 0;
        int ninas = 0;

        // Recorremos el arreglo para contar
        for (String genero : arr) {
            if (genero.equals("m")) {
                ninos++;
            } else if (genero.equals("f")) {
                ninas++;
            }
        }

        // Mostrar resultados
        System.out.println("Número de niñas: " + ninas);
        System.out.println("Número de niños: " + ninos);
    }

}










