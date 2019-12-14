import java.text.DecimalFormat

fun main() {

    var totaltab = 0.00
    var tempTab = 0.00
    val tax = 0.025

    val outformat = DecimalFormat( "\u00A4###,###,###.00")
    var indicator = 1

    while(indicator == 1){
        println("Please enter a cost to add to your bill. Enter 0 to get final check.")
        tempTab = readLine()!!.toDouble()
        totaltab += tempTab

        if (tempTab.compareTo(0.00) == 0)
            indicator = 0
    }
    val subtotal = totaltab * (1 + tax)
    val totaltabStr = outformat.format(subtotal)

    println("Your bill total with 2.5% tax added is: $totaltabStr." )

    println("Please enter the percentage you would like to tip (17.5% recommended).")
    val tip = readLine()!!.toDouble()
    val subtotalwtip = subtotal * (1 + tip/100)
    val finaltab = outformat.format(subtotalwtip)

    println("Your final bill with tax and tip is $finaltab")
}