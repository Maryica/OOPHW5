package Controler;

import Data.Type;
import Data.Student;
import Service.DataService;
import View.StudentGroupView;
import View.StudentView;
import View.TeacherView;
import Data.Teacher;
import Service.StudentGroupService;

import java.util.List;
import java.util.ArrayList;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudent(String firstName, String secondName,
            String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
            String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getAllTeachers() {
        teacherView.sendOnConsole(service.getAllTeachers());
    }

    public void getAllStudent() {
        studentView.sendOnConsole(service.getAllStudent());
    }

    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id : studentIdList) {
            studentList.add((Student) service.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher, studentList);
    }

    public void printStudentGroup() {
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
}
