package butterknife.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.user)
    EditText username;
    @Bind(R.id.pass)
    EditText password;
    @OnClick(R.id.submit)
    public void submit() {
        Toast.makeText(this,"点击了",Toast.LENGTH_SHORT).show();
    }
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        ButterKnife.bind(this);
    }
}
