



/**
 * Este es la clase coche
 * @author ik012982i9
 *
 */
public class Coche {
	final double precioGasoil=1.12;
	final double precioGasolina=1.39;
	//atributos
	private String conductor;
	private String color;
	private String matricula;
	private int anioMatriculacion;
	private String marca;
	private String modelo;
	private int num_puertas;
	private int num_plazas;
	private String tamaino_maletero;
	private int caballos;
	private String tipo_combustible="gasoil";
	private double litros_combustible;
	private double capacidad_combustible;
	private int marcha;
	private int marchaMax=5;
	private double velocidad;
	private double kilometraje;
	private double consumo_medio;//por cien kilometros
	private double precio_compra;
	private String[] estado_de_puertas;
	
	
	public String[] getEstado_de_puertas() {
		return estado_de_puertas;
	}

	public void setEstado_de_puertas(String[] estado_de_puertas) {
		this.estado_de_puertas = estado_de_puertas;
	}

	public void cerrarCoche(){
		for (int i = 0; i < num_puertas ; i++) {
			this.estado_de_puertas[i]="Cerrado";
		}
	}
	
	public boolean estaEnMarcha(){
		if (this.getVelocidad()==0){
			return false;
		}else{
			return true;
		}
		
	}
	
	public void pintar(String color){
		this.color=color;
	}
	
	public void aparcar(){
		this.velocidad=0;
		this.conductor=null;
	}

	
	
	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	//fuciones
	/**
	 * Crear un objeto de la clase coche
	 * @param matricula	la matricula delmç coche
	 * @param marca		la marca del coche
	 * @param modelo	el modelo de coche
	 */
	
	public Coche(String matricula, String marca, String modelo){
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
	/**
	 * crear objeto coche 
	 */
	public Coche(){
		
	}
	/**
	 * Este proceso sirve para repostar el combustible del coche
	 * @param euros <ul>
	 * 	<li>1 litro de gasoil = 1.12</li>
	 * 	<li>1 litro de gasolina = 1.39</li>
	 * </ul>
	 */
	public  void repostar(int euros){
		double litros_nuevos;
		if (tipo_combustible.toLowerCase().equals("gasoil")){
			litros_nuevos=euros/precioGasoil;
		}else{
			litros_nuevos=euros/precioGasolina;
		}
		System.out.println("Se añadiran "+litros_nuevos+" de combustible");
		if ((litros_nuevos+litros_combustible)>capacidad_combustible){
			System.out.println("Has añadido demasiado combustible.");
			double litros_restantes=(litros_nuevos+litros_combustible)-capacidad_combustible;
			double vuelta;
			if (tipo_combustible.toLowerCase().equals("gasoil")){
				vuelta=litros_restantes*precioGasoil;
			}else{
				vuelta=litros_restantes*precioGasolina;
			}
			System.out.println("Se te devolveran "+vuelta+" euros");
			setLitros_combustible(getCapacidad_combustible());
			
		}else{
			setLitros_combustible(litros_nuevos+litros_combustible);
		}
		System.out.println("Actualmente tienes: "+getLitros_combustible()+" litros");
			
	}
	/**
	 * Este proceso sirve para poder subir la velocidad del coche
	 * @param kmHora	cuanta velocidad le quieres añadir
	 */
	public void acelerar(int kmHora){
		setVelocidad(this.velocidad+kmHora);
	}
	/**
	 * Este proceso sirve para cambiar la marcha del coche
	 * @param mas	<ul>
	 * 	<li>true = subir marcha</li>
	 * <li>false = bajar marcha</li>
	 * </ul>
	 */
	public void cambiarMarcha(boolean mas){
		if (mas==true&&marcha<marchaMax) {
			marcha++;
		}else if(mas==false&&marcha>1) {
			marcha--;
		}else{
			System.out.println("Has alcanzado el limite");
			
		}
	}
	
	/**
	 * Proceso para añadir los nuevos km circulados al contador de kilometros
	 * @param kms	kilometros circulados
	 */
	public void circular(int kms){
		setKilometraje(kilometraje+kms);
	}
	/**
	 * Funcion para conseguir el precio actual del coche,
	 * que depende del fecha de matriculacion y kilometraje
	 * 
	 * @return double - devuelve el precio 
	 */
	public double valorar(){
		return ((kilometraje*200)+(anioMatriculacion*500));
	}
	
	//getters setters

	/**
	 * obtener el color del coche
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * obtener el año de matriculacion
	 * @return the anioMatriculacion
	 */
	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}
	/**
	 * establecer el año de matriculacion
	 * @param anioMatriculacion 
	 */
	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}
	/**
	 * obtener la marcha maxima
	 * @return the marchaMax
	 */
	public int getMarchaMax() {
		return marchaMax;
	}
	/**
	 * establecer la marcha maxima
	 * @param marchaMax
	 */
	public void setMarchaMax(int marchaMax) {
		this.marchaMax = marchaMax;
	}
	/**
	 * establecer conductor
	 * @param conductor the conductor to set
	 */

	/**
	 * establece el color de coche
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * obtener numero de matricula
	 * @return
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * establece la matricula del coche
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * obtener la marca del coche 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * establece la marca de coche
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * obtener modelo de coche
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * establece el modelo del coche
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * obtener el numero de puertas
	 * @return
	 */
	public int getNum_puertas() {
		return num_puertas;
	}
	/**
	 * establece el numero de puertas del coche
	 * @param num_puertas
	 */
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
		this.setEstado_de_puertas(new String[num_puertas]);
	}
	/**
	 * obtener el numero de plazas
	 * @return
	 */
	public int getNum_plazas() {
		return num_plazas;
	}
	/**
	 * establece el numero de plazas del coche
	 * @param num_plazas
	 */
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	/**
	 * obtener el espacio del maletero
	 * @return
	 */
	public String getTamaino_maletero() {
		return tamaino_maletero;
	}
	/**
	 * establece el tamaiño del maletero
	 * @param tamaino_maletero
	 */
	public void setTamaino_maletero(String tamaino_maletero) {
		this.tamaino_maletero = tamaino_maletero;
	}
	/**
	 * obtener el numero de caballos
	 * @return
	 */
	public int getCaballos() {
		return caballos;
	}
	/**
	 * establece numero de caballos
	 * @param caballos
	 */
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	/**
	 * obtener el tipo de combustible
	 * @return
	 */
	public String getTipo_combustible() {
		return tipo_combustible;
	}
	/**
	 * establece el tipo de combustible del coche
	 * @param tipo_combustible
	 */
	public void setTipo_combustible(String tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
	/**
	 * obtener los litros actuales que tiene
	 * @return
	 */
	public double getLitros_combustible() {
		return litros_combustible;
	}
	/**
	 * establece los litros actuales de combustible
	 * @param litros_combustible
	 */
	public void setLitros_combustible(double litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	/**
	 * obtener la capacidad maxima
	 * @return
	 */
	public double getCapacidad_combustible() {
		return capacidad_combustible;
	}
	/**
	 * establece cuanto combustible cabe
	 * @param capacidad_combustible
	 */
	public void setCapacidad_combustible(double capacidad_combustible) {
		this.capacidad_combustible = capacidad_combustible;
	}
	/**
	 * obtener en que marcha va
	 * @return
	 */
	public int getMarcha() {
		return marcha;
	}
	/**
	 * establece la marcha del coche
	 * @param marcha
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	/**
	 * obtener la velocidad actual del coche
	 * @return
	 */
	public double getVelocidad() {
		return velocidad;
	}
	/**
	 * establece la velocidad del coche
	 * @param velocidad
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	/**
	 * obtener el kilometraje actual
	 * @return
	 */
	public double getKilometraje() {
		return kilometraje;
	}
	/**
	 * establece el kilometraje
	 * @param km
	 */
	public void setKilometraje(double km) {
		this.kilometraje = km;
	}
	/**
	 * obtener cuanto consume
	 * @return
	 */
	public double getConsumo_medio() {
		return consumo_medio;
	}
	/**
	 * establece el consumo 
	 * @param consumo_medio
	 */
	public void setConsumo_medio(double consumo_medio) {
		this.consumo_medio = consumo_medio;
	}
	/**
	 * obtener el precio del coche
	 * @return
	 */
	public double getPrecio_compra() {
		return precio_compra;
	}
	/**
	 * establece el precio de compra
	 * @param precio_compra
	 */
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	
}
