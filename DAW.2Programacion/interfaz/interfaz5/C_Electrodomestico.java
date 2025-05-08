package interfaz5;

abstract class C_Electrodomestico {
    private String marca;
    private String modelo;
    private E_EnumTipoElectro tipo;
    private String estado;
    private String antiguedad;
    private boolean garantia;
    B_Cliente cliente;


    public C_Electrodomestico(String marca, String modelo, E_EnumTipoElectro tipo, String estado, String antiguedad,
            boolean garantia, B_Cliente cliente) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.estado = estado;
        this.antiguedad = antiguedad;
        this.garantia = garantia;
        this.cliente = cliente;
    }


    abstract void reparar();
    
    abstract void probar();

    public void mostrarInformacion(){};

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public void setTipo(E_EnumTipoElectro tipo) {
        this.tipo = tipo;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }



    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }



    public void setCliente(B_Cliente cliente) {
        this.cliente = cliente;
    }



    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


 

    public String getEstado() {
        return estado;
    }


    public String getAntiguedad() {
        return antiguedad;
    }


    public boolean isGarantia() {
        return garantia;
    }


    public B_Cliente getCliente() {
        return cliente;
    }



    public E_EnumTipoElectro getTipo() {
        return tipo;
    }


    
}
