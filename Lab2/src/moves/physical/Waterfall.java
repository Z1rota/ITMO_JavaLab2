package moves.physical;
import java.util.Random;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.flinch;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER,80,100);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        Random e = new Random();
        boolean b = 0.2d > e.nextDouble();
        if (b) {
            flinch(p);
        }

    }

    @Override
    public String describe() {
        return "использует WaterFall";
    }
}
