package proyecto.progra1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ProyectoProgra1 {

    private static final Scanner rud = new Scanner(System.in);

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
        Utilizar objetos (tendrán probabilidad de aparecer aleatoreamente tras terminar cada batalla)
        Si el jugador es derrotado, entonces terminará el juego (final malo que varia dependiendo el momento de la pérdida)
        Nivel del jugador aumentará tras conseguir experiencia (20 primer nivel, a esto se le sumarán 15 puntos por cada nivel)
        Dificultad de enemigos aumentará cada en cada enfrentamiento
         */

        ArrayList<Hero> héroe = new ArrayList();
        ArrayList<Enemigo> enemigo = new ArrayList();

        Gam3 play2 = new Gam3();
        play2.setVisible(true);
        play2.setLocale(null);
        
        
//        Game play = new Game();
//
//        play.setVisible(true);
//        play.setLocation(1,1);


        //Pequeño tutorial para enseñar cómo funcionará el juego (fuera de combate)
        System.out.println("Avisos\nPara continuar el diáglo, presiona la tecla 'enter'");
        System.out.println("¡Inténtalo!");
        rud.nextLine();
        System.out.println("¡Así mismo!\nAhora, por favor se bienvenido al mundo de Avidus...");
        rud.nextLine();
        System.out.println("Cargando juego...");
        rud.nextLine();
        
        
        historiaInicial(); //se llama un método donde se detalla la historia del juego
        
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
            System.out.println("¿Quién sos héroe?");
            System.out.print("Selecciona tu clase: ");
            int hero = rud.nextInt();
            switch (hero) {
                case 1 -> {
                    System.out.println("Has escogido la clase 'Mago'");
                    System.out.println("");
                    clase = "Mago";
                    vida = 550;
                    mana = 300;
                    daño = 150;
                    defensa = 80;
                    menuHero = false;
                    break;
                }
                case 2 -> {
                    System.out.println("Has escogido la clase Caballero");
                    System.out.println("");
                    clase = "Caballero";
                    vida = 600;
                    mana = 200;
                    daño = 190;
                    defensa = 100;
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
        System.out.println("Acto 1: El inicio y el fin");
        rud.nextLine();
        System.out.println("***************************************************");
        System.out.println("Oscuridad... todo estaba muy oscuro...");
        rud.nextLine();
        System.out.println("Voz en algún lugar:\n´¡Oyeeee!´");
        rud.nextLine();
        System.out.println("*Escuchaba una voz...*");
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
        
        //Charla con el hada
        boolean op1 = true;
        while (op1) {
            switch (decisión1) {
                case 1 -> {
                    System.out.println("Voz desconocida:\n'Soy un hada, ¿acaso no lo ves?'");
                    rud.nextLine();
                    op1 = false;
                    break;
                }
                case 2 -> {
                    System.out.println("Voz desconocida:\n'Veo que captas las cosas rápido, ¿eh? ¡Claro que soy un hada!'");
                    rud.nextLine();
                    op1 = false;
                    break;
                }
                case 3 -> {
                    //Si se escoge esta, entonces habrá una pelea 
                    System.out.println("Voz desconocida:\n'¿Estás diciendo que me odías?'");
                    rud.nextLine();
                    System.out.println("Voz desconocida:\n'¡Bien pues! Estoy muy enojada... ¡te mataré!'");
                    rud.nextLine();

                    Enemigo Hada = new Enemigo("Hada", 250, 90, 50, 70); //Nombre, vida, daño, defensa, EXP

                    enemigo.add(Hada); //se añade al personaje a enfrentar

                    while (héroe.get(0).getVida() > 0 && enemigo.get(0).getVida() > 0) {
                        batalla(Héroe, enemigo.get(0)); //se llama al método de "batalla"
                    }
                    if (enemigo.get(0).getVida() <= 0) {
                        System.out.println("Tras asesinar al Hada porque " + héroe.get(0).getNombre() + " odia a las hadas");
                        rud.nextLine();
                        System.out.println(héroe.get(0).getNombre() + " ha decidido asesinar a todas la hadas que existen en el mundo");
                        finJuego(); //se termina el juego porque asesina al guía del mismo.
                    }
                    enemigo.remove(Hada); // tras terminar la batalla con el hada, se elimina del ArrayList puesto en el método "batalla", siempre se llama la primera posición del ArrayList.
                    op1 = false;
                    break;
                }
                default -> {
                    System.out.println("Opción Inválida");
                }
            }
        }
        
        //continúa la historia
        System.out.println("Hada:\n'Ejem... estoy aquí para guiarte hacía la guarida del rey dragon'");
        rud.nextLine();
        System.out.println("Hada:\n'No lo has olvidado, ¿cierto? ¡Sos el gran héroe que salvará el mundo!'");
        rud.nextLine();
        
        boolean op2 = true;
        while (op2) {
            System.out.println("¿Qué querés decir?");
            System.out.println("1) Los héroes no existen");
            System.out.println("2) ¡Nadie me dijo eso!");
            System.out.println("3) ¿¡Eso acaso significa que cuando venza a los enemigos tendré fama y riqueza!?");
            System.out.print("Escribe tu opción: ");
            int op2Num = rud.nextInt();
            rud.nextLine();
            switch (op2Num) {
                case 1 -> {
                    System.out.println("Hada:\n'¿Cómo que no existen? ¿¡Quién diablos te eligió a vos como héreo!?'");
                    rud.nextLine();
                    op2 = false;
                    break;
                }
                case 2 -> {
                    System.out.println("Hada:\n¿¡No has leído lo que el juego te ha dicho acaso!? Vaya héroe este...");
                    op2 = false;
                    break;
                }
                case 3 -> {
                    System.out.println("Hada:\nNo sos en realidad el villano, ¿cierto?");
                    op2 = false;
                    break;
                }
                default -> {
                    System.out.println("¡Escoge una decisión válida!");
                }
            }
        }
        System.out.println("Hada:\n'Me gustaría quedarme todo el tiempo del mundo y mandarte a grandes aventuras asesinando toda clase de subordinados del gran rey dragon...'");
        rud.nextLine();
        System.out.println("Hada:\n'¡Pero el vago desarrolador se ha quedado sin tiempo!'");
        rud.nextLine();

        boolean op3 = true;
        while (op3) {
            System.out.println("¿Qué querés decir?");
            System.out.println("1) ¿No debería ocultar esa parte?");
            System.out.println("2) ¡Ese desarrollador es un vago sin duda!");
            System.out.println("3) ¿¡Quién diabloes es 'el desarrollador'!?");
            System.out.print("Escribe tu opción: ");
            int op3Num = rud.nextInt();
            rud.nextLine();
            switch (op3Num) {
                case 1 -> {
                    System.out.println("Hada:\n'No creo que importe'");
                    rud.nextLine();
                    op3 = false;
                    break;
                }
                case 2 -> {
                    System.out.println("Hada:\n'Sin duda le falta mucho camino por recorrer'");
                    rud.nextLine();
                    op3 = false;
                    break;
                }
                case 3 -> {
                    System.out.println("Hada:\n'Ahora que le decís... yo tampoco sé quíen es...'");
                    rud.nextLine();
                    op3 = false;
                    break;
                }
                default -> {
                    System.out.println("¡Escoge una decisión válida!");
                }
            }
        }
        System.out.println("Hada:\n'De todos modos... Héroe, debes elegir...'");
        rud.nextLine();
        System.out.println("Hada:\n'¿Salvarás a este reino del malvado rey Dragon?'");
        rud.nextLine();
        System.out.println("Hada:\n'O por el contrario, ¿irás a por el el rey Humano?'");
        rud.nextLine();
        System.out.println("*Parece ser que he llegado al final del camino...");
        rud.nextLine();
        System.out.println("*¿Qué deberías hacer...*");
        rud.nextLine();
        System.out.println("Yo...");
        System.out.println("1) Mataré al Rey Dragón Ostred");
        System.out.println("2) Mataré al Rey Humano");
        System.out.print("Selecciona tu opción: ");
        int desFinal = rud.nextInt();
        rud.nextLine();
        
        if (desFinal == 1) {
            Enemigo ReyDragón = new Enemigo("Rey Dragón", 600, 300, 150, 9999); //Nombre, vida, daño, defensa, EXP
            enemigo.add(ReyDragón); //se añade al ArrayList de "Enemigo" al boss
            System.out.println("Hada:\n'¡Así que salvarás al mundo!'");
            rud.nextLine();
            System.out.println("Hada:\n'El castillo del gran rey Dragón se encuentra adelante, ¡ve a patearle el trasero!'");
            rud.nextLine();
            System.out.println("Has decidido ir al castillo del Rey Dragón");
            rud.nextLine();
            System.out.println("Al entrar al castillo te has encontrado al Rey Dragón");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'Así que sos el gran héroe que ha venido a derrotarme, ¿no es así?'");
            rud.nextLine();
            
            boolean op4 = true;
            while (op4) {
                System.out.println("¿Qué querés decir?");
                System.out.println("1) Así es, ¡He venido a derrotarte!");
                System.out.println("2) No existiría otra razón por la cual yo estaría aquí, ¿no creés?");
                System.out.println("3) No, no he venido a derrotarte.");
                System.out.print("Escribe tu opción: ");
                int op4Num = rud.nextInt();
                rud.nextLine();
                switch (op4Num) {
                    case 1 -> {
                        System.out.println("Rey Dragón:\n'Bien, así se dice.'");
                        rud.nextLine();
                        op4 = false;
                        break;
                    }
                    case 2 -> {
                        System.out.println("Rey Dragón:\n'Cierto... los humanos siempre tendrán que luchar contra las demás razas, ¿no?'");
                        rud.nextLine();
                        op4 = false;
                        break;
                    }
                    case 3 -> {
                        System.out.println("Rey Dragón:\n'¿Hmm? ¿Acaso no venís a derrotarme?'");
                        rud.nextLine();
                        boolean op5 = true;
                        while (op5) {
                            System.out.println("¿Qué querés decir?");
                            System.out.println("1) Oh, lo siento, me equivoqué.");
                            System.out.println("2) He venido para unirme.");
                            System.out.print("Escribe tu opción: ");
                            int op5Num = rud.nextInt();
                            rud.nextLine();
                            switch (op5Num) {
                                case 1 -> {
                                    System.out.println("Rey Dragón:\n'Mmm, está bien, ¿seguimos entonces?'");
                                    rud.nextLine();
                                    op5 = false;
                                    break;
                                }
                                case 2 -> {
                                    System.out.println("Rey Dragón:\n'¿Lo que escucho es real?'");
                                    rud.nextLine();
                                    System.out.println("Rey Dragón:\n'¡Buajajajaja! Estás demente, ¿lo sabías?'");
                                    rud.nextLine();
                                    System.out.println("Rey Dragón:\n'Pero, si has venido a eso... entonces serás más que bienvenido.'");
                                    rud.nextLine();
                                    System.out.println("Me he unido al Rey Dragón...");
                                    rud.nextLine();
                                    finalMalvado(); //llama método que termina el juego
                                    op5 = false;
                                    break;
                                }
                                default -> {
                                    System.out.println("¡Escoge una decisión válida!");
                                }
                            }
                            op5 = false;
                            break;
                        }
                    }
                    default -> {
                        System.out.println("¡Escoge una decisión válida!");
                    }
                }
            }
            
            System.out.println("Rey Dragón:\n'¡Luchemos entonces Héroe que salvará al mundo!'");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'¡Veamos de qué sos capás!'");
            rud.nextLine();
            batalla(Héroe, enemigo.get(0)); // se llama al método de batalla
            
            enemigo.remove(ReyDragón);
            
            System.out.println("Rey Dragón:\n'Así que es mi derrota, ¿eh?'");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'¡Buajajaja! Está bien.'");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'Héroe salvador del mundo... ¿acaso tu papel es sólo salvar a los humanos?'");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'Yo moriré, sin embargo... ¿matarás también a toda mi gente?'");
            rud.nextLine();
            System.out.println("Rey Dragón:\n'¿Eso es lo que hará un 'héroe'?'");
            rud.nextLine();
            
            boolean op6 = true;
            while (op6) {
            System.out.println("Yo...");
            System.out.println("1) Mataré a todos los demonios");
            System.out.println("2) No mataré a todos los demonios");
            int op6Menu = rud.nextInt();
            rud.nextLine();
            switch (op6Menu) {
                case 1 ->{
                    System.out.println("Rey Dragón:\n'Así que sólo serás el héroe de la humanidad... jejeje, parece que no eras el héroe del que tanto había escuchado.'");
                    rud.nextLine();
                    finalDragon1 ();
                    break;
                }
                case 2 ->{
                    System.out.println("Rey Dragón:\n'¡Buajajaja! Así que sos él... el héroe del que había escuchado tanto. Te encargo las cosas entonces... héroe.'");
                    rud.nextLine();
                    finalDragon2 ();
                    break;
                }
                default->{
                    System.out.println("Decisión inválida");
                }
            }    
            }
            
            
        } else if (desFinal == 2) {
            Enemigo ReyHumano = new Enemigo("Rey Humano", 1000, 400, 200, 9999); //Nombre, vida, daño, defensa, EXP
            enemigo.add(ReyHumano);
            System.out.println("Hada:\n'Irás tras el Rey Humano...'");
            rud.nextLine();
            System.out.println("Hada:\n'El castillo del gran Rey Humano se encuentra adelante por allá...'");
            rud.nextLine();
            System.out.println("Hada:\n'Estás cometiendo un grave error haciendo esto héroe...'");
            rud.nextLine();

            enemigo.remove(ReyHumano);
        } else {
            System.out.println("Creo que me iré a mi casa...");
            rud.nextLine();
            System.out.println(héroe.get(0).getNombre() + " ha decido que no vale la pena perder el tiempo en esto y ha retomado su camino a casa");
            rud.nextLine();
            System.out.println("Final: El héroe que se cansó de salvar al mundo");
            rud.nextLine();
            System.exit(0);
        }
    }

    public static void batalla(Hero Héroe, Enemigo enemigo) {
        Random rad = new Random();
        boolean menuBatalla = true;
        int EXPGanada = enemigo.getSoltarEXP();

        while (menuBatalla) {
            System.out.println("");
            System.out.println("***********MENÚ DE BATALLA***********");
            System.out.println("1) Atacar  || 2) Técnicas  || 3) Magias");
            System.out.println("4) Defensa || 5) Huir");
            System.out.print("Elige lo que quieres hacer: ");
            int op = rud.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println(Héroe.getNombre() + " ha atacado a " + enemigo.getNombre());
                    Héroe.atacar(enemigo);
                }
                case 2 -> {
                    if (Héroe.getClase().equals("Mago")) {
                        System.out.println("¡" + Héroe.getNombre() + " ha intentado utilizar una técnica!");
                        System.out.println("Sin embargo, has recordado que eres un mago y no conoces ninguna técnica...");
                    } else {
                        System.out.println("¡Has decidido usar una técnica!");
                        System.out.println("1) Ataque Rápido");
                        System.out.println("2) Ataque cargado");
                        System.out.println("3) Ataque con finta");
                        System.out.print("Selecciona la técnica a usar: ");
                        int técnica = rud.nextInt();
                        Héroe.atacarTécnica(enemigo, técnica);
                    }
                }
                case 3 -> {
                    if (Héroe.getClase().equals("Caballero")) {
                        System.out.println("¡" + Héroe.getNombre() + " ha intentado utilizar una magia!");
                        System.out.println("Sin embargo, has recordado que eres un caballero y no conoces ninguna magia...");
                    } else {
                        System.out.println("¡Has decidido usar una magia!");
                        System.out.println("1) Bola de fuego");
                        System.out.println("2) Bola de agua");
                        System.out.println("3) Bola de rayo");
                        System.out.println("Selecciona la magia a usar: ");
                        int magia = rud.nextInt();
                        Héroe.atacarTécnica(enemigo, magia);
                    }
                }
                case 4 -> {
                    System.out.println(Héroe.getNombre() + " se ha defendido del próximo ataque.");
                    Héroe.bloquearAtaque(enemigo);
                }
                case 5 -> {
                    boolean huir = true;
                    while (huir) {
                        System.out.println("¿De verdad quieres huir? (S/N): ");
                        char decision = rud.next().charAt(0);
                        if (decision == 's' || decision == 'S') {
                            System.out.println("¡Has huido con éxito!");
                            finalMaloHuir();
                            menuBatalla = false;
                            huir = false;
                        } else if (decision == 'n' || decision == 'N') {
                            System.out.println("¡Qué valiente eres!");
                            huir = false;
                        } else {
                            System.out.println("Escoge una respuesta válida.");
                        }
                    }
                }
                default -> {
                    System.out.println("Opción inválida");
                }
            }

            if (enemigo.getVida() <= 0) {
                Héroe.ganarEXP(EXPGanada);
                System.out.println("¡Has derrotado a " + enemigo.getNombre() + "!");
                menuBatalla = false;
                break;
            }

            System.out.println("Turno del Enemigo");
            int turnoEnemy = rad.nextInt(3);
            switch (turnoEnemy) {
                case 0 -> {
                    System.out.println(enemigo.getNombre() + " ha atacado a " + Héroe.getNombre());
                    enemigo.atacar(Héroe);
                }
                case 1 -> {
                    System.out.println(enemigo.getNombre() + " se ha defendido.");
                    enemigo.bloquearAtaque(Héroe);
                }
                case 2 -> {
                    System.out.println(enemigo.getNombre() + " ha decidido usar un ataque especial");
                    int opción = rad.nextInt(3);
                    enemigo.atacarSpecial(Héroe, opción);
                }
            }

            if (Héroe.getVida() <= 0) {
                muerteJugador(Héroe.getNombre(), enemigo.getNombre());
                menuBatalla = false;
            }
        }
    }

    public static void historiaInicial(){
        System.out.println("La tierra de Avidus es una tierra llena de fantasía, donde los seres humanos conviven con hombres bestia, elfos, enanos y muchas otras especies.");
        rud.nextLine();
        System.out.println("Un día sin embargo, un incidente llevó a que el mundo se dividiera, el gran Rey Dragón luchó contra el primer Rey Humano, la destrucción fue tal que dividió al continente de San Avidus en dos partes.");
        rud.nextLine();
        System.out.println("De este modo las especies que una vez convivieron empezaron a odiarse, los humanos y cualquier otra especie.");
        rud.nextLine();
        System.out.println("Por suerte el continente fue dividido por la mitad lo que apagó las ganas de sangre de ambas partes.");
        rud.nextLine();
        System.out.println("Pasaron 500 años desde ese incidente y un día un malvado ser llamado 'Desarrollador' decidió que sería divertido aviviar nuevamente esta antigua disputa.");
        rud.nextLine();
        System.out.println("El continente separado volvió a unirse, y tras esto las disputas entre humanos y todas las demás especies empezaron.");
        rud.nextLine();
        System.out.println("Comenzó la gran guerra entre Humanos y 'demonios', nombre que fue utilizado por los humanos para referirse a todas las especies que no eran humanas.");
        rud.nextLine();
        System.out.println("La guerra fue una de aniquilación donde ambos bandos buscaban el control total del mundo.");
        rud.nextLine();
        System.out.println("El mundo de Avidus necesitaba un milagro, esta tierra que tantos años había experimentado odio necesitaba ser salvada...");
        rud.nextLine();
    }
    
    public static void finalMalo1() {
        System.out.println("Me has decepcionado Héroe... parece que me he equivocado con vos...");
        System.out.println("Debido a la indecisión del Héroe, nunca se envió al salvador del mundo...");
        rud.nextLine();
        System.out.println("El mundo nunca logró ser salvado y todo fue por culpa del Héroe indeciso...");
        rud.nextLine();
        System.out.println("Final Malo: Héroe cobarde");
        rud.nextLine();
    }

    public static void finalMalo2() {
        System.out.println("Debido a la muerte prematura del héroe, el reino cayó en el pánico y los demonios invadieron el reino.");
        rud.nextLine();
        System.out.println("Ahora todos los habitantes del reino viven sus vidas siendo esclavos de los demonios.");
        rud.nextLine();
        System.out.println("Final Malo: Héroe Asesinado");
        rud.nextLine();
    }

    public static void finalMaloHuir() {
        System.out.println("Has huido del enemigo");
        rud.nextLine();
        System.out.println("¡!");
        rud.nextLine();
        System.out.println("Mientras huías te encontraste a un ser abominable.");
        rud.nextLine();
        System.out.println("*Ser Abominable*\n'¡Odio a los patéticos héroes que huyen de sus responsabilidades! ¡No merecen ser héroes!'");
        rud.nextLine();
        System.out.println("Tras soltar tal declaración, el ser abominable te asesina brutalmente");
        rud.nextLine();
        System.out.println("Final Malo: El patético final de un Héroe cobarde");
        rud.nextLine();
        System.exit(0);
    }
    
    public static void finalMalvado(){
        System.out.println("Tras unirse al Rey Dragón");
        rud.nextLine();
        System.out.println("El mundo cayó en contro absoluto del Rey Dragón.");
        rud.nextLine();
        System.out.println("Los humanos fueron relegados a ser esclavos del reino Dragón.");
        rud.nextLine();
        System.out.println("Completaste todo esto junto a Rey Dragón");
        rud.nextLine();
        System.out.println("El hada volvió a verte un día, pero se encontraba moribunda.");
        rud.nextLine();
        System.out.println("Hada:\n'¿Era esto lo que querías? ¿De verdad este era el mundo que deseabas?'");
        rud.nextLine();
        System.out.println("Ignorando al hada la asesinaste y continuaste con tu vida.");
        rud.nextLine();
        System.out.println("Al final de tu vida, mientras estabas en una cama rodeado por muchos monstruos distintos, recordaste con cierta ironía que eras el 'héroe que salvaría al mundo'");
        rud.nextLine();
        System.out.println("Y finalmente moriste.");
        rud.nextLine();
        System.out.println("Final: El Rey Dragón y El Héroe");
        rud.nextLine();
        System.exit(0);
    }
    
    public static void finalDragon1 (){
        System.out.println("Tras derrotar al ínfame Rey Dragón, la humanidad logra ganar rápidamente terreno contra los demonios.");
         rud.nextLine();
         System.out.println("Los demonios, sabiendo que ya no podían ganar esta batalla intentaron rendirse, sin embargo, los humanos impulsados por el gran héroe decidieron erradicar todas las especies que no fueran la humana.");
         rud.nextLine();
         System.out.println("Los demonios no pudieron resistirse y en tan solo 10 años los pocos que quedaron se ocultaron en lugares donde los humanos no pudieran ir.");
         rud.nextLine();
         System.out.println("Los demonios supervivientes juraron vengarse de todos los humanos y destruirlos... y así nacería el preludio al final del mundo, la segunda gran guerra entre humanos y demonios");
         rud.nextLine();
         System.out.println("Sin embargo, esto sucedería mucho después, el héroe fue reconocido por sus logros y con el tiempo se convertiría en el gran Rey Humano");
         rud.nextLine();
         System.out.println("Final: Continúa el ciclo de odio");
         System.exit(0);
    }
    
    
    public static void finalDragon2 (){
        System.out.println("Tras derrotar al ínfame Rey Dragón, la humanidad logra ganar rápidamente terreno contra los demonios.");
         rud.nextLine();
         System.out.println("Los demonios, sabiendo que ya no podían ganar esta batalla intentaron rendirse, y gracias a la insistencia del héroe de perdonarles la vida, los demonios no fueron exterminados.");
         rud.nextLine();
         System.out.println("El héroe impulsó toda clase de reconcilación entre los humanos y todas las demás especies cuyo nombre de 'demonio' fue eliminado para referirse a ellos.");
         rud.nextLine();
         System.out.println("Algunos demonios supervivientes juraron vengarse de todos los humanos y destruirlos, sin embargo eran una minoría y nunca serían tomados muy en serio.");
         rud.nextLine();
         System.out.println("Sin embargo, esto sucedería mucho después, el héroe fue reconocido por sus logros y con el tiempo se convertiría en el gran Rey de Avidus.");
         rud.nextLine();
         System.out.println("Final: Se ha roto el ciclo de odio");
         System.exit(0);    
    }
    
    public static void muerteJugador(String nombreJugador, String nombreEnemigo) {
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

    public static void finJuego() {
        System.out.println("¡Has completado el juego!");
        rud.nextLine();
        System.exit(0);
    }
}
