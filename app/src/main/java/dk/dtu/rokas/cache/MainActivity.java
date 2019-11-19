package dk.dtu.rokas.cache;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = new File(this.getCacheDir(), "mycache"); // .getFilesDir()
        try {
            FileWriter fw = new FileWriter(file);
            for(int i = 0; i < 2000000; i++){
                fw.append("bla ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
