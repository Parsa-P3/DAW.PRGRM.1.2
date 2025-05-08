package interfaz5;

public class C_Televisor extends C_Electrodomestico {
   
    protected String dimensionP;


    public C_Televisor(String marca, String modelo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente , String dimensionP) {
        super(marca, modelo, E_EnumTipoElectro.TELEVISOR, estado, antiguedad, garantia, cliente);
        this.dimensionP = dimensionP;

    }
    


    @Override
    void reparar() {
        System.out.println("Reparando televisor!");
   }
    @Override
    void probar() {
        System.out.println("Probando televisor!");
    }


    public String getDimensionP() {
        return dimensionP;
    }










   

    
}
