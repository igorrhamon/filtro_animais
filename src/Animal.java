
public class Animal  {
    private boolean isVoador;

    

    public void setVoador(boolean isVoador) {
        this.isVoador = isVoador;
    }

    public boolean isVoador() {
        return isVoador;
    }

    @Override
    public String toString() {
        return "Animal [isVoador=" + isVoador + "]";
    }

    

}
