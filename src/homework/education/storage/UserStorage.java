package homework.education.storage;

import homework.education.exception.UserNotFoundException;
import homework.education.model.User;

import java.util.HashMap;

public class UserStorage {
    private HashMap<String, User> users = new HashMap<>();

    public void add(String email, User user) {
        users.put(email, user);
    }


    public User getByEmail(String email) throws UserNotFoundException {
        for (User value : users.values()) {
            if (value.getEmail().equals(email)) {
                return value;
            }
        }
        throw new UserNotFoundException("User with email" + email + "does not exists");
    }

    public void print() {
        for (String s : users.keySet()) {
            System.out.println(s);
        }
    }
}




