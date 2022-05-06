fun main() {
    val amount = 1000_00

    val percentCommission = (amount * 0.075).toInt()
    val minCommission = 35_00

    val resultCommission = if (percentCommission < minCommission) minCommission else percentCommission

    println(resultCommission)
}