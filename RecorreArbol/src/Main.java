public class Main {

    public static void main(String[] args) {
       NodoArbol<Integer> tree = new NodoArbol<>();

       tree.setDato(45);
       
       //tree.setDato(new NodoArbol[]{new NodoArbol(23, null), new NodoArbol(11, null)});
       
       NodoArbol[] arrNodoArbol = new NodoArbol(23, null), new NodoArbol(11, null);
       
       tree.setHijo(arrNodoArbol);
       System.out.println(tree.getDato());
    }
}
