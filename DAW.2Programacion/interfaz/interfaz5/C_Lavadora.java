package interfaz5;

public class C_Lavadora extends C_Electrodomestico {
    protected String cargaMax;

    public C_Lavadora(String marca, String modelo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente , String cargaMax) {
        super(marca, modelo, E_EnumTipoElectro.LAVADORA , estado, antiguedad, garantia, cliente);
        this.cargaMax = cargaMax;
        
    }
    

    @Override
    void reparar() {
        System.out.println("Reparando Lavadora!");
    }


    @Override
    void probar() {
        System.out.println("Probando Lavadora!");
   }

    public String getCargaMax() {
        return cargaMax;
    }



    
}
