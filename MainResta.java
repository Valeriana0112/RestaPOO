import java.util.Scanner;
public class MainResta { 
    public static void main(String[]args) {
       
        Scanner reader = new Scanner(System.in);
        
        System.out.println("introduzca primer valor");
        int a = reader .nextInt();
        System.out.println("introduzca segundo valor");
        int b = reader .nextInt();
        int r = a- b;
        System.out.println("El resultado de la resta es"+ r);
    }
}