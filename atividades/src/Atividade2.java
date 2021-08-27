public class Atividade2 { 
   
    public static void main(String[] args){
         
            int num, aux, cont=0;
        
            System.out.println("numeros divididos por 11 com o resto 5:");
        
            for(num = 1; num <= 2500; num ++){
        
                if(num % 11 == 5){
                    System.out.print(num + " ");
                }
            }
            System.out.println("\n numeros pares:");
            for (num = 1; num <= 2500; num ++){
        
                if (num % 2 == 0){
                    System.out.print(num + " ");
                }
            }
            System.out.println("\n numeros impares:");
            for(num = 1; num <=2500; num ++){
        
                if(num % 2 != 0){
                    System.out.print(num + " ");
                }
            }
            System.out.println("\n numeros primos:");
            for(num = 1; num <= 2500; num++);
                cont = 0;
        
                for(aux = 1; aux <= num; aux++){
        
                    if(num % aux == 0){
                        cont++;
                    }
                }
                if(cont == 2){
                    System.out.print(num+" ");
                }
        
            
            }
        
    }

