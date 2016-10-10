package id.sch.smktelkom_mlg.tugas01.xiirpl2022.forminputdatapasienrsmedikasehat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Button bOk;
    TextView tvNama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.nama);
        bOk = (Button) findViewById(R.id.buttonOK);
        tvNama = (TextView) findViewById(R.id.tvnama);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doProcess();
            }

            private void doProcess() {
                if (isValid()) {
                    String nama = etNama.getText().toString();
                    tvNama.setText("Nama anda : " + nama);
                }
            }
        });
    }


    private boolean isValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();
        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etNama.setError(null);


        }
        return valid;
    }
}
