package Service

import models.{Department, Employee}
import play.api.mvc.{AnyContent, Request}


import play.api._
import javax.inject._
/*
@Singleton
class EmployeeService @Inject()() {
*/

class EmployeeService {

  var employee = new Employee()
  var departmentList: List[Department] = null
  var employeeList: List[Employee] = null
  var departmentObj = new Department()

  def viewEmployee() : List[Employee]= {
    employeeList= employee.addEmployee()
    return employeeList
  }

  def youngestInDepartment() : List[Employee]= {
    var youngestInDepartmentList: List[Employee] = employee.youngestInDepartment()
    return youngestInDepartmentList
  }

  def eldestInDepartment() : List[Employee] = {
    var eldestInDepartmentList: List[Employee] = employee.eldestInDepartment()
    return eldestInDepartmentList
  }


  def departmentAge( d_id : Long) : Long = {
    var departmentAge : Long= employee.departmentAge(d_id)
    return  departmentAge
  }

  def departmentAverageAge( d_id : Long): Long = {
    var departmentAverageAge : Long= employee.departmentAverageAge(d_id)
    return departmentAverageAge
  }

  def ittAverageAge( ) : Long= {
    var ittAverageAge : Long= employee.ittAverageAge()
    return ittAverageAge
  }

  def ittAge( ) : Long= {
    var ittAge : Long= employee.ittAge()
    return ittAge
  }

  def availableVacancies(d_id : Long ) : Long = {
    var currentStrength : Long= employee.availableVacancies(d_id)
    return currentStrength
  }

  def recommendedForDirector(): List[Employee] = {
    var reommendedForDirector : List[Employee]= employee.recommendedForDirector()
    return reommendedForDirector;
  }

}
