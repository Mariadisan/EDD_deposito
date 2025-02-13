package cuenta;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

/**
 * Atributos privados de la clase.
 */
    private String nombre;
    /** 
     * Nombre del titular de la cuenta.
     */
    private String cuenta;
    /**
     * Número de la cuenta.
     */
    private double saldo;
    /**
     * Saldo disponible en la cuenta.
     */
    private double tipoInterés;
    /**
     * Tipos de interés asociados a la cuenta. 
     */
    
    
    public CCuenta()
    {
    }
    
    /**
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo disponible en la cuenta.
     * @param tipo Tipo de interés asociado a la cuenta.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom); 
        /**
         * Asigna el nombre del titular.
         */
        setCuenta(cue);
        /**
         * Asigna el número de cuenta.
         */
        setSaldo(sal);
        /**
         * Asigna el saldo disponible.
         */
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return saldo actual.
     */

    public double estado()
    {
        return getSaldo();
        /**
         * Devuelve el saldo actual de la cuenta.
         */
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad Dinero a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa, lanza una excepción.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
        	/**
        	 * Si la cantidad es negativa o cero.
        	 */
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
            /**
             * Aumenta el saldo de la cuenta.
             */
        
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad Dinero a retirar de la cuenta.
     * @throws Exception si la cantidad es negativa o si es insuficiente saldo, lanza una excepción.
     */
        
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
        	/**
        	 * Si la cantidad es negativa o cero.
        	 */
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
        	/**
        	 * Si el saldo es insuficiente.
        	 */
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
        /**
         * Reduce el saldo de la cuenta.
         */
    }
    
    /**
     * Devuelve el tipo de interés de la cuenta.
     */

	/**
	 * @return the tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Establece el tipo de interés de la cuenta.
	 */

	/**
	 * @param tipoInterés the tipoInterés to set
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Devuelve el saldo actual de la cuenta.
	 */

	/**
	 * @return the saldo.
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Establece el saldo de la cuenta.
	 */

	/**
	 * @param saldo the saldo to set.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Devuelve el número de la cuenta.
	 */

	/**
	 * @return the cuenta.
	 */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Establece el número de cuenta.
	 */

	/**
	 * @param cuenta the cuenta to set.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Devuelve el nombre del titular de la cuenta.
	 */

	/**
	 * @return the nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Establece el nombre del titular de la cuenta.
	 */

	/**
	 * @param nombre the nombre to set.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
