package p0nki.javashit.object;

public class JSBoolean extends JSObject {

    private final boolean value;

    public JSBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String stringify() {
        return "" + value;
    }

    @Override
    public JSObjectType type() {
        return JSObjectType.BOOLEAN;
    }

    @Override
    public String castToString() {
        return stringify();
    }
}
