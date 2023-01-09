package Service

import models.{Department, Employee}

import javax.inject.Inject

/*
@Singleton
class DepartmentService @Inject() (){
*/
class DepartmentService {

  var departmentObj = new Department()
  var departmentList: List[Department] = null
  var employeeList: List[Employee] = null
  var employee = new Employee()

  def department() :  List[Department] ={
    departmentList= departmentObj.addDepartment()
    return departmentList;
  }

}
