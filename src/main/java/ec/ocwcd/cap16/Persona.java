package ec.ocwcd.cap16;

/**
 * Created by Miguel on 1/12/2015.
 */
public class Persona implements IPersona {
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
