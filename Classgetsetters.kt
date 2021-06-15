fun main(){
	var students :Student = Student("OGHENEFEJIRO", "1158/2012", "Computer Science", "200l")
	
	println (students.name)
	
}

class Student {
	
	  var name: String= ""
	private var sId: String = ""
	var department : String = ""
	var level: String = ""
	
	constructor(name: String, sId : String, department: String, level : String){
		
		this.name = name 
		this.sId = sId
		this.department = department
		this.level = level
	}
	
	
}



fun result (name: String, sId: Int, department: String, gender: String){}

class Result {
	
	var name: String= ""
	var sId: String = ""
	var department : String = ""
	var gender: String = ""
	
	constructor(name: String, sId : String, department: String, gender : String){
		
		this.name = name 
		this.sId = sId
		this.department = department
		this.gender = gender
	}
}

fun studentId (sId: String, name: String, department: String, level: String){}

class Profile {
	
	var name: String= ""
	var sId: String = ""
	var department : String = ""
	var address: String = ""
	var s_Result: String = ""
	
	constructor(name: String, sId : String, department: String, address : String, s_Result: String ){
		
		this.name = name 
		this.sId = sId
		this.department = department
		this.address = address
		this.s_Result = s_Result
	}
}


fun s_Profile (name: String, sId: String, department: String, address: String, s_Result: String){}

class Course {
	
	var sId: String = ""
	var department : String = ""
	var cId: String = ""
	
	constructor(sId : String, department: String, cId: String){
		
		this.sId = sId
		this.department = department
		this.cId = cId 
	}
}


fun course (sId: String, department: String, cId: String){}

class College {
	
	var cName: String= ""
	var sId: String = ""
	var department : String = ""
	var gender: String = ""
	
	constructor(cName: String, sId : String, department: String, gender : String){
		
		this.cName = cName 
		this.sId = sId
		this.department = department
		this.gender = gender
	}
}

fun college (cName: String, sId: String, department: String, gender: String){}
    
