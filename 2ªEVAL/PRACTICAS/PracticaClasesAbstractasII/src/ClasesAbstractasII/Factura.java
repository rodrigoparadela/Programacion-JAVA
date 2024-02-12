package ClasesAbstractasII;

public class Factura {
    private int nfactura;
    private double importe;
    private double IVA;
    private double detalle;
    private  double totalFinal;

    //Constructores
    public Factura(){
    }
    public Factura(int nfactura,double importe,double IVA, double detalle,double totalFinal){
        this.nfactura=nfactura;
        this.importe=importe;
        this.IVA=IVA;
        this.detalle=detalle;
        this.totalFinal=totalFinal;
    }
    //Getters y setters
    public void setNfactura(int nfactura){this.nfactura=nfactura;}
    public void setImporte(double importe){this.importe=importe;}
    public void setIVA(double IVA){this.IVA=IVA;}
    public void setDetalle(double detalle){this.detalle=detalle;    }
    public void setTotalFinal(double totalFinal){this.totalFinal=totalFinal;}
    public int getNfactura(){return nfactura;}
    public double getImporte(){return importe;}
    public double getIVA(){return IVA;}
    public double getDetalle(){return  detalle;}
    public double getTotalFinal(){return totalFinal;}

    //Método Mostrar Datos
    public void mostrarDatos(){
        System.out.println("Nº Factura: "+nfactura);
        System.out.println("Importe: "+importe);
        System.out.println("IVA: "+IVA);
        System.out.println("Detalle: "+detalle);
        System.out.println("Total: "+totalFinal+"€");
    }

    //Método Calcular IVA
    public double calcularIVA(double importe){
        double IVA;
        IVA = importe*0.21;
        this.IVA=IVA;
        return IVA;
    }
    //Método Total Final
    public double totalFinal(){
        double totalFinal;
        totalFinal=importe+IVA+detalle;
        this.totalFinal=totalFinal;
        return totalFinal;
    }

}
