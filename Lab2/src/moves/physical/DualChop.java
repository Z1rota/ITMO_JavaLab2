package moves.physical;

import ru.ifmo.se.pokemon.*;

public class DualChop extends PhysicalMove {
    public DualChop() {
            super(Type.DRAGON,40,90,0,2);
    }

    @Override
    public String describe() {
        return "использует DualChop";
    }

}
