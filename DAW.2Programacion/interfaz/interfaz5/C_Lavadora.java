package interfaz5;

public class C_Lavadora extends C_Electrodomestico {
    protected String cargaMax;

    public C_Lavadora(String marca, String modelo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente , String cargaMax) {
        super(marca, modelo, "Lavadora", estado, antiguedad, garantia, cliente);
        this.cargaMax = cargaMax;
        
    }
    

    public String getCargaMax() {
        return cargaMax;
    }

    
}
