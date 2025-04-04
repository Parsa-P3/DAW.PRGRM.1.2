package interfaz5;

public class C_Microondas extends C_Electrodomestico{

    protected boolean tieneGrill;

    public C_Microondas(String marca, String modelo, String tipo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente , boolean tieneGrill) {
        super(marca, modelo, tipo, estado, antiguedad, garantia, cliente);
        //TODO Auto-generated constructor stub
 
        this.tieneGrill = tieneGrill;

    }


    public boolean isTieneGrill() {
        return tieneGrill;
    }

    
    
}
