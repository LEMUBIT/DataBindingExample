package com.example.lemuel.databindingexample;

import java.util.ArrayList;
import java.util.List;

/*Data model class to be used for the data binding*/
public class User {
    String userName;
    String age;
    List<String> subjects;

    public User(String userName, String age,List<String> subjects ) {
        this.userName = userName;
        this.age = age;
        this.subjects=subjects;

    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getUserName() {
        return userName;
    }

    public String getAge() {
        return age;
    }


}
