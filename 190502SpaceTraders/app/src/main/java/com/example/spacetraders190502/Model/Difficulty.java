package com.example.spacetraders190502.Model;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public enum Difficulty {
    BEGINNER("Beginnner"),
    EASY("Easy"),
    NORMAL("Normal"),
    HARD("Hard"),
    IMPOSSIBLE("Impossible");

    private final String returnDifficulty;
    Difficulty (String returnDifficulty){
        this.returnDifficulty = returnDifficulty;
    }

    public String getReturnDifficulty() {
        return returnDifficulty;
    }
}
