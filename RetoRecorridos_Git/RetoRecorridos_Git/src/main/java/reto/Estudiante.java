package reto;

/**
 * Representa a un estudiante almacenado en el árbol binario de búsqueda.
 */
public class Estudiante {
    private final int matricula;
    private final String identificacion;
    private final String nombre;
    private final int nivel;

    public Estudiante(int matricula, String identificacion, String nombre, int nivel) {
        this.matricula = matricula;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
}
