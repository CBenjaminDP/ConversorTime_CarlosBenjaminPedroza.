import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Desarrolla un programa que realice conversiones de tiempo:
        //✓ Horas a minutos
        //✓ Minutos a segundos
        //✓ Días a horas
        //✓ Semanas a días

        int opcion = 0;

        //Menu
        do{
            try {
                System.out.println("Ingrese un numero con la opcion de desea hacer");
                System.out.println("1.- Horas a minutos");
                System.out.println("2.- Minutos a segundos");
                System.out.println("3.- Dias a horas");
                System.out.println("4.-  Semanas a Dias");
                System.out.println("0.- Salir");
                opcion = input.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Ingrese las horas a calcular a minutos");
                        int horas = input.nextInt();
                        //transformar horas a minutos lo cual es
                        // 5 serian de 60 minutos = 300 minutos
                        int minutosCalculados = horas * 60;
                        System.out.println("El resultado es: " + minutosCalculados);
                        break;
                    case 2:
                        System.out.println("Ingrese los minutos a convertire a segundos");
                        int segundosCalcualdos = input.nextInt();
                        int segundosConvertidos = segundosCalcualdos * 60;
                        System.out.println("El resultado es: " + segundosConvertidos);
                        break;
                    case 3:
                        System.out.println("Ingrese los dias a calcular a horas");
                        int dias = input.nextInt();
                        int diasConvertidosHoras = dias * 24;
                        System.out.println("El resultado es: " + diasConvertidosHoras);
                        break;
                    case 4:
                        System.out.println("Ingrese las semanas para calcular a dias");
                        int semanas = input.nextInt();
                        int diasSemana = semanas * 7;
                        System.out.println("El resultado es: " + diasSemana);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Opcion no valida");
            }
        }while(opcion != 0);
    }
}