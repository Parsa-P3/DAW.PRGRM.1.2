package interfaz5;

import java.time.LocalDate;

public class A_OrdenReparacion {
    protected int CodigoOrden;
    protected LocalDate fechaCreacion;
    C_Electrodomestico electrodomestico;
    B_Tecnico tecnico;
    protected String estado ;
    protected String diagnostico;
    protected int numPiezasUsadas;
    protected double costeTotal;
    protected String tiempoEstimado;

    
    




    public A_OrdenReparacion(int codigoOrden, C_Electrodomestico electrodomestico , String diagnostico) {
        CodigoOrden = codigoOrden;
        this.fechaCreacion = LocalDate.now();
        this.electrodomestico = electrodomestico;
        this.estado = "Pendiente!";
        this.diagnostico = diagnostico;
        this.numPiezasUsadas = 0;
        this.costeTotal = 0.00;
        this.tiempoEstimado = "0";
    }

    

    
    public void asignarT(B_Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void asignarE(C_Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public int Asignarpieza(int x){
        x += 1;
        return x;
    }

    public void RegistrarDiagnostico(String x){
        this.diagnostico = x;
    }

    public void estimartiempo(){
        if(tecnico.getCategoria().equals("junior")){
            if(electrodomestico.getTipo().equals("Televisor")){
              setTiempoEstimado("16h");
            }else if(electrodomestico.getTipo().equals("Lavadoras")){
                setTiempoEstimado("8h");
            }
            else if(electrodomestico.getTipo().equals("Microondas")){
                setTiempoEstimado("4h");
            }
            else if(electrodomestico.getTipo().equals("Refigerador")){
                setTiempoEstimado("4h");
            }else {
                System.out.println("Error!");
            }
        }else if (tecnico.getCategoria().equals("senior")){
            if(electrodomestico.getTipo().equals("Televisor")){
                setTiempoEstimado("8h");
              }else if(electrodomestico.getTipo().equals("Lavadoras")){
                  setTiempoEstimado("4h");
              }
              else if(electrodomestico.getTipo().equals("Microondas")){
                  setTiempoEstimado("2h");
              }
              else if(electrodomestico.getTipo().equals("Refigerador")){
                  setTiempoEstimado("2h");
              }else {
                  System.out.println("Error!");
              }
        }
    }

    public void calcularCoste(){
        if(electrodomestico.isGarantia() == true ){
            costeTotal = 0.0;
            setCosteTotal(costeTotal);
        }else{
            double manoDeObra = 50.00;
            double CostePieza = getNumPiezasUsadas() * 30.00;
            if(electrodomestico.getCliente().isEsVIP()){
                double total = manoDeObra + CostePieza;
                costeTotal = total - (total * 0.10);
            }else{
                double total = manoDeObra + CostePieza;
                costeTotal =total;
            }
        }
    }



      

   

    



    public void setCodigoOrden(int codigoOrden) {
        CodigoOrden = codigoOrden;
    }



    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }



    public void setElectrodomestico(C_Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }



    public void setTecnico(B_Tecnico tecnico) {
        this.tecnico = tecnico;
    }



    public void setEstado(String estado) {
        this.estado = estado;
    }



    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }



    public void setNumPiezasUsadas(int numPiezasUsadas) {
        this.numPiezasUsadas = numPiezasUsadas;
    }



    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }



    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }



    public int getCodigoOrden() {
        return CodigoOrden;
    }



    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }



    public C_Electrodomestico getElectrodomestico() {
        return electrodomestico;
    }



    public B_Tecnico getTecnico() {
        return tecnico;
    }



    public String getEstado() {
        return estado;
    }



    public String getDiagnostico() {
        return diagnostico;
    }



    public int getNumPiezasUsadas() {
        return numPiezasUsadas;
    }



    public double getCosteTotal() {
        return costeTotal;
    }



    public String getTiempoEstimado() {
        return tiempoEstimado;
    }




    @Override
    public String toString() {
        if(this.tecnico == null){
            return "- CodigoOrden = " + CodigoOrden + "\n" 
            + "- fechaCreacion = " + fechaCreacion + "\n"
            + "- electrodomestico = " + electrodomestico + "\n"
            + "- tecnico = no asignado " + "\n" 
            + "- estado = " + estado + "\n"
            + "- diagnostico = " + diagnostico + "\n"
            + "- numPiezasUsadas = " + numPiezasUsadas + "\n"
            + "- costeTotal = " + costeTotal + "\n"
            + "- tiempoEstimado = " + tiempoEstimado + "\n";
        }
    
       else {
       return "- CodigoOrden = " + CodigoOrden + "\n"
            + "- fechaCreacion = " + fechaCreacion + "\n"
            + "- electrodomestico = " + electrodomestico + "\n"
            + "- tecnico = " + tecnico + "\n"
            + "- estado = " + estado + "\n"
            + "- diagnostico = " + diagnostico + "\n"
            + "- numPiezasUsadas = " + numPiezasUsadas + "\n"
            + "- costeTotal = " + costeTotal + "\n"
            + "- tiempoEstimado = " + tiempoEstimado + "\n";
            }
        }


  
    
    
}
