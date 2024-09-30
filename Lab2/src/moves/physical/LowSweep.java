package moves.physical;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING,65,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED,-1);
    }

    @Override
    public String describe() {
        return "использует LowSweep";
    }
}
