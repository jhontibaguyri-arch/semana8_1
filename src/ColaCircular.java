public class ColaCircular {
    private int[] elementos;
    private int frente;
    private int final_;
    private int tamaño;
    private final int capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        elementos = new int[capacidad];
        frente = 0;
        final_ = -1;
        tamaño = 0;
    }

    public void enqueue(int elemento) {
        if (isFull()) {
            throw new IllegalStateException("La cola está llena");
        }
        final_ = (final_ + 1) % capacidad;
        elementos[final_] = elemento;
        tamaño++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int elemento = elementos[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return elemento;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos[frente];
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public boolean isFull() {
        return tamaño == capacidad;
    }

    public int size() {
        return tamaño;
    }
}
