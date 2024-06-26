package id.ac.poilnema.multiactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    Button btnBukaSatu, btnBukaDua;

    @Override
    protected void onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu)
        btnBukaDua = (Button) findViewById(R.id.btnBukaDua)

        btn.BukaSatu.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View view)
            intent BukaHalamanSatu = new intent(getApplicationContext(), SecondActivity.class);
            startActivity(BukaHalamanSatu);
        }
        }
    }
}