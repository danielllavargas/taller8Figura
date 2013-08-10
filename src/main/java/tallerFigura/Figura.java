package tallerFigura;
/**
 *      /**
 * Clase Figura
 *
 */


public class Figura {

    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double calcularArea()
    {
        return getArea();

    }

    public double calcularPerimetro()
    {
        return getPerimetro();
    }

}
