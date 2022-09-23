package exceptions;

public class AcimaDeCemException extends Exception {
    private int soma;

    public AcimaDeCemException( int soma) {
        super("Sua soma passou de 100: " +  soma);
        this.soma = soma;
    }
    
}
