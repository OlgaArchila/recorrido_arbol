public class NodoArbol<T> {

    private T dato;
    private NodoArbol[] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }
    NodoArbol() {
    }
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }
    
}

