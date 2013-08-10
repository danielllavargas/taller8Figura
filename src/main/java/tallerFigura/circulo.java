package tallerFigura;

/**
 *
 */

public class circulo extends Figura {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    public void areaCirculo()
    {
        double areaCi=radio*radio* Math.PI;
        setArea(areaCi);
    }

    public void perimetroCirculo()
    {
        double perimetroCi=2* Math.PI*radio;
        setPerimetro(perimetroCi);
    }
}
