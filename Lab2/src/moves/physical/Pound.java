package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    public Pound() {
        super(Type.NORMAL,40,100);
    }


    @Override
    public String describe() {
        return "использует Pound";
    }
}
