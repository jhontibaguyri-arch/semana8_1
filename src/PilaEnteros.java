import java.util.ArrayDeque;

public class PilaEnteros {
    private ArrayDeque<Integer> pila;

    public PilaEnteros() {
        pila = new ArrayDeque<>();
    }

    public void push(Integer elemento) {
        pila.push(elemento);
    }

    public Integer pop() {
        return pila.pop();
    }

    public Integer peek() {
        return pila.peek();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public int size() {
        return pila.size();
    }
}
