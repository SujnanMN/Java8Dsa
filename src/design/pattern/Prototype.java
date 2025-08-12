package design.pattern;

public interface Prototype extends Cloneable{
    Docs clone();
}

class Docs implements Prototype {

    private String value;

    public Docs(String value) {
        this.value = value;
    }

    @Override
    public Docs clone() {
        return new Docs(this.value);
    }
}
