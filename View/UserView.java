package View;

import Data.User;
import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}