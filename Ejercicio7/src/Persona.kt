class Persona(val dni : String){
    val cuentasBancarias : Array<Cuenta?> = arrayOfNulls(3)

    fun morosos(): Boolean {
        for (cuenta in cuentasBancarias){
            if (cuenta != null) {
                if (cuenta.saldo < 0) {
                    return true
                }
            }
        }
        return false
    }

    fun realizarTransferencia( personaDestino: Persona, cuentaOrigen: Int, cuentaDestino: Int, cantidad: Double): Boolean {
        val cuenta_Origen = cuentasBancarias[cuentaOrigen]
        val cuenta_Destino = personaDestino.cuentasBancarias[cuentaDestino]

        if (cuenta_Origen != null && cuenta_Destino != null && cuenta_Origen.saldo >= cantidad) {
                cuenta_Origen.saldo -= cantidad
                cuenta_Destino.saldo += cantidad
                println("Transferencia realizada correctamente")
                return true
        } else{
            println("No se pudo realizar la transferencia")
            return false
        }
    }

    fun agregarCuenta(cuenta: Cuenta): Boolean {
        for (i in cuentasBancarias.indices){
            if (cuentasBancarias[i] == null){
                cuentasBancarias[i] = cuenta
                println("Cuenta agregada con éxito.")
                return true
            }
        }
        return false
    }

}