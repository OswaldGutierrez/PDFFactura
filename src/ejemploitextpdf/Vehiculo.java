/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploitextpdf;

/**
 *
 * @author Oswald David
 */
public class Vehiculo {
    
    private String precio;
    private String codigo;
    private String modelo;
    private String Clase;
    private String marca;
    private String referencia;

    public Vehiculo(String precio, String codigo, String modelo, String Clase, String marca, String referencia) {
        this.precio = precio;
        this.codigo = codigo;
        this.modelo = modelo;
        this.Clase = Clase;
        this.marca = marca;
        this.referencia = referencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    

    
    
    
}
