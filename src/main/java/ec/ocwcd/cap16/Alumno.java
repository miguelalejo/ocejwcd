package ec.ocwcd.cap16;

/**
 * Created by Miguel on 1/12/2015.
 */
public class Alumno implements IPersona,IAlumno {
    int edad;
    int cursos;
    String nombre;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
