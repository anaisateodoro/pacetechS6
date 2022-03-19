package projetoSemanaSeis;
import java.util.Scanner;
/**
 *
 * @author Anaísa
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
      int menu = 1;
      int temperatura;
      //celsius
     float celsius;
     float celsiusConvertido; 
   //fahrenheit
     float fahrenheit;
     float fahrenheitConvertido;
     
      //conversão de moeda
      int moeda;
      float cotacaoDolar;
      //real
      float real;
      float realConvertido;
      //dólar
      float dolar;
      float dolarConvertido;
      
      while(menu == 1 || menu == 2){
        
        System.out.println("(1) - Desejas converter a temperatura?");
        System.out.println("(2) - Desejas converter moedas?");
        System.out.println("(3) - Sair!");
        menu = ler.nextInt();
        
        if(menu == 1) {
            System.out.println("Voce deseja converter (1)Celsius" + " ou (2)Fahrenheit?");
            temperatura = ler.nextInt();
                if(temperatura == 1) {
                   System.out.println("Digite a temperatura");
                    celsius = ler.nextFloat();
                    celsiusConvertido = (float) ((celsius * 1.8)+32) ;
                    System.out.println("A temperatura em fahrenheit é: "
                            + celsiusConvertido);
                } else {
                    System.out.println("Qual a temperatura" + "em fahrenheit?");
                    fahrenheit = ler.nextFloat();
                    fahrenheitConvertido = (float) ((fahrenheit - 32)* 0.555555);
                    System.out.println("A temperatura em celsius e: "
                            + fahrenheitConvertido);                   
                    
                }                 
        }else{
            if(menu == 2){
                System.out.println("Informe a cotacao do Dólar:");
                cotacaoDolar = ler.nextFloat();
                System.out.println("Desejas converter: (1)real ou (2)dolar?");
                moeda = ler.nextInt();
                    if (moeda == 1) {
                        System.out.println("Informe o valor total em real:");
                        real = ler.nextFloat();
                        realConvertido = (float) (real / cotacaoDolar);
                        System.out.println("Voce transformou " + real + " em " 
                                + realConvertido);
                } else {
                        System.out.println("Informe o valor total em dolar:");
                        dolar = ler.nextFloat();
                        dolarConvertido = (float) (dolar / cotacaoDolar);
                        System.out.println("Você convertou " + dolar + " em " + dolarConvertido);
                    }
            } else {
               System.out.println("Obrigado pela preferência em nosso conversor de algoritmo");
    }
        }
      }
    }
}
