public class Operadores {

    public static void main(String[] args) {
       int a, b;

       a = 56;
       b = 6;
       String resultado = "";
       if(a==b)
            resultado = "verdadeiro";
       else
       resultado = "falso";
       
       System.out.println(resultado);

       //outra maneira, mais abreviada:

       String resultado2 = a==b?"verdadeiro" : "falso";

       boolean simNao = a == b; 

       System.out.println("a é igual b?" + simNao);
        
       String resultado3 = a > b?"Verdadeiro" : "falso";
       System.out.print(resultado3);

       if(a > b && 57 < 103){
        System.out.println("As duas condicoes sao verdadeiras");
       }
    }
    
}
