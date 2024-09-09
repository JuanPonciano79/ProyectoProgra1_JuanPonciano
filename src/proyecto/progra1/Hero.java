package proyecto.progra1;

public class Hero {

    private String nombre;
    private String clase;
    private int nivel;
    private int EXP;
    private int EXPRequerida;
    private int vida;
    private int mana;
    private int daño;
    private int defensa;

    public Hero(String nombre, String clase, int vida, int mana, int daño, int defensa) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.mana = mana;
        this.daño = daño;
        this.defensa = defensa;
        this.nivel = 1;
        this.EXP = 0;
        this.EXPRequerida = 20;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public void setEXPRequerida(int EXPRequerida) {
        this.EXPRequerida = EXPRequerida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEXP() {
        return EXP;
    }

    public int getEXPRequerida() {
        return EXPRequerida;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getDaño() {
        return daño;
    }

    public int getDefensa() {
        return defensa;
    }

    public void ganarEXP(int exp) {
        EXP = EXP + exp;
        System.out.println("Has ganado " + exp + " puntos de experiencia.");

        while (EXP >= EXPRequerida) {
            subirNivel();
        }
    }

    private void subirNivel() {
        nivel++;
        EXP = EXP - EXPRequerida;
        EXPRequerida = EXPRequerida + 15;
        vida = vida + 5;
        mana = mana + 3;
        daño = daño + 3;
        defensa = defensa + 2;

        System.out.println("¡" + nombre + " ha subido al nivel " + nivel + "!");
        System.out.println("¡Tus atributos han mejorado! \nVida: " + vida + ", Mana: " + mana + ", Daño: " + daño + " y Defensa: " + defensa);
    }

    public void atacar(Enemigo enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con " + daño + " puntos de daño.");
        enemigo.recibirDaño(daño);
    }
}

