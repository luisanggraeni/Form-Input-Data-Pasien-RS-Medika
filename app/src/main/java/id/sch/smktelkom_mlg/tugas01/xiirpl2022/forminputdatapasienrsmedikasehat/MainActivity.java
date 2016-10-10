package id.sch.smktelkom_mlg.tugas01.xiirpl2022.forminputdatapasienrsmedikasehat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Button bOk;
    TextView tvNama, tvJK;
    RadioButton rbLaki, rbPr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.nama);
        bOk = (Button) findViewById(R.id.buttonOK);
        tvNama = (TextView) findViewById(R.id.tvnama);
        rbLaki = (RadioButton) findViewById(R.id.laki2);
        rbPr = (RadioButton) findViewById(R.id.perempuan);
        tvJK = (TextView) findViewById(R.id.tvjk);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doJK();
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


    private void doJK() {
        String hasil = null;
        if (rbLaki.isChecked()) {
            hasil = rbLaki.getText().toString();
        } else if (rbPr.isChecked()) {
            hasil = rbPr.getText().toString();
        }

        if (hasil == null) {
            tvJK.setText("Belum memilih Jenis kelamin");
        } else {
            tvJK.setText("Jenis Kelamin Anda :" + hasil);
        }
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
