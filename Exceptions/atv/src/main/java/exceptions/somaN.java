package exceptions;

import java.util.Scanner;

public class somaN {
    public static Boolean underHundred(int x){
        if(x<100){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws AcimaDeCemException {
        
        Scanner s = new Scanner(System.in);
        int sum = 0,  i = 0, aux = 0;
            
                while(underHundred(sum)){
                    System.out.println("informe um número para ser somado");
                    aux = s.nextInt();
                    sum += aux;
                    i++;
                    System.out.println("O valor somado foi de: "+ aux);
                    System.out.println("A quantidade de números alocada foi de: " + i);
                    System.out.println("A média dos números é de: "+ (sum/i));
                    if(!underHundred(sum)){
                        throw new AcimaDeCemException(sum);
                    };
                
                }
            
        
        

    }
}
