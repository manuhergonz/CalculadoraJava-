import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola  Bienvenido, ¿Me ingresas tu nombre? ");
        String  nombre = entrada.nextLine();

        System.out.println("Hola👋🏽 " + nombre + " Bienvenid@ a la Calculadora 📱");

        System.out.println("Ahora me puedes ingresar tu edad? ");
        int edad = entrada.nextInt();

        if (edad <= 18 ){
            System.out.println(nombre + " 👦🏽Eres Menor de edad, igual Bienvenido!");
        }else {
            System.out.println(" Bienvenido Eres Mayor de Edad");
        }

        System.out.println("Ahora me Podras decir tu Genero? si eres Mujer presiona 'F' O Masculino  'M' ?");
        char sexo = entrada.next().charAt(0);

        if ( sexo == 'm'){
            System.out.println("Buenas Señor " + nombre + "🧔🏽‍♂️");
        }else {
            System.out.println("Buenas Señora " + nombre + "👱🏽‍♀️");
        }

        System.out.println(" ¿➕, ➖, ➗ , ✖️? = Marca el Signo ");
        char operador = entrada.next().charAt(0);

        if (operador == '+'){
            System.out.println("Genial, Vamos a Sumar ➕ ");
        } else if (operador == '-') {
            System.out.println("Genial, Vamos a Restar  ➖️");
        } else if (operador == '/') {
            System.out.println("Gernial, Vamos A Dividir ➗");
        }else if ( operador == '*'){
            System.out.println("Genial, Vamos a Multiplicar ✖️");
        }else {
            System.out.println(" ❌Operador Incorrecto❌");
            return;
        }

        System.out.println("Ingresa Primer Numero :");
        int numero1 = entrada.nextInt();

        System.out.println("Ingresa Segundo Numero :");
        int numero2 = entrada.nextInt();
        int resultado = 0;


        switch (operador ){
            case '+' :
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;

        }

        System.out.println("El Resultado es  🟰 " + resultado + "✅") ;















    }
}
