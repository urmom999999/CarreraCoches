//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
    final int distancia=0;
        Coche c1 = new Coche("Porche 959",317,distancia);
        Coche c2 = new Coche("Ferrari F40",324,distancia);
        Coche c3 = new Coche("RUF CTR Yellowbird",340,distancia);
        Coche c4 = new Coche("Ford RS200",228,distancia);

        System.out.println("Ha empezado la carrera!");

            c1.start();
            c2.start();
            c3.start();
            c4.start();

    //Mientras que los 4 coches no terminaron

    }};

//Calcular quien es el que va primero
/*            for(int i=0;i<20;i++){
int maximaTramo = 0;
                if(velocidadMedia[i] > maximaTramo){
maximaTramo = velocidadMedia[i];
        }

Carrera de coches
4 coches
nombre
distancia Recorrida
velocidad maxima

Cuando llegue a la meta x llega primero, x segundo
esperar con threat.sleep
velocidad aleatoria?

distanciarecorrida = circuito gana?
*/