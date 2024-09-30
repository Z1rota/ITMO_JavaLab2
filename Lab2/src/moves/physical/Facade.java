package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL,70,100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if ( (p.getCondition() == Status.POISON) || (p.getCondition() == Status.PARALYZE) || (p.getCondition() == Status.BURN)) {
            Effect e = new Effect().turns(1).stat(Stat.ATTACK,2);
        }
    }


    @Override
    public String describe() {
        return "использует Facade";
    }
}
