public class Main {

    public static void main(String[] args) {
       NodoArbol<Integer> tree = new NodoArbol<>();

       tree.setDato(45);
       
       //tree.setDato(new NodoArbol[]{new NodoArbol(23, null), new NodoArbol(11, null)});
       
       NodoArbol[] arrNodoArbol = {new NodoArbol(23, null), new NodoArbol(11, null)};
       
       tree.setHijo(arrNodoArbol);
       //tree.setHijo(0, 50);
       tree.getHijo()[0].setHijo(0, 50);
       tree.getHijo()[0].setHijo(1, 100);
       tree.getHijo()[1].setHijo(0, 40);
       tree.preOrden();
    }
}
