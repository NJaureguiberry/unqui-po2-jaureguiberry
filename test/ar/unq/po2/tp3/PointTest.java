package ar.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void createPoint() {
        Point punto = new Point(2,3);
        assertEquals(2, punto.getX(), 0); 
        assertEquals(3, punto.getY(), 0);      
    }

    
    @Test
    public void createPointZero() {
    	Point punto = new Point();
        assertEquals(0, punto.getX(), 0); 
        assertEquals(0, punto.getY(), 0); 
    }
    
    
    @Test
    public void MovePoint() {
        Point punto = new Point();
        punto.setXY(3, 2);
        assertEquals(3, punto.getX(), 0); 
        assertEquals(2, punto.getY(), 0); 
        }
    
    
    @Test
    public void SumarPoints() {
        Point punto1 = new Point(1,5);
        Point punto2 = new Point(3,4);
        Point puntoSumado = punto1.sumar(punto2);
        
        assertEquals(4, puntoSumado.getX(), 0); 
        assertEquals(9, puntoSumado.getY(), 0); 
        }
    
    
    
    }


    
