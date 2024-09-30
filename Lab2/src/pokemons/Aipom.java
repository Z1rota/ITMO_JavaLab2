package pokemons;
import moves.physical.LowSweep;
import moves.special.Thunderbolt;
import moves.status.NastyPlot;
import ru.ifmo.se.pokemon.*;



public class Aipom extends Pokemon {
    public Aipom(String name, int level) {
        super(name,level);
        setType(Type.NORMAL);
        setStats(55,70,55,40,55,85);
        setMove(new Thunderbolt(), new LowSweep(), new NastyPlot());
    }
}
