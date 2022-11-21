
package ar.charlycimino.ejemplos.generics.wildcard;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TestWildcard {

    public static void main(String[] args) {
        ArrayList<Auto> misAutos = new ArrayList<>();
        ArrayList<Persona> misAmigos = new ArrayList<>();
        
        misAmigos.add(new Persona("Juan","Perez"));
        misAmigos.add(new Persona("María","Gomez"));
        misAmigos.add(new Persona("Ana","Lopez"));
        
        misAutos.add(new Auto("ABC123","Rojo"));
        misAutos.add(new Auto("CDE452","Verde"));
        misAutos.add(new Auto("SFD435","Negro"));
        misAutos.add(new Auto("RTE768","Azul"));
        
        UtilListas.mostrarLista(misAmigos);
        
    }

}
