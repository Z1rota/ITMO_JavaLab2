import pokemons.*;
import ru.ifmo.se.pokemon.*;



public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon fp1 = new Cosmog("Папич",10);
        Pokemon fp2 = new Aipom("Рофланыч",9);
        Pokemon fp3 = new Ambipom("Татарин",27);
        b.addAlly(fp1);
        b.addAlly(fp2);
        b.addAlly(fp3);
        Pokemon sp1 = new Poliwag("Шахидыч",10);
        Pokemon sp2= new Poliwhirl("Амогус",9);
        Pokemon sp3 = new Poliwrath("Сугома",27);
        b.addFoe(sp1);
        b.addFoe(sp2);
        b.addFoe(sp3);
        b.go();

    }
}