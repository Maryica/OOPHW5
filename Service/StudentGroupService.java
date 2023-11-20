package Service;

import Data.Teacher;
import Data.StudentGroup;
import Data.Student;
import java.util.List;

public class StudentGroupService {
    private final StudentGroup studentGroup = new StudentGroup();
    private Integer maxGroupId = 0;

    public void createStudentGroup(Teacher teacher, List<Student> studentList) {
        studentGroup.setGroupId(++maxGroupId);
        studentGroup.setTeacher(teacher);
        studentGroup.setStudentList(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}