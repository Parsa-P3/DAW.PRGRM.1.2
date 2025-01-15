package restaurante;

public class ordenes {
    mesas mesas;
    clientes clientes;
    platos platos;

    public ordenes(clientes clientes, mesas mesas, platos platos) {
        this.clientes = clientes;
        this.mesas = mesas;
        this.platos = platos;
    }

    public clientes getClientes() {
        return clientes;
    }

    public void setClientes(clientes clientes) {
        this.clientes = clientes;
    }

    public platos getPlatos() {
        return platos;
    }

    public void setPlatos(platos platos) {
        this.platos = platos;
    }

    public mesas getMesas() {
        return mesas;
    }

    public void setMesas(mesas mesas) {
        this.mesas = mesas;
    }
    
    public double cuenta(double x){
        x = platos.getPrecio() * mesas.getCapacidadMesa();
        return x;
    }

    public void info(){
        System.out.println("Cliente "+ clientes.getNombreCliente() + " de  mesa " + mesas.getNumeroMesa() + " Ha pedido " + platos.getDescripcion() );
        
    }
    
}
