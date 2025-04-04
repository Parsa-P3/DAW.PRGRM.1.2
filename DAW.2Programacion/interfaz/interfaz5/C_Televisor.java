package interfaz5;

public class C_Televisor extends C_Electrodomestico {
   
    protected String dimensionP;


    public C_Televisor(String marca, String modelo, String tipo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente , String dimensionP) {
        super(marca, modelo, tipo, estado, antiguedad, garantia, cliente);
        this.dimensionP = dimensionP;

    }
    



    public String getDimensionP() {
        return dimensionP;
    }




   

    
}
