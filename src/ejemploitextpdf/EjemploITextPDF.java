/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploitextpdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oswald David
 */
public class EjemploITextPDF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        
        Vehiculo vehiculo1 = new Vehiculo("312900000", "90036189", "2023", "Campero", "Toyota", "PRADO [LC 150]");
        listaVehiculos.add(vehiculo1);
        
        System.out.println("La lista tiene: " + listaVehiculos.size() + " de vehículo(s) vendido(s).");
        
        
        // LLAMADA AL MÉTODO PARA CREAR PDF
        crearPDFFactura(listaVehiculos);
    }
    
    
    public static void crearPDFFactura(List<Vehiculo> lista) throws FileNotFoundException, DocumentException {
        // Se crea el  objeto documento
        Document documento = new Document();
        
        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream("Factura.pdf");
        
        // Se asocia el documento de OutputStream
        PdfWriter.getInstance(documento, ficheroPDF);
        
        // Se abre el documento
        documento.open();

        // Párrafo
        Paragraph titulo;
        titulo = new Paragraph("Factura de compra \n\n", FontFactory.getFont("arial", 22, Font.BOLD, BaseColor.BLUE));
        
        // Añadimos el título al documento
        documento.add(titulo);
        
        // Creamos una tabla
        PdfPTable tabla = new PdfPTable(2);
        
        tabla.addCell("Precio");
        tabla.addCell(String.valueOf(lista.get(0).getPrecio()));

        tabla.addCell("Código");
        tabla.addCell(String.valueOf(lista.get(0).getCodigo()));
        
        tabla.addCell("Modelo");
        tabla.addCell(String.valueOf(lista.get(0).getModelo()));

        tabla.addCell("Clase");
        tabla.addCell(String.valueOf(lista.get(0).getClase()));
        
        tabla.addCell("Marca");
        tabla.addCell(String.valueOf(lista.get(0).getMarca()));

        tabla.addCell("Referencia");
        tabla.addCell(String.valueOf(lista.get(0).getReferencia()));
        
        
        // Añadimos la tabla al documento
        documento.add(tabla);
        
        // Creamos un párrafo para el texto
        Paragraph parrafo1 = new Paragraph("\nConforme a la transacción realizada, se ha procedido a la venta de un vehículo"
                + " de la marca Toyota, modelo 2023, perteneciente a la clase Campero y específicamente identificado por la referencia"
                + " PRADO [LC 150]. El monto acordado por esta adquisición asciende a la cantidad de 312,900,000. Este acto comercial queda"
                + " registrado bajo el código de identificación del vehículo en la base de datos del sistema Fasecolda.");
        
        parrafo1.setAlignment(Element.ALIGN_JUSTIFIED);
        documento.add(parrafo1);
        
        // Se cierra el documento
        documento.close();
    }
   
}
