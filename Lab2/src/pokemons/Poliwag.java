package pokemons;
import moves.physical.Facade;
import moves.physical.Waterfall;
import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name,level);
        setType(Type.WATER);
        setStats(40,50,40,40,40,90);
        setMove(new Waterfall(),new Facade());
    }
}
