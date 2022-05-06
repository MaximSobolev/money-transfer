fun main() {
    val amount = 1000_00
    val percentCommission = (amount * 0.075).toInt()
    val resultCommission = if (percentCommission < 35_00) 35_00 else percentCommission

    println(resultCommission)
}