package ClasesAbstractasII;

public class Main {
    public static void main(String[] args) {
        Factura miFactura=new Factura();
        //Con métodos set asignamos los valores del nº de la factura, el importe y el detalle.
        miFactura.setNfactura(99999);
        miFactura.setImporte(45.50);
        miFactura.setDetalle(15.10);
        //con el método calcular IVA calculamos el IVA y asignamos el valor a la variable
        miFactura.calcularIVA(miFactura.getImporte());
        //con el método Total Final calculamos el total y asignamos el valor a la variable
        miFactura.totalFinal();
        //Mostramos todos los datos
        miFactura.mostrarDatos();
    }
}