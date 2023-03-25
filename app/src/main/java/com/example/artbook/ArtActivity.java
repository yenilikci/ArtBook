package com.example.artbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.artbook.databinding.ActivityArtBinding;

public class ArtActivity extends AppCompatActivity {

    private ActivityArtBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityArtBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void save(View view) {

    }
    public void selectImage(View view) {

    }

}