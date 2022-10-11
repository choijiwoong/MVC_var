package study.spring.boot.service;

import org.springframework.stereotype.Service;
import study.spring.boot.domain.User;

@Service
public class LoginService {
    private static User user1=new User("최지웅", "22");
    private static User user2=new User("박나영", "23");

    public Boolean signUp(User user){
        if (user1.getAge()==user.getAge() && user1.getName().equals(user.getName()))
            return true;
        if (user2.getAge()==user.getAge() && user2.getName().equals(user.getName()))
            return true;

        return false;
    }
}
