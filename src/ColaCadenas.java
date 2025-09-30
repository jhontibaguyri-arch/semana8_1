import java.util.LinkedList;

public class ColaCadenas {
    private LinkedList<String> cola;

    public ColaCadenas() {
        cola = new LinkedList<>();
    }

    public void enqueue(String elemento) {
        cola.addLast(elemento);
    }

    public String dequeue() {
        return cola.removeFirst();
    }

    public String peek() {
        return cola.getFirst();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public int size() {
        return cola.size();
    }
}
