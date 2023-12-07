/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;


/**
 *
 * @author USUARIO
 */
public class Movimiento {
    String descripcion;
    Amigo[] participantes;
    Amigo quienPago;
    double monto;
    String moneda;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Amigo[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Amigo[] participantes) {
        this.participantes = participantes;
    }

    public Amigo getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(Amigo quienPago) {
        this.quienPago = quienPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    
    // Constructor que inicializa el movimiento con una descripción, participantes, quién pagó, monto y moneda
     

    public Movimiento(String descripcion, Amigo[] participantes, Amigo quienPago, double monto, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.monto = monto;
        this.moneda = moneda;
    }
}
