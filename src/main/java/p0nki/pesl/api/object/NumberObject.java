package p0nki.pesl.api.object;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;

public class NumberObject extends PESLObject {

    private final double value;

    public NumberObject(double value) {
        super("number");
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @CheckReturnValue
    @Nonnull
    @Override
    public String stringify() {
        return value + "";
    }

    @CheckReturnValue
    @Nonnull
    @Override
    public String castToString() {
        return value + "";
    }

}
