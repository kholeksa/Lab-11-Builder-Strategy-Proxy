package ua.edu.ucu.apps.task1;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class User {
    private int age;
    private String name;
    private double weight;
    private double height;
    private String gender;
    private String email;
    @Singular private List<String> tasks;
}
