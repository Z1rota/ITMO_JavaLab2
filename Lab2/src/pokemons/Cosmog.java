package pokemons;

import moves.special.*;
import moves.status.*;
import ru.ifmo.se.pokemon.*;

public class Cosmog extends Pokemon {
    public Cosmog(String name, int level) {
        super(name,level);
        setType(Type.PSYCHIC);
        setStats(43,29,31,29,31,37);
        setMove(new ShadowBall(),new HydroPump(), new Confide(),new DoubleTeam());
    }
}
