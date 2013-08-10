package tallerFigura;

import org.junit.Test;

/**
 * Test metodos
 *
 */


public class FiguraTest {

    public void testGetArea() throws Exception {

    }

    public void testSetArea() throws Exception {

    }

    public void testGetPerimetro() throws Exception {

    }

    public void testSetPerimetro() throws Exception {

    }

    @Test
    public void testCalcularArea() throws Exception {

        cuadrado cuadradito= new cuadrado(5.0);
        cuadradito.areaCuadrado();
        System.out.println("el area del cuadrado es " + cuadradito.calcularArea());

        triangulo t= new triangulo(3.0,2.0 ,4.5,6.7,7.8);
        t.areaTriangulo();
        double variable=t.calcularArea();
        System.out.println("El area del triangulo es " + variable);

    }

    @Test
    public void testCalcularPerimetro() throws Exception {

        cuadrado cuadradito1= new cuadrado(5.0);
        cuadradito1.perimetroCuadrado();
        System.out.println("el perimetro del cuadrado es " + cuadradito1.calcularPerimetro() );
    }
}
