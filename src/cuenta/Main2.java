package cuenta;
public class Main2 {

    private static CCuenta cuenta1;

	public static void main(String[] args) {
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        

        operativa_cuenta(-2300);
    }
	private static void operativa_cuenta(float cantidad) {
		try {
			if (cantidad > 0) {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(cantidad);
			} else {
				System.out.println("Retirar de cuenta");
				cuenta1.retirar(-cantidad);
			} 
        } catch (Exception e) {
            System.out.print("Fallo al retirar o ingresar");
        }
	}
}
