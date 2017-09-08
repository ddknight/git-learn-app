package cc.ddknight.app.learngit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb_git_learn_intro = (Toolbar) findViewById(R.id.tb_git_learn_intro);
        setSupportActionBar(tb_git_learn_intro);
    }
}
