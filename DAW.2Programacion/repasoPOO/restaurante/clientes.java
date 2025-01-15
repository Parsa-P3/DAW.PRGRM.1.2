package restaurante;

public class clientes {
    private String nombreCliente;
    private int idCliente;
    mesas mesas;

    public clientes(int idCliente, String nombreCliente , mesas mesas) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.mesas = mesas;
    
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;

    
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;

    }

    public mesas getMesas() {
        return mesas;
    }

    public void setMesas(mesas mesas) {
        this.mesas = mesas;
    }

    public int  asignarMesa(int x){
      mesas.getNumeroMesa();
      return x ;
       
    }

    public void info(){
        System.out.println("Nombre de cliente : " + nombreCliente);
        System.out.println("id de cliente : " + idCliente);
        System.out.println("Mesa asignado : " + mesas.getNumeroMesa());
        
        
    }

    
}
