public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Juanito Peréz";
        String tipoDeCuenta = "Cuenta corriente";
        int saldoDisponilbe = 0;
        int montoRetiro = 0;
        int montoDeposito = 0;
        boolean salir = false;

        System.out.println("\nBienvenido a su cuenta Sr(a) " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldoDisponilbe);

        while(!salir){
            System.out.println("\nDigite el numero de la operación a realizar:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            int opcionUsuario = teclado.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("Saldo disponible en cuenta: $" + saldoDisponilbe);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a depositar:");
                    montoDeposito = teclado.nextInt();
                    saldoDisponilbe += montoDeposito;
                    System.out.println("Operación realizada con exito !!");
                    System.out.println("Saldo actualizado luego del deposito: $" + saldoDisponilbe);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero a retirar:");
                    montoRetiro = teclado.nextInt();
                    if (montoRetiro > saldoDisponilbe){
                        System.out.println("Operación invalida, su saldo es insuficiente.");
                    }else {
                        saldoDisponilbe -= montoRetiro;
                        System.out.println("Operación realizada con exito !!");
                        System.out.println("Saldo actualizado luego del retiro: $" + saldoDisponilbe);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;
                default:
                    System.out.println("Operación no disponible, porfavor intente nuevamente");
            }

        }

    }

}