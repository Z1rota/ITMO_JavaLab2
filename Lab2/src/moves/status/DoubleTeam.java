package moves.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam() {
        super(Type.NORMAL,0,0);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION,+1);

    }

    @Override
    public String describe() {
        return "использует Double Team";
    }


}
