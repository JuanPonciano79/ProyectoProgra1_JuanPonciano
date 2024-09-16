package proyecto.progra1;

public class Enemigo {

    private String nombre;
    private int vida;
    private int daño;
    private int defensa;
    private int soltarEXP;

    public Enemigo(String nombre, int vida, int daño, int defensa, int soltarEXP) {
        this.nombre = nombre;
        this.vida = vida;
        this.daño = daño;
        this.defensa = defensa;
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

    public int getSoltarEXP() {
        return soltarEXP;
    }

    public void recibirDaño(int daño) {

        int dañoReal = daño - defensa;
        if (daño < defensa) {
            dañoReal = 0;
        }
        vida = vida - dañoReal;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nombre + " ha sido derrotado.");
        }

        System.out.println(nombre + " ha recibido " + dañoReal + " puntos de daño. Vida restante: " + vida);
        
    }

    public void atacar(Hero héroe) {
        System.out.println(nombre + " ataca a " + héroe.getNombre() + " con " + daño + " puntos de daño.");
        héroe.recibirDaño(daño);
    }
    
    public void atacarSpecial(Hero héroe, int opción) {
        if (opción == 0) {
            System.out.println(nombre + " ha atacado con desesperación");
            daño = daño +50;
        }else if (opción == 1){
            System.out.println(nombre + " ha atacado con furia");
            daño = daño + 30;
        }else if (opción == 2){
            System.out.println(nombre +" ha realizado un ataque Kamikaze");
            daño = daño + 100;
            vida = 1;
        }
        System.out.println(nombre + " ataca a " + héroe.getNombre() + " con " + daño + " puntos de daño.");
        héroe.recibirDaño(daño);
    }

    public void bloquearAtaque(Hero héroe) {
        int defensaTemporal = defensa + 10;  // Aumenta temporalmente la defensa
        int dañoRecibido = héroe.getDaño() - defensaTemporal;
        if (dañoRecibido < 0) {
            dañoRecibido = 0;
        }
        vida = vida - dañoRecibido;
        if (vida <= 0) {
            System.out.println(nombre + " ha bloqueado el ataque, sin embargo se ha muerto...");
        } else {
            System.out.println(nombre + " ha bloqueado el ataque con éxito. Daño recibido: " + dañoRecibido);
        }

    }
}
