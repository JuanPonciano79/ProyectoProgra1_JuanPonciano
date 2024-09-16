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

    public void atacarMagia(Enemigo enemigo, int magia) {
        if (mana <= 0) {
            System.out.println("Te has quedado sin energía... ");
        } else {
            if (magia == 1) {
                System.out.println(nombre + " ha utilizado Bola de fuego, cuesta 15 puntos de mana.");
                daño = daño + 17;
                mana = mana - 15;
            } else if (magia == 2) {
                System.out.println(nombre + " ha utilizado Bola de agua, cuestas 15 puntos de mana");
                daño = daño + 20;
                mana = mana - 15;
            } else if (magia == 3) {
                System.out.println(nombre + " ha utilizado Bola de rayo, cuesta 15 puntos de mana");
                daño = daño + 18;
                mana = mana - 15;
            }
        }

        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con " + daño + " puntos de daño.");
        enemigo.recibirDaño(daño);
        System.out.println("Has utilizado mana, tu mana restante es: " + mana);
    }

    public void atacarTécnica(Enemigo enemigo, int técnica) {
        if (mana <= 0) {
            System.out.println("Te has quedado sin energía... ");
        } else {
            if (técnica == 1) {
                System.out.println(nombre + " ha utilizado Ataque Rápido, cuesta 8 puntos de mana.");
                daño = daño + 15;
                mana = mana - 8;
            } else if (técnica == 2) {
                System.out.println(nombre + " ha utilizado Ataque Cargado, cuestas 10 puntos de mana");
                daño = daño + 20;
                mana = mana - 10;
            } else if (técnica == 3) {
                System.out.println(nombre + " ha utilizado Ataque con Finta, cuesta 5 puntos de mana");
                daño = daño + 10;
                mana = mana - 5;
            }
        }

        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " con " + daño + " puntos de daño.");
        enemigo.recibirDaño(daño);
        System.out.println("Has utilizado mana, tu mana restante es: " + mana);
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

    public void bloquearAtaque(Enemigo enemigo) {
        int defensaTemporal = defensa + 10;  // Aumenta temporalmente la defensa
        int dañoRecibido = enemigo.getDaño() - defensaTemporal;
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
