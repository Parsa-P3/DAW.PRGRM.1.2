package EjemplosGenerico.ej1;

public class ValPar<K,V> {
    private K clave;
    private V valor;
    private String etiqueta;
    private int contadorAccesos;

    // constructor de 2 generico y un String
    public ValPar(K clave, V valor, String etiqueta) {
        this.clave = clave;
        this.valor = valor;
        this.etiqueta = etiqueta;
        this.contadorAccesos = 0;
    }

    // añado 'contadorAccesos++;' en cada get y set para aumentar el contador de cada acceso !

    public K getClave() {
        contadorAccesos++;
        return clave;
    }

    public void setClave(K clave) {
        contadorAccesos++;
        this.clave = clave;
    }

    public V getValor() {
        contadorAccesos++;
        return valor;
    }

    public void setValor(V valor) {
        contadorAccesos++;
        this.valor = valor;
    }

    public String getEtiqueta() {
        contadorAccesos++;
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        contadorAccesos++;
        this.etiqueta = etiqueta;
    }

    public int getContadorAccesos() {
        contadorAccesos++;
        return contadorAccesos;
    }

    public void mostrarInformacion() {
        System.out.println("Clave: " + clave);
        System.out.println("Valor: " + valor);
        System.out.println("Etiqueta: " + etiqueta);
        System.out.println("Contador de Accesos: " + contadorAccesos);
    }


}
