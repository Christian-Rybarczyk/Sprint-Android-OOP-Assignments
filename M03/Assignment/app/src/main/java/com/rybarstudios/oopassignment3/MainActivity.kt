package com.rybarstudios.oopassignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

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

        val verizonService = VerizonService()
        val tMobileService = TMobileService()

        val phone = Phone(verizonService, tMobileService)

        val observable = Observable.just(1,2, 3)
        observable.subscribe() {string -> println(string)}

        val tom = Actor("Tom Cruise")
        val brad = Actor("Brad Pitt")

        val actorObservable = Observable.just(tom, brad)
        actorObservable.subscribe() {string -> println(string)}

        val movieList = FakeAPI.createMovieList()
        movieList.subscribe() {string -> println(string)}
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

    open class CellularService

    class VerizonService(val name: String = "Verizon") : CellularService()
    class TMobileService(val name: String = "T-Mobile") : CellularService()

    class Phone<T: CellularService, S: CellularService>(private var serviceName: T, private var otherService: S)

    data class Actor(val name: String)

    data class Movie(val releaseYear: String, val title: String, val language: String, val rating: String)

    class FakeAPI {
        companion object {
            fun createMovieList(): Observable<List<Movie>> {
                return Observable.just(listOf(
                    Movie("1992",
                        "The Mighty Ducks",
                        "English",
                        "10"),
                    Movie("2011",
                        "Moneyball",
                        "English",
                        "8"),
                    Movie("1965",
                        "The Saragossa Manuscript",
                        "Polish",
                        "9"),
                    Movie("1994",
                        "Pulp Fiction",
                        "English",
                        "10")
                ))
            }
        }
    }
}
