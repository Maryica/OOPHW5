package View;

import java.util.List;

import Data.Student;
import Data.User;

public class StudentView {
    public void printOnConsole(Student student) {
        System.out.println(student.toString());
    }

    public void sendOnConsole(List<User> list) {
    }
}
