class Cuenta(val nCuenta: Int, var saldo: Double = 0.0) {

    fun consultarSaldo(): Double {
        return this.saldo
    }

    fun recibirAbonos(abono : Double){
        this.saldo += abono
        println("Abono añadido correctamente.")
    }

    fun realizarPago(pago: Double){
        if (pago > this.saldo){
            println("No hay suficiente dinero en la cuenta para realizar el pago.")
        }else{
            this.saldo  -= pago
        }
    }

}