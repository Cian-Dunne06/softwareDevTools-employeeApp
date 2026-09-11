fun main(args: Array<String>) {
    println("======Pay Slip Printer======")
    payslip()
}



fun payslip () {
    val employeeId = 6143
    val firstName = "Joe"
    val surname = "Soap"
    val department = "Computer Services"
    val jobTitle = "Technician"
    val hourlyRate = 26.87
    val hoursWorked = 39
    val overtimeHoursWorked = 4
    val bonusPercentage = 4.5
    val taxRatePercentage = 23.5
    val pensionContributionPercentage = 6.7
    val normalPay = hourlyRate*hoursWorked
    val overtimePay = (1.5*hourlyRate)*overtimeHoursWorked
    val grossPay = normalPay+overtimePay
    val bonus = grossPay*(bonusPercentage/100)
    val taxAmount = grossPay*(taxRatePercentage/100)
    val pensionAmount = grossPay*(pensionContributionPercentage/100)
    val netPay = grossPay-taxAmount-pensionAmount+bonus


    println("\n=========================================")
    println("       PAYSLIP")
    println("========================================")
    println("Employee ID:   : " + employeeId)
    println("Employee       : " + firstName.uppercase() + " " + surname.uppercase() + " (" + employeeId + ")")
    println("Job / Dept     : " + jobTitle + " (" + department + ")")
    println("-----------------------------------------")
    println("Hourly Rate    : €" + hourlyRate)
    println("Hours Worked   : " + hoursWorked)
    println("Overtime Hours : " + overtimeHoursWorked)
    println("-----------------------------------------")
    println("Normal Pay     : " + String.format("%.2f",normalPay))
    println("Overtime Pay   : " + String.format("%.2f",overtimePay))
    println("Gross Pay      : " + String.format("%.2f",grossPay))
    println("Bonus          : " + String.format("%.2f",bonus))
    println("Tax Deduction  : " + String.format("%.2f", taxAmount))
    println("Pension Amount : " + String.format("%.2f",pensionAmount))
    println("-------------------------------------")
    println("Net Pay        : " + String.format("%.2f",netPay))
    println("=====================================")


}