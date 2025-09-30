//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejemplo de PilaEnteros
        System.out.println("=== Ejemplo de Pila de Enteros ===");
        PilaEnteros pila = new PilaEnteros();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Elemento superior: " + pila.peek());
        System.out.println("Sacando elementos:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        // Ejemplo de ColaCadenas
        System.out.println("\n=== Ejemplo de Cola de Cadenas ===");
        ColaCadenas cola = new ColaCadenas();
        cola.enqueue("Primero");
        cola.enqueue("Segundo");
        cola.enqueue("Tercero");
        System.out.println("Tamaño de la cola: " + cola.size());
        System.out.println("Primer elemento: " + cola.peek());
        System.out.println("Sacando elementos:");
        while (!cola.isEmpty()) {
            System.out.println(cola.dequeue());
        }

        // Ejemplo de ColaCircular
        System.out.println("\n=== Ejemplo de Cola Circular ===");
        ColaCircular colaCircular = new ColaCircular(5);
        for (int i = 1; i <= 5; i++) {
            colaCircular.enqueue(i);
        }
        System.out.println("Tamaño de la cola circular: " + colaCircular.size());
        System.out.println("¿Cola llena? " + colaCircular.isFull());
        System.out.println("Primer elemento: " + colaCircular.peek());
        System.out.println("Sacando elementos:");
        while (!colaCircular.isEmpty()) {
            System.out.println(colaCircular.dequeue());
        }
    }
}