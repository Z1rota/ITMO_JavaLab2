package pokemons;

import moves.physical.Pound;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String name, int level) {
        super(name, level);
        setType(Type.WATER,Type.FIGHTING);
        setStats(90,95,95,70,90,70);
        setMove(new Pound());
    }
}
