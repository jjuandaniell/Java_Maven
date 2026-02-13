package org.example;
import  java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // esto imprime el hola mundo en la consola
        System.out.println("Hola mundo desde Java");

        // esta parte define dos variables, las multiplica y muestra el resultado
        int a = 10;
        int b = 100;
        int resultado = a * b;

        System.out.println("El resultado de la multiplicacion de 10 por 100 es: " + resultado);

        // esta parte se define un array de enteros con 10 espacios, cada valor se define de forma individual
        int[] numerosdel1al10 = new int[10];
        numerosdel1al10[0] = 1;
        numerosdel1al10[1] = 2;
        numerosdel1al10[2] = 3;
        numerosdel1al10[3] = 4;
        numerosdel1al10[4] = 5;
        numerosdel1al10[5] = 6;
        numerosdel1al10[6] = 7;
        numerosdel1al10[7] = 8;
        numerosdel1al10[8] = 9;
        numerosdel1al10[9] = 10;

        // aqui tambien se define un array de enteros
        // pero esta vez se define de forma mas sencilla, con los valores ya definidos
        // el array cuenta solo con los numeros del 1 al 5, entonces se define con un tamaño de 5 automaticamente
        int[] numerosdel1al5 = {1, 2, 3, 4, 5};


        int[] datos = {6, 2, 8, 4, 10};
        //Arrays.toString convierte el array en una cadena de texto.
        System.out.println("El array es: " + Arrays.toString(datos));

        //Arrays.sort ordena el array de menor a mayor.
        Arrays.sort(datos); // ahora "datos" es [2, 4, 6, 8, 10]
        System.out.println("ahora el array esta asi: " + Arrays.toString(datos));

        //Arrays.binarySearch busca un elemento en el array ordenado y devuelve su indice.
        int indice = Arrays.binarySearch(datos, 6); // devuelve 2, porque el 6 esta en el indice 2
        System.out.println("El indice del numero 6 es: " + indice);

        //Arrays.fill llena el array con un valor especifico.
        int[] rellenado = new int[5];
        Arrays.fill(rellenado, 1); // ahora "rellenado" es [1, 1, 1, 1, 1]
        System.out.println("El array rellenado es: " + Arrays.toString(rellenado));

        //Arrays.copyOf copia un array a otro array con un nuevo tamaño.
        int[] copia = Arrays.copyOf(datos, 3); // ahora "copia" son los primeros 3 elementos de "datos".
        System.out.println("El array copiado es: " + Arrays.toString(copia));

        //Arrays.equals compara dos arrays y devuelve true si son iguales.
        int[] comparado = {2, 4, 6, 8, 10};
        boolean sonIguales = Arrays.equals(datos, comparado); // devuelve true porque "datos" y "comparado" son iguales.
        System.out.println("Los arrays son iguales?: " + sonIguales);

        //Formas de recorrer arreglos en Java
        int[] valores = {10, 20, 30, 40, 50};

        //For tradicional (con índices)
        System.out.println("For tradicional:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Indice " + i + ": " + valores[i]);
        }

        //For-each (simplificado)
        System.out.println("For-each:");
        for (int valor : valores) {
            System.out.println("Valor: " + valor);
        }

        //Streams (funcional)
        System.out.println("Streams:");
        Arrays.stream(valores).forEach(valor -> System.out.println("Stream valor: " + valor));


        //Diferencias entre Arreglos y ArrayList
        System.out.println("\n--- Arreglos vs ArrayList ---");

        //Arrays: Tamaño fijo, tipos primitivos, rápido
        //Se debe definir el tamaño al crear o inicializar con valores
        String[] arregloEstatico = new String[2];
        arregloEstatico[0] = "Elemento 1";
        arregloEstatico[1] = "Elemento 2";
        // arregloEstatico[2] = "Elemento 3"; // Esto lanzaría error ArrayIndexOutOfBoundsException porque el tamaño es fijo
        System.out.println("Tamaño del Array: " + arregloEstatico.length); // Propiedad .length

        //Arraylist: Tamaño dinámico, solo objetos (Clases envolventes), más flexible
        ArrayList<String> listaDinamica = new ArrayList<>();
        listaDinamica.add("Elemento A"); // .add() para agregar sin preocuparse por el tamaño
        listaDinamica.add("Elemento B");
        listaDinamica.add("Elemento C");
        listaDinamica.remove("Elemento B"); // .remove() fácil de usar

        System.out.println("Tamaño del ArrayList: " + listaDinamica.size()); // Método .size()
        System.out.println("Contenido del ArrayList: " + listaDinamica);

        // Rendimiento: Array es más rápido y usa menos memoria. ArrayList es más lento pero más cómodo.
        // Uso: Usar Array cuando se conoce la cantidad exacta de elementos y se busca máximo rendimiento.
        // Usar ArrayList cuando la cantidad de elementos varía mucho o se necesitan métodos de utilidad (add, remove).
    }
}