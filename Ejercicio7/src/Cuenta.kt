class Cuenta(val nCuenta: Int, var saldo: Double = 0.0) {

    fun consultarSaldo(): String {
        return "Saldo actual: ${this.saldo}€"
    }

    fun recibirAbonos(abono : Double){
        this.saldo += abono
        println("Abono recibido correctamente.")
    }

    fun realizarPago(pago: Double){
        if (pago > this.saldo){
            println("No hay suficiente dinero en la cuenta")
        }else{
            this.saldo  -= pago
        }
    }

}