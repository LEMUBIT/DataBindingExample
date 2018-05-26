package com.example.lemuel.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.lemuel.databindingexample.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] subject = {"Math", "English", "French"};
        List<String> subjects;
        subjects = Arrays.asList(subject);
        /*
        *A binding class is generated for each layout file. By default, the name of the class is based on the name of the layout file,
        *converting it to Pascal case and adding the Binding suffix to it.
        *When there are different layout files for various configurations (for example, landscape or portrait), the variables are combined.
        *There must not be conflicting variable definitions between these layout files.
        */
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "24", subjects);
        binding.setUser(user);
        binding.setHandle(new HandleLog());

        
    }
}
