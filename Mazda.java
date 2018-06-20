public class Mazda extends Mashiny{

    private String color;

    public Mazda(boolean legkovayaorgruzovaya, String benzinovij, int LoshadSil, int RazgonyaetsyaDoSta, int Tormozit, String bystroilimedlenno, boolean legkoilitrudno) {
        super(legkovayaorgruzovaya, benzinovij, LoshadSil, RazgonyaetsyaDoSta, Tormozit, bystroilimedlenno, legkoilitrudno);
        this.color="Red";
    }

    public Mazda(boolean legkovayaorgruzovaya, String benzinovij, int LoshadSil, int RazgonyaetsyaDoSta, int Tormozit, String bystroilimedlenno, boolean legkoilitrudno, String color){
        super(legkovayaorgruzovaya, benzinovij, LoshadSil, RazgonyaetsyaDoSta, Tormozit, bystroilimedlenno, legkoilitrudno);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}