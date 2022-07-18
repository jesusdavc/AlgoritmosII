import java.util.ArrayList;


public class Main {
    //Se usarán dos arrays para representar los atributos de la lista y se crearán tres funciones
    //para rellenar el array ID y ls otras dos para un next cuando es Circular y otro cuando no.
    public static void fillIdArray(int lengthArray, ArrayList<Integer> id ){
        //Llena el array de ID con números enteros desde el 0
        for (int i = 0; i< lengthArray; i++){
            id.add(i);
        }

    }
    public static void fillNextArrayNonCircular(int lengthArray, ArrayList<Object> next ){
        //Llena el array que representa los nodos de forma que el último nodo es NULL de modo que es una lista
        //simple
        for (int i = 0; i< lengthArray; i++){
            if ( i != lengthArray -1){
                next.add(i+1);
            }else {
                next.add(null);
            }
        }
    }
    public static void fillNextArrayCircular(int lengthArray, ArrayList<Object> next ){
        //Llena el array de manera que el último nodo es el primero, lo llena basándose en el orden del atributo ID
        for (int i = 0; i< lengthArray; i++){
            if ( i != lengthArray -1){
                next.add(i+1);
            }else {
                next.add(0);
            }
        }
    }
    public static void itsCircular(ArrayList<Object> next, int head){
        //verifica si la lista es circular (cyclical)
        boolean itsTrue = true;
        for (int i = head; i < next.size() ; i++) {
            if(next.get(i) == null){
                itsTrue = !itsTrue;
            }
        }
        if (itsTrue){
            System.out.println("La lista es circular");
        }else{
            System.out.println("La lista no es circular");
        }
    }
    public static void main(String[] args){
        //Creamos dos arrays por cada atributo que tiene la lista
        ArrayList<Integer> id = new ArrayList<>();
        //Se crean dos arrays para representar el nodo "next" en una Lista Enlazada Circular y una No Circular

        ArrayList<Object> nextNonCircular = new ArrayList<>();
        ArrayList<Object> nextCircular = new ArrayList<>();

        fillIdArray(10, id);
        fillNextArrayCircular(id.size(), nextCircular);
        fillNextArrayNonCircular(id.size(),nextNonCircular);



        System.out.println(id);
        System.out.println(nextCircular);
        System.out.println(nextNonCircular);

        itsCircular(nextCircular, nextCircular.indexOf(0));
        itsCircular(nextNonCircular, nextCircular.indexOf(0));
    }
}