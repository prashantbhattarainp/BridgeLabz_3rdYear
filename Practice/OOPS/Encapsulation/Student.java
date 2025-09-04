class Student{
    private int studentRollNumber;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    public int getStudentRollNumber(){
        return studentRollNumber;
    }
    public void setStudentRollNumber(int studentRollNumber){
        this.studentRollNumber=studentRollNumber;
    }


    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

//pojo(plain java object) class 
//bin class
//encapsulated class

    public int getstudentAge(){
        return studentAge;
    }

    public void setStudentAge(int studentAge){
        this.studentAge=studentAge;
    }



    public String getstudentDepartment(){
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment){
        this.studentDepartment=studentDepartment;
    }

    @Override   
    public String toString(){
        return "StudentRollNumber:- " + studentRollNumber + "\nStudent Name:- "+ studentName + "\nStudentAge:- "+ studentAge + "\nStudentDepartment:-" + studentDepartment;
    }
}
