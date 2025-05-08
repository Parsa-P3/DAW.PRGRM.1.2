package EjemplosGenerico.ej1;

public class AlmacenGenerico {
        public static void main(String[] args) {
            ValPar<Integer, String> par1 = new ValPar<>(1, "Uno", "Numero en letras");
            par1.getValor(); 
            par1.mostrarInformacion();
    
            System.out.println();
    
            // Clave: String, Valor: Double
            ValPar<String, Double> par2 = new ValPar<>("Pan", .30, "Precio");
            par2.getValor();
            par2.setValor(0.35);
            par2.mostrarInformacion();
            
        }
}
