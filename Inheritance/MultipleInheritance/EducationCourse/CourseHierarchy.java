package MultipleInheritance.EducationCourse;

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
            "Data Structures & Algorithms",
            12,
            "Udemy",
            true,
            199.99,
            20
        );

        poc.displayInfo();
    }
}
