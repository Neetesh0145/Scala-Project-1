package models

/*
import java.sql.Timestamp
case class Department(d_id: Long,
                      d_name: String,
                      createdDate: Timestamp,
                      createdBy: String,
                      updatedDate: Timestamp,
                      updatedBy: String
                      activeStatus : String)
*/
case class Department(d_id: Long,
                      d_name: String,
                      activeStatus : String){

  def this() = this(0,"","")
  var department: List[Department] = null

  def  addDepartment() : List[Department] ={
    var department1 = new Department(1,"Directors","Y")
    var department2 = new Department(1,"Engineering","Y")
    var department3 = new Department(1,"Services","Y")
    var department4 = new Department(1,"Operations","Y")

    department = List(department1, department2, department3, department4)
    department.foreach(println)
    return department;
  }


  def  deleteDepartment(d_id : Long) : Unit = {

  }

  def  updateDepartment(d_id : Long) : Unit = {

  }

}



