package classComponents.methods;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse();
        courseController.editCourse();
        courseController.deleteCourse();
    }
}
