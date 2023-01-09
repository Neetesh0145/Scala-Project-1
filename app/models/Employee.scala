package models



import Constant.Constants

import java.sql.Timestamp
import scala.collection.mutable.ListBuffer
/*
case class Employee(e_id: Long,
                    d_id: Long,
                    e_name: String,
                    e_age: Int,
                    createdDate: Timestamp,
                    createdBy: String,
                    updatedDate: Timestamp,
                    updatedBy: String,
                    activeStatus : String)
*/

case class Employee(e_id: Long,
               d_id: Long,
               e_name: String,
               e_age: Int,
               activeStatus : String){

  def this() = this(0,0,"",0,"")
  var employee: List[Employee] = null


  //-----------
  def departmentAge(d_id : Long) : Long = {
    employee = addEmployee();
    var employeeList = employee.filter( x => x.d_id==d_id)
    var departmentAge : Long = 0
    for(t <- 0 to employeeList.length-1){
      departmentAge = departmentAge + employeeList(t).e_age
    }
    return departmentAge
  }

  //-----------
  def departmentAverageAge(d_id : Long) : Long = {
    employee = addEmployee();
    var employeeList = employee.filter( x => x.d_id==d_id)

    var departmentAverageAge : Long = 0
    var count : Int =0
    for(t <- 0 to employeeList.length-1){
      departmentAverageAge = departmentAverageAge + employeeList(t).e_age
      count = count +1
    }
    departmentAverageAge =departmentAverageAge/count
    return departmentAverageAge
  }

  //-----------
  def ittAverageAge() : Long = {
    employee = addEmployee();
    var ittAverageAge : Long = 0
    var count : Int =0
    for(t <- 0 to employee.length-1){
      ittAverageAge = ittAverageAge + employee(t).e_age
      count = count +1
    }
    ittAverageAge =ittAverageAge/count
    return ittAverageAge
  }

  //-----------
  def ittAge() : Long = {
    employee = addEmployee();
    var ittAge : Long = 0
    for(t <- 0 to employee.length-1){
      ittAge = ittAge + employee(t).e_age
    }
    return ittAge
  }

  //-----------
  def availableVacancies(d_id : Long) : Long = {
    employee = addEmployee();
    var employeeList = employee.filter( x => x.d_id==d_id)
    var currentStrength : Long = Constants.MAX_EMPLOYEE_COUNT - employeeList.length
    return currentStrength
  }

  //-----------
  def recommendedForDirector() : List[Employee] = {
    employee = addEmployee();
    var employeeList = employee.filter( x => (x.d_id==2 || x.d_id==3) && x.e_age>40)
    return employeeList
  }

  //def addEmployee(e_id: Long, d_id: Long, e_name: String, e_age: Int, activeStatus : String) : List[Employee] ={
  def addEmployee() : List[Employee] ={
  var employee1 = new Employee(1,1,"Jeet",54,"Y")
  var employee2 = new Employee(2,1,"Sandeep",50,"Y")
  var employee3 = new Employee(3,1,"Vijaya",45,"Y")
  var employee4 = new Employee(4,1,"Sunil",43,"Y")
  var employee5 = new Employee(5,1,"Rakesh",46,"Y")

  var employee6 = new Employee(6,2,"Gnanraj",34,"Y")
  var employee7 = new Employee(7,2,"Dipankar",22,"Y")
  var employee8 = new Employee(8,2,"Rohan",23,"Y")
  var employee9 = new Employee(9,2,"Ashish",30,"Y")
  var employee10 = new Employee(10,2,"Mohd",29,"Y")
  var employee11 = new Employee(11,2,"Nitesh",26,"Y")

  var employee12 = new Employee(12,3,"Tapish",35,"Y")
  var employee13 = new Employee(13,3,"Aayush",34,"Y")
  var employee14 = new Employee(14,3,"Surendra",45,"Y")
  var employee15 = new Employee(15,3,"Ashi",25,"Y")
  var employee16 = new Employee(16,3,"Vikas",29,"Y")

  var employee17 = new Employee(15,3,"Ashi",25,"Y")
  var employee18 = new Employee(18,4,"Ghanshyam",30,"Y")
  var employee19 = new Employee(19,4,"Mukesh",42,"Y")
  var employee20 = new Employee(20,4,"Bhanu",22,"Y")

    employee = List(employee1, employee2, employee3, employee4, employee5, employee6, employee7,
      employee8, employee9, employee10, employee11, employee12, employee13, employee14,
      employee15, employee16, employee17, employee18, employee19, employee20)
    //employee.foreach(println)
    return employee
  }

  def youngestInDepartment() : List[Employee] = {
    var employee4 = new Employee(4,1,"Sunil",43,"Y")
    var employee7 = new Employee(7,2,"Dipankar",22,"Y")
    var employee15 = new Employee(15,3,"Ashi",25,"Y")
    var employee17 = new Employee(15,3,"Ashi",25,"Y")
    var youngestEmployeeList: List[Employee] = List(employee4, employee7, employee15, employee17)
    youngestEmployeeList.foreach(println)
    return youngestEmployeeList
  }

  def eldestInDepartment() : List[Employee] = {
    var employee1 = new Employee(1,1,"Jeet",54,"Y")
    var employee6 = new Employee(6,2,"Gnanraj",34,"Y")
    var employee14 = new Employee(14,3,"Surendra",45,"Y")
    var employee19 = new Employee(19,4,"Mukesh",42,"Y")

    var eldestInDepartmentList: List[Employee] = List(employee1, employee6, employee14, employee19)
    //eldestInDepartmentList.foreach(println)
    return eldestInDepartmentList
  }




  def deleteEmployee(e_id : Long) : Unit = {

  }

  def updateEmployee(e_id : Long) : Unit = {

  }

}


