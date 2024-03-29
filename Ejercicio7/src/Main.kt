/*
Ejercicio 4.7

1 Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta y un saldo disponible.

2 Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.

3 Crear también una clase Persona, que se caracteriza por un DNI y una lista de cuentas bancarias.

4 La Persona puede tener asociada hasta 3 cuentas bancarias, y debe tener un método que permita añadir cuentas (hasta 3 el máximo permitido). Las cuentas se almacenarán en un array/vector. No usar una lista.

5 Métodos de clase:

    *Debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo). Recibirá como parámetro el objeto Persona y devolverá un booleano.
    *Debe contener un método que realice una transferencia entre dos cuentas. Recibirá como parámetro dos objetos PersonaB, dos identificacdors de cuentas y la cantidad a transferir. Devolverá un booleano indicando si se ha podido realizar o no la operación.
6 En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta, una sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros con la segunda. Imprimir por pantalla si la persona es morosa.

7 Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos) y mostrar por pantalla el estado de la persona.
 */
fun main() {

    val persona = Persona("32668759P")

    val cuenta1 = Cuenta(787878755)
    val cuenta2 = Cuenta(554322789, 700.0)

    persona.agregarCuenta(cuenta1)
    persona.agregarCuenta(cuenta2)
    println()
    cuenta1.recibirAbonos(1100.0)
    cuenta2.realizarPago(750.0)
    println()
    println("¿Es morosa la persona? ${persona.morosos()}")
    println()
    val persona2 = Persona("13244327A")
    persona2.agregarCuenta(Cuenta(443226758))
    println()
    persona.realizarTransferencia(persona2,0,0,500.0)

    println()
    println("Estado de la persona:")
    for (cuenta in persona.cuentasBancarias){
        println("Cuenta: $cuenta - Saldo: ${cuenta?.consultarSaldo()}€")
    }

}