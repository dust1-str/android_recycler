package com.example.recyclerpersonal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerpersonal.models.Gun;
import com.example.recyclerpersonal.models.Spirit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Spirit> espiritus = new ArrayList<>();
        espiritus.add(new Spirit("Demonio","Rojo", new Gun("Hacha", 50)));
        espiritus.add(new Spirit("Moroi","Azul", new Gun("Blade", 30)));
        espiritus.add(new Spirit("Mímico","Blanco", new Gun("Laser", 15)));

    }
}