class StudentService{
    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;
    private Student studentFour;


    public void setStudentDetails(){

        studentOne = new Student();
        studentOne.setStudentRollNumber(1);
        studentOne.setStudentName("Prashant");
        studentOne.setStudentDepartment("CSE");
        studentOne.setStudentAge(23);  

        studentTwo = new Student();
        studentTwo.setStudentRollNumber(2);
        studentTwo.setStudentName("Pacific");
        studentTwo.setStudentDepartment("CSE");
        studentTwo.setStudentAge(22);

        studentThree = new Student();
        studentThree.setStudentRollNumber(3);
        studentThree.setStudentName("Sohan");
        studentThree.setStudentDepartment("CSE");
        studentThree.setStudentAge(20);

        studentFour = new Student();
        studentFour.setStudentRollNumber(4);
        studentFour.setStudentName("Anurag");
        studentFour.setStudentDepartment("CSE");
        studentFour.setStudentAge(24);
    }

    public void displayStudentDetails(){
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(studentFour); 
    }
}