package com.rybarstudios.oopassignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        //Task 1
        val stringList = mutableListOf<String>()
        stringList.add("1")

        val employeeManager = EmployeeManager<Employee>()
        employeeManager.put(Employee())
//        employeeManager.put(NotAnEmployee())
    }

    //Task 2
    class EmployeeManager<Employee> {
        private var employee: Employee? = null

        fun put(employee: Employee) {
            this.employee = employee
        }

        fun get(): Employee? {
            return employee
        }
    }

    data class Employee(val name: String = "Christian")

    data class NotAnEmployee(val name:String = "Matthew")

    class CellularService(var serviceName: String)

    class Phone<T: CellularService>(private var serviceName: CellularService)


}
