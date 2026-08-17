package gestionproyectos;

public class Mago extends Tarea {
    private int mana;

    public Mago(String titulo, String descripcion, int mana) {
        super(titulo, descripcion);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println("Lanzando hechizo...");
    }

    public void recargarMana(int cantidad) {
        this.mana += cantidad;
    }

    //hola123
}
