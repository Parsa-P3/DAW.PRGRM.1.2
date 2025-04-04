package interfaz5;

public class C_Refigerador extends C_Electrodomestico{

    protected boolean funcionCombi;


    public C_Refigerador(String marca, String modelo, String tipo, String estado, String antiguedad, boolean garantia,
            B_Cliente cliente, boolean funcionCombi) {
        super(marca, modelo, tipo, estado, antiguedad, garantia, cliente);
        //TODO Auto-generated constructor stub
        this.funcionCombi = funcionCombi;
    }



    public boolean isFuncionCombi() {
        return funcionCombi;
    }

    
    
}
