package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Data {
    private String userId;
    private int age;

    @Override
    public String toString() {
        return "Hello{" +
                "userId='" + userId + '\'' +
                ", age=" + age +
                '}';
    }
}
