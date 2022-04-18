package ar.unq.po2.tp3;

public class Multiplos {
    public int valorMasAltoMultiplo(int x, int y) {
        int multiploMax = -1;
        for (int i = 1; i <= 1000; i++) {
            if (esMultiplo(i,x,y)) {
                multiploMax = i;
            }
        }
        
        return multiploMax;

    }

    private boolean esMultiplo(int i, int x, int y) {
        
        return i % x == 0 && i % y == 0;
    }
} 