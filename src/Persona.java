abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;
    protected String rol;

    public Persona(String nombre,String cedula,String direccion,String telefono,String rol){
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.direccion=direccion;
        this.rol=rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    void actualizarDatos(String direccion, String telefono){
    };
    public abstract void mostrarRol();
}
class Cliente extends Persona {
    private int idCliente;
    private String tipoCuenta;
    private double ahorros;
    public Cliente(String nombre,String cedula,String direccion,String telefono,String rol,int idCliente,String tipoCuenta,double ahorros){
        super(nombre, cedula, direccion, telefono, rol);
        this.idCliente=idCliente;
        this.tipoCuenta=tipoCuenta;
        this.ahorros=ahorros;
    }
    boolean ingresarAlSistema(){
        return true;
    }
    void registrarCuenta(String tipo){

    }
    void solicitarPrestamo(double prestamo){
        if (prestamo>200){
            System.out.println("Prestamo de "+prestamo+" aceptado.");
        }else {
            System.out.println("Prestamo rechazado");
        }
    }
    void agregarTarjetaCredito(){

    }
    void verResumenFinanciero(){

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getAhorros() {
        return ahorros;
    }

    public void setAhorros(double ahorros) {
        this.ahorros = ahorros;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Rol: ");
    }
}
abstract class Empleado extends Persona{
    protected int idEmpleado;
    protected String puestoEmpleado;
    public Empleado(String nombre,String cedula,String direccion,String telefono,String rol,int idEmpleado,String puestoEmpleado){
        super(nombre, cedula, direccion, telefono, rol);
        this.idEmpleado=idEmpleado;
        this.puestoEmpleado=puestoEmpleado;
    }
    boolean autenticarEmpleado(String usuario,String clave){
        return true;
    }
    void crearCuentaParaCliente(Cliente cliente, String tipo){

    }
    void modificarDatosCliente(Cliente cliente){

    }
    void registrarPrestamo(Cliente cliente, double monto){

    }
    void cerrarCuenta(Cliente cliente){

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
}
class Cajero extends Empleado{
    private int cubiculo;
    public Cajero(String nombre,String cedula,String direccion,String telefono,String rol,int idEmpleado,String puestoEmpleado,int cubiculo){
        super(nombre, cedula, direccion, telefono, rol,idEmpleado,puestoEmpleado);
        this.cubiculo=cubiculo;
    }
    void procesarRetiro(Cliente cliente, double monto){

    }
    void consultarSaldo(Cliente cliente){

    }
    void procesarDeposito(Cliente cliente,double monto){

    }

    public int getCubiculo() {
        return cubiculo;
    }

    public void setCubiculo(int cubiculo) {
        this.cubiculo = cubiculo;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Rol: ");
    }
}
class Balcon_Servicio extends Empleado{
    private int oficina;
    public Balcon_Servicio(String nombre,String cedula,String direccion,String telefono,String rol,int idEmpleado,String puestoEmpleado,int oficina){
        super(nombre, cedula, direccion, telefono, rol,idEmpleado,puestoEmpleado);
        this.oficina=oficina;
    }
    public Cliente registrarNuevoCliente(Cliente cliente){
        return cliente;
    }
    void actualizarDatosCliente(Cliente cliente){

    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Rol: ");
    }
}
class Gerente extends Empleado{
    private String sucursal;
    public Gerente(String nombre,String cedula,String direccion,String telefono,String rol,int idEmpleado,String puestoEmpleado,String sucursal){
        super(nombre, cedula, direccion, telefono, rol,idEmpleado,puestoEmpleado);
        this.sucursal=sucursal;
    }
    boolean aprobarPrestamo(Cliente cliente, double monto){
        return true;
    }
    void generarReporteOperaciones(){

    }
    void evaluarEmpleado(Empleado empleado){

    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Rol: ");
    }
}