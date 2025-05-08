package interfaz5;

public class C_Refigerador extends C_Electrodomestico{

    protected boolean funcionCombi;


    public C_Refigerador(String marca, String modelo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente, boolean funcionCombi) {
        super(marca, modelo, E_EnumTipoElectro.REFRIGERADOR, estado, antiguedad, garantia, cliente);
        //TODO Auto-generated constructor stub
        this.funcionCombi = funcionCombi;
    }


    @Override
    void reparar() {
        System.out.println("Reparando Refigerador!");
   }

    @Override
    void probar() {
        System.out.println("Probando Refrigerador!");
    }


    public boolean isFuncionCombi() {
        return funcionCombi;
    }



    
    
}
