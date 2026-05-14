public class NodoArbol<T> {
    private T dato;
    private NodoArbol[] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }

    public NodoArbol() {
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
    
    public void setHijo (int pos, T dato){
        
        if(hijo == null){//pregunta si hay arreglo
        hijo = new NodoArbol[pos + 1];//crea el arreglo la casillita del hijo
        }
    // pregunta si la posicion que quiero usar
    // es mayor o igual al tamaño actual del arreglo
    if(pos >= hijo.length){
        
        // crea un arreglo auxiliar más grande
        NodoArbol[] aux = new NodoArbol[pos + 1];
        
        // copia los hijos que ya existían
        for(int i = 0; i < hijo.length; i++){
            aux[i] = hijo[i];
        }
        // el arreglo hijo ahora será el nuevo arreglo grande
        hijo = aux;
    }
    
    // crea un nuevo nodo con el dato recibido
    // y sin hijos (null)
    hijo[pos] = new NodoArbol(dato, null);
}
    
    public void preOrden(){
         
        System.out.print(this.dato);
         if (hijo == null) return ;
         for (NodoArbol n : hijo) {
             //if (n != null) {
             System.out.print(" , ");
             n.preOrden();
         }
    }
}
