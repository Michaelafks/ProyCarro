package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.potencia = 2;
        c1.velocidad = 60;

        c2.potencia = 5;
        c2.velocidad = 50;

        c3.potencia = 3;
        c3.velocidad = 99;

        System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);


        c3.acelerar();
        c3.acelerar();
        c3.frenar();

        System.out.println("La potencia del carro 1 es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        System.out.println("La potencia del carro 2 es "+c2.potencia+" y la velocidad es "+c2.velocidad);
        System.out.println("La potencia del carro 3 es "+c3.potencia+" y la velocidad es "+c3.velocidad);
    }
}
