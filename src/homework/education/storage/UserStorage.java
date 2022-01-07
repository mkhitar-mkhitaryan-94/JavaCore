package homework.education.storage;

import homework.education.exception.UserNotFoundException;
import homework.education.model.User;
import homework.education.util.FileUtil;


import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users = new HashMap<>();

    public void addUser(String email, User user) {
        users.put(email, user);
        serialize();
    }

    public void print() {
        for (User value : users.values()) {
            System.out.println(value);
        }
    }

    public User getByEmail(String email) throws UserNotFoundException {
        if (!users.containsKey(email)) {
            throw new UserNotFoundException("User by " + email + " does not exists");

        }
        return users.get(email);
    }

    private void serialize() {
        FileUtil.serializeUserMap(users);
    }

    public void initData() {
        Map<String, User> userMap = FileUtil.deSerializeUserMap();
        if (userMap != null) {
            users = userMap;
        }
    }

}




