package moves.special;
import java.util.Random;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST,80,100 );
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Random e = new Random();
        boolean b = 0.2d > e.nextDouble();
        if (b) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }

    @Override
    protected String describe() {
        return "использует ShadowBall";
    }
}
