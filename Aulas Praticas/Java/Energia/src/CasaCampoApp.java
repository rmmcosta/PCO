import java.util.Random;

public class CasaCampoApp {
    public static void main(String[] args){
        Cao piloto = new Cao("Piloto");
        Cao atila = new Cao("Átila");

        Gato tareco = new Gato("Tareco");
        Gato pantufa = new Gato("Pantufa");
        Gato kitty = new Gato("Kitty");

        Passaro[] passaros = new Passaro[20];

        for(int i=0;i<passaros.length;i++){
            passaros[i] = new Passaro();
        }

        Rato[] ratos = new Rato[50];

        for (int i=0;i<ratos.length;i++){
            ratos[i] = new Rato();
        }

        System.out.println(piloto);
        System.out.println(atila);
        System.out.println(tareco);
        System.out.println(pantufa);
        System.out.println(kitty);

        printRatosMortos(ratos);
        printPassarosMortos(passaros);

        piloto.ataca(tareco);
        piloto.ataca(tareco);
        piloto.ataca(tareco);
        piloto.ataca(tareco);

        Random rndPassaros = new Random();
        Random rndRatos = new Random();

        pantufa.captura(ratos[rndRatos.nextInt(50)]);
        pantufa.captura(ratos[rndRatos.nextInt(50)]);
        pantufa.captura(ratos[rndRatos.nextInt(50)]);
        pantufa.captura(ratos[rndRatos.nextInt(50)]);
        pantufa.captura(ratos[rndRatos.nextInt(50)]);

        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);

        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);
        kitty.captura(ratos[rndRatos.nextInt(50)]);

        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);
        pantufa.captura(passaros[rndPassaros.nextInt(20)]);

        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);
        atila.corre(atila.ENERGIA_CORRER);

        System.out.println(piloto);
        System.out.println(atila);
        System.out.println(tareco);
        System.out.println(pantufa);
        System.out.println(kitty);

        printRatosMortos(ratos);
        printPassarosMortos(passaros);
    }

    private static void printRatosMortos(Rato[] ratos){
        int count=0;
        for(int i=0;i<ratos.length;i++){
            if(ratos[i].energia==0)
                count++;
        }

        System.out.println(count + " ratos já morreram");
    }

    private static void printPassarosMortos(Passaro[] passaros){
        int count=0;
        for(int i=0;i<passaros.length;i++){
            if(passaros[i].energia==0)
                count++;
        }

        System.out.println(count + " pássaros já morreram");
    }
}
