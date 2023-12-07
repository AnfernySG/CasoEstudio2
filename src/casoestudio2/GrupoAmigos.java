/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author USUARIO
 */
public class GrupoAmigos {
    Amigo[] amigos;
    Movimiento[] movimientos;

    public GrupoAmigos(int numAmigos, int numMovimientos) {
        this.amigos = new Amigo[numAmigos];
        this.movimientos = new Movimiento[numMovimientos];
    }

    public void agregarAmigo(int indice, Amigo amigo) {
        amigos[indice] = amigo;
    }

    public void agregarMovimiento(int indice, Movimiento movimiento) {
        movimientos[indice] = movimiento;
    }

    public void analizarDeudas(Amigo amigo) {
        for (Movimiento movimiento : movimientos) {
            if (movimiento.quienPago == amigo) {
                for (Amigo participante : movimiento.participantes) {
                    if (participante != amigo) {
                        participante.deuda += movimiento.monto / movimiento.participantes.length;
                    }
                }
            }
        }

        for (Amigo participante : amigos) {
            if (participante != amigo) {
                System.out.println(amigo.nombre + " debe a " + participante.nombre + ": " + participante.deuda + " dolares");
            }
        }
        
    }
}
