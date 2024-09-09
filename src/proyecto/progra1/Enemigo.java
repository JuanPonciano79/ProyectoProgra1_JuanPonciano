package proyecto.progra1;

public class Enemigo {

    private String nombre;
    private int vida;
    private int daño;
    private int defensa;
    private String debilidad;
    private int soltarEXP;

    public Enemigo(String nombre, int vida, int daño, int defensa, String debilidad, int soltarEXP) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
        this.defensa = defensa;
        this.debilidad = debilidad;
        this.soltarEXP = soltarEXP;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

     public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
     
    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public void setSoltarEXP(int soltarEXP) {
        this.soltarEXP = soltarEXP;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getDaño() {
        return daño;
    }
    public int getDefensa() {
        return defensa;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public int getSoltarEXP() {
        return soltarEXP;
    }

    public void recibirDaño(int daño) {
        
        int dañoReal = daño - defensa;

        vida = vida - dañoReal;

        System.out.println(nombre + " ha recibido " + dañoReal + " puntos de daño. Vida restante: " + vida);
        if (vida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }
}
