
package ar.charlycimino.ejemplos.generics.wildcard;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Futbolista extends Deportista {
    private int nroCamiseta;

    public Futbolista(String nombre, String apellido, int energia, int nroCamiseta) {
        super(nombre, apellido, energia);
        this.nroCamiseta = nroCamiseta;
    }    

    public void patear() {
        System.out.println("Pateando...");
    }
    
    @Override
    public String toString() {
        return super.toString() + " que es Futbolista{" + "nroCamiseta=" + nroCamiseta + '}';
    }
}
