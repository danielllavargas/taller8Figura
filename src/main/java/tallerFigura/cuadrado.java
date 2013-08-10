package tallerFigura;

/**
 * Calculo datos cuadrado
 *
 */
public class cuadrado extends Figura{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public void areaCuadrado()
    {
        double areaCuadrado=lado*lado;
        setArea(areaCuadrado);
    }

    public void perimetroCuadrado()
    {
        double perimetroCuadrado= lado*4;
        setPerimetro(perimetroCuadrado);
    }
}
