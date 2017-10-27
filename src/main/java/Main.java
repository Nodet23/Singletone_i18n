import java.util.Scanner;

/**
 * Created by nodet on 27/10/17.
 */

public class Main
{
    public static void main( String[] args )
    {
        boolean flag = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your languaje preferences: en/es/al");
            String lng = scanner.nextLine();

            if (SingletonI18n.getInstance().getData("one", lng)!=null){
                System.out.println(SingletonI18n.getInstance().getData("one", lng));
                flag=true;
            }else{
                System.out.println("Introduzca un lenguaje valido de las opciones");
            }


        }while(flag == false);

    }
}