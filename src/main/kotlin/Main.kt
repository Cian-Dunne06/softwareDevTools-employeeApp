import model.Employee
import service.PayrollService

val payrollService = PayrollService()

var employee = Employee(
    1,
    "Joe",
    "Soap",
    "Computer Services",
    "Technician",
    32.45,
    38,
    5,
    5.0,
    23.0,
    7.5
)

fun main() {

    add()
    var input: Int

    do {
        input = menu()
        when(input) {
            1 -> println("Hourly Rate: $employee.hourlyRate")
            2 -> println("Hours Worked: $employee.hoursWorked")
            3 -> println("OvertimeHours: $employee.overtimeHoursWorked, Amount Earned: ${payrollService.calculateOvertimePay(employee)}")
            4 -> println("Bonus Amount: ${money(payrollService.calculateBonus(employee))}")
            5 -> println("Tax Paid: ${money(payrollService.calculateTax(employee))} at rate $employee.taxRatePercentage")
            6 -> println("Pension Paid: ${money(payrollService.calculatePension(employee))} at rate $employee.pensionContributionPercentage")
            7 -> println("Gross Pay: ${money(payrollService.calculateGrossPay(employee))}")
            8 -> println("Net Pay: ${money(payrollService.calculateNetPay(employee))}")
            9 -> println(payrollService.getPayslip(employee))
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
}

fun menu() : Int {
    print("""
        model.Employee Menu for ${payrollService.getFullName(employee)}
        1. Hourly Rate
        2. Hours Worked
        3. Overtime Hours
        4. Bonus
        5. Tax Rate
        6. Pension
        7. Gross Pay
        8. Net Pay
        9. Full Payslip
        -1. Exit
        Enter Option :  """)
    return readln().toInt()
}

fun money(value: Double) = "€%.2f".format(value)

fun add() {
    println("Enter employee ID: ")
    val employeeId = readln().toInt()

    println("Enter first name: ")
    val firstName = readlnOrNull().toString()

    println("Enter surname: ")
    val surname = readlnOrNull().toString()

    println("Enter department: ")
    val department = readlnOrNull().toString()

    println("Enter job title: ")
    val jobTitle = readlnOrNull().toString()

    println("Enter hourly rate: ")
    val hourlyRate = readln().toDouble()

    println("Enter hours worked: ")
    val hoursWorked = readln().toInt()

    println("Enter overtime hours worked: ")
    val overtimeHoursWorked = readln().toInt()

    println("Enter bonus percentage: ")
    val bonusPercentage = readln().toDouble()

    println("Enter tax rate percentage: ")
    val taxRatePercentage = readln().toDouble()

    println("Enter pension contribution percentage: ")
    val pensionContributionPercentage = readln().toDouble()

    employee = Employee(
        employeeId,
        firstName,
        surname,
        department,
        jobTitle,
        hourlyRate,
        hoursWorked,
        overtimeHoursWorked,
        bonusPercentage,
        taxRatePercentage,
        pensionContributionPercentage
    )
}