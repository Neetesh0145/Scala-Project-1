package controllers

import Service.{DepartmentService, EmployeeService}
import models.{Department, Employee}

import javax.inject._
import play.api.mvc._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()( @Inject()
                                val employeeService: EmployeeService,
                                @Inject()
                                val departmentService: DepartmentService,
                                val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  var departmentList: List[Department] = null
  var employeeList: List[Employee] = null
  var employee = new Employee()
  var departmentObj = new Department()


  def department() = Action { implicit request: Request[AnyContent] =>
    departmentList= departmentService.department()
    Ok(views.html.department(departmentList))
  }

  def viewEmployee() = Action { implicit request: Request[AnyContent] =>
    employeeList= employeeService.viewEmployee()
    Ok(views.html.employee(employeeList))
  }

  def youngestInDepartment() = Action { implicit request: Request[AnyContent] =>
    var youngestInDepartmentList: List[Employee] = employeeService.youngestInDepartment()
    Ok(views.html.youngestInDepartment(youngestInDepartmentList))
  }

  def eldestInDepartment() = Action { implicit request: Request[AnyContent] =>
    var eldestInDepartmentList: List[Employee] = employeeService.eldestInDepartment()
    Ok(views.html.eldestInDepartment(eldestInDepartmentList))
  }


  def departmentAge( d_id : Long) = Action { implicit request: Request[AnyContent] =>
    var departmentAge : Long= employeeService.departmentAge(d_id)
    Ok(views.html.departmentAge(departmentAge))
  }

  def departmentAverageAge( d_id : Long) = Action { implicit request: Request[AnyContent] =>
    var departmentAverageAge : Long= employeeService.departmentAverageAge(d_id)
    Ok(views.html.departmentAverageAge(departmentAverageAge))
  }

  def ittAverageAge( ) = Action { implicit request: Request[AnyContent] =>
    var ittAverageAge : Long= employeeService.ittAverageAge()
    Ok(views.html.ittAverageAge(ittAverageAge))
  }

  def ittAge( ) = Action { implicit request: Request[AnyContent] =>
    var ittAge : Long= employeeService.ittAge()
    Ok(views.html.ittAge(ittAge))
  }

  def availableVacancies(d_id : Long ) = Action { implicit request: Request[AnyContent] =>
    var currentStrength : Long= employeeService.availableVacancies(d_id)
    Ok(views.html.availableVacancies(currentStrength))
  }

  def recommendedForDirector() = Action { implicit request: Request[AnyContent] =>
    var reommendedForDirector : List[Employee]= employeeService.recommendedForDirector()
    Ok(views.html.recommendedForDirector(reommendedForDirector))
  }

  def index() = Action { implicit request: Request[AnyContent] =>
    var departmentObj = new Department()
    departmentList= departmentObj.addDepartment()

    var employee = new Employee()
    employeeList= employee.addEmployee()

    Ok(views.html.index(employeeList,departmentList))
  }

}
