public class MAN extends Mashiny{

    private String color;

    public MAN(boolean drumoractivator, String automatic, int semiautomatic, int frontal, int vertical, String separately , boolean embeddable) {
            super(drumoractivator, automatic, semiautomatic,frontal, vertical, separately , embeddable);
        this.color="White-and-black";
    }

    public MAN (boolean drumoractivator, String automatic, int semiautomatic, int frontal, int vertical, String separately , boolean embeddable) {
        super(drumoractivator, automatic, semiautomatic,frontal, vertical, separately , embeddable);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}