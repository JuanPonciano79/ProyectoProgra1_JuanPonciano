package proyecto.progra1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ProyectoProgra1 {

    public static void main(String[] args) {

        //Nombre del juego: Por definir
        //Mundo Avidus, mundo de fantasía, el objetivo es salvar al mundo y derrotar al malvado Dios Dragon.
        /*
        Batallas por turnos, jugador vs un enemigo
        jugador (tres clases) Mago, Caballero y Intermedio
        Ataque Normal, magia (en el caso del mago), Técnicas (en el caso del caballero) y ambas (aunque ambas son más débiles)
        Magias (Fuego, Hielo, Agua y Rayo)
        Técnicas (Probabilidad de noquear por un turno)
        Defensa
        Probabilidad de crítico
        Utilizar objetos (tendrán probabilidad de aparecer aleatoreamente tras terminar cada batalla)
        Si el jugador es derrotado, entonces terminará el juego (final malo que varia dependiendo el momento de la pérdida)
        Nivel del jugador aumentará tras conseguir experiencia (20 primer nivel, a esto se le sumarán 15 puntos por cada nivel)
        Dificultad de enemigos aumentará cada en cada enfrentamiento
         */
        Scanner rud = new Scanner(System.in);
        
        ArrayList<Hero> héroe = new ArrayList();
        ArrayList<Enemigo> enemigo = new ArrayList();
        ArrayList<Objetos> objeto = new ArrayList();

        Enemigo Hada = new Enemigo("Hada", 100, 10, 5, "Agua", 7);
        Enemigo Random = new Enemigo("EnemigoPrueba2", 150, 10, 8, "Agua", 10);

        enemigo.add(Hada);
        enemigo.add(Random);

        //Pequeño tutorial para enseñar cómo funcionará el juego (fuera de combate)
        System.out.println("Avisos\nPara continuar el diáglo, presiona la tecla 'enter'");
        System.out.println("¡Inténtalo!");
        rud.nextLine();
        System.out.println("¡Así mismo!\nAhora, por favor se bienvenido al mundo de Avidus...");
        rud.nextLine();
        System.out.println("Cargando juego...");
        rud.nextLine();
        
        //Inicio del juego
        System.out.println("¡Héreo que salvará al mundo y derrotará al mal! ¿Cómo te llamas?");
        System.out.print("Ingresa tu nombre: ");
        String nombre = rud.nextLine();
        System.out.println("");
        System.out.println("Conque " + nombre + ", ¿eh?");
        System.out.println(nombre + ", te enfrentarás a muchos enemigos y lucharás por el bien de la humanidad...");
        rud.nextLine();
        System.out.println("Ahora... ¿qué clase de Héroe serás?");
        rud.nextLine();

        //Datos iniciales (de la clase del héroe)
        String clase = "";
        int vida = 0;
        int mana = 0;
        int daño = 0;
        int defensa = 0;

        boolean menuHero = true;
        int errores = 0;
        //While que escoge la clase del héreo, si se selecciona una decisión inválida por más de 5 veces, entonces el programa acaba (primer final malo)
        while (menuHero) {
            System.out.println("**********Héroes**********");
            System.out.println("1) Gran Mago Hechizero");
            System.out.println("2) Gran Caballero del Reino Groa");
            System.out.println("3) Mercenario Versátil");
            System.out.println("¿Quién sos héroe?");
            System.out.print("Selecciona tu clase: ");
            int hero = rud.nextInt();
            switch (hero) {
                case 1 -> {
                    System.out.println("Has escogido la clase 'Mago'");
                    System.out.println("");
                    clase = "Mago";
                    vida = 80;
                    mana = 100;
                    daño = 15;
                    defensa = 20;
                    menuHero = false;
                    break;
                }
                case 2 -> {
                    System.out.println("Has escogido la clase Caballero");
                    System.out.println("");
                    clase = "Caballero";
                    vida = 150;
                    mana = 50;
                    daño = 20;
                    defensa = 30;
                    menuHero = false;
                    break;
                }
                case 3 -> {
                    System.out.println("Has escogido la clase Intermedia");
                    System.out.println("");
                    vida = 100;
                    mana = 75;
                    daño = 12;
                    defensa = 25;
                    menuHero = false;
                    break;
                }
                default -> {
                    //Distitnso mensajes dependiendo de los errores que se han hecho
                    if (errores == 0 || errores == 1) {
                        System.out.println("Parece que te has equivocado...");
                    }

                    if (errores == 2) {
                        System.out.println("¿¡Estas huyendo de tus responsabilidades!?");

                    }
                    if (errores == 3) {
                        System.out.println("¡¿Héroe, no huyas!?");

                    }
                    if (errores == 4) {
                        finalMalo1(); //para dejar el main un poco más vacío, se dejarán distintos métodos con los distintos finales
                        System.exit(0); //termina el juego (final malo)

                    }
                    System.out.println("");
                    errores++;
                    break;
                }
            }
        }
        //se inicializa en un objeto la clase de Héroe decidida anteriormente
        
        Hero Héroe = new Hero(nombre, clase, vida, mana, daño, defensa);
        héroe.add(Héroe);
        
        //Inicio de la aventura
        System.out.println("Bien, ahora todo los pasos necesarios han sido hechos...");
        rud.nextLine();
        System.out.println("Tu aventura ahora comenzará, ¿lograrás salvar a la humanidad?");
        rud.nextLine();
        System.out.println("O tal vez... ¿la condenarás?");
        rud.nextLine();
        System.out.println("No puedo esperar a verlo...");
        rud.nextLine();

        //Primer acto.
        System.out.println("Acto 1: El inicio");
        rud.nextLine();
        System.out.println("***************************************************");
        System.out.println("Oscuridad... todo estaba muy oscuro...");
        rud.nextLine();
        System.out.println("Voz en algún lugar:\n´¡Oyeeee!´");
        rud.nextLine();
        System.out.println("Escuchaba una voz...");
        rud.nextLine();
        System.out.println("Voz desconocida:\n'¡Despertá!'");
        rud.nextLine();
        System.out.println("*Abrí lentamente los ojos y me encontré a... ¿un hada?*");
        rud.nextLine();
        System.out.println("Hada:\n'¡Has despertado!'");
        System.out.println("¿Qué querés decir?");
        System.out.println("1) ¿Quién sos?");
        System.out.println("2) ¿Un hada?");
        System.out.println("3) Odio las hadas...");
        System.out.print("Ingrese un número: ");
        int decisión1 = rud.nextInt();
        rud.nextLine();
        
        //programa de prueba
        //Charla con el hada
        boolean op1 = true;
        while (op1) {
            switch (decisión1) {
                case 1 -> {
                    System.out.println("Voz desconocida:\n'Soy un hada'");
                    rud.nextLine();
                    break;
                }
                case 2 -> {
                    System.out.println("Voz desconocida:\n'Veo que captas las cosas rápido, ¿eh?'");
                    rud.nextLine();
                    break;
                }
                case 3 -> {
                    //Si se escoge esta, entonces habrá una pelea (de prueba)
                    System.out.println("Voz desconocida:\n'¿Estás diciendo que me odías?'");
                    rud.nextLine();
                    System.out.println("Voz desconocida:\n'¡Bien pues! Estoy muy enojada... ¡te mataré!'");
                    rud.nextLine();

//                    int vidaHero = héroe.get(0).getVida();
//                    int vidaEnemigo = enemigo.get(0).getVida();

                    int EXPGanada = enemigo.get(0).getSoltarEXP();

                    while (héroe.get(0).getVida() > 0 && enemigo.get(0).getVida() > 0) {
                        //Pelea (incompleta)
                        System.out.println("");
                        System.out.println("***********MENÚ DE BATALLA***********");
                        System.out.println("1) Atacar  || 2) Técnias  || 3) Magias");
                        System.out.println("4) Defensa || 5) Utilizar objetos || 6) Huir");
                        System.out.print("Eliga lo que quiere hacer: ");
                        int op = rud.nextInt();
                        switch (op) {
                            case 1 -> {
                                Héroe.atacar(Hada); //llama al método "atacar" de la clase "Hero", esta es la que hace daño al enemigo
                                break;
                            }
                            case 2 -> {
                                if (clase.equals("Mago")) {
                                    System.out.println("¡" + nombre + " ha intentado utilizar una técnica!");
                                    System.out.println("Sin embargo, has recordado que sos un mago y que no sabés ninguna técnica...");
                                    break;
                                }
                                break;
                            }
                            case 3 -> {
                                if (clase.equals("Caballero")) {
                                    System.out.println("¡" + nombre + " ha intentado utilizar una magia!");
                                    System.out.println("Sin embargo, has recordado que sos un noble caballero y que no sabés ninguna magia...");
                                    break;
                                }
                                break;
                            }
                            case 4 -> {

                                break;
                            }
                            case 5 -> {

                                break;
                            }
                            case 6 -> {

                                break;
                            }
                            default -> {
                                System.out.println("Opción inválida");
                            }
                        }
                        if (héroe.get(0).getVida() <= 0) {
                            String nombreJugador = héroe.get(0).getNombre();
                            String nombreEnemigo = enemigo.get(0).getNombre();
                            muerteJugador(nombreJugador, nombreEnemigo);

                        } else if (enemigo.get(0).getVida() <= 0) {
                            Héroe.ganarEXP(EXPGanada);
                            
                        int nivel = Héroe.getNivel();
                        int EXP = Héroe.getEXP();
                        int EXPRequerida = Héroe.getEXPRequerida();
                        muerteEnemigo(nivel, EXP, EXPRequerida);
                            op1 = false;
                            break;
                        }
                    }

                    break;
                }
                default -> {
                    System.out.println("Opción Inválida");
                }
            }
        }
    }

    public static void finalMalo1() {
        Scanner rud = new Scanner(System.in);
        System.out.println("Me has decepcionado Héroe... parece que me he equivocado con vos...");
        System.out.println("Debido a la indecisión del Héroe, nunca se envió al salvador del mundo...");
        rud.nextLine();
        System.out.println("El mundo nunca logró ser salvado y todo fue por culpa del Héroe indeciso...");
        rud.nextLine();
        System.out.println("Final Malo: Héroe cobarde");
        rud.nextLine();
    }

    public static void finalMalo2() {
        Scanner rud = new Scanner(System.in);
        System.out.println("Debido a la muerte prematura del héroe, el reino cayó en el pánico y los demonios invadieron el reino.");
        rud.nextLine();
        System.out.println("Ahora todos los habitantes del reino viven sus vidas siendo esclavos de los demonios.");
        rud.nextLine();
        System.out.println("Final Malo: Héroe Asesinado");
        rud.nextLine();
    }

    public static void muerteJugador(String nombreJugador, String nombreEnemigo) {
        Scanner rud = new Scanner(System.in);
        System.out.println("¡No puede ser!");
        rud.nextLine();
        System.out.println(nombreJugador + ", as muerto en tu batalla contra " + nombreEnemigo + " ¿Ahora quién salvará al mundo?");
        finalMalo2();
        System.exit(0);
    }

    public static void muerteEnemigo(int nivel, int EXP, int EXPRequerida) {
        System.out.println("Nivel actual: " + nivel);
        System.out.println("Experiencia actual: " + EXP);
        System.out.println("Experiencia necesaria para el siguiente nivel: " + EXPRequerida);

    }
}
