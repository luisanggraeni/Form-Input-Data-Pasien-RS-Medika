package id.sch.smktelkom_mlg.tugas01.xiirpl2022.forminputdatapasienrsmedikasehat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Button bOk;
    TextView tvNama, tvJK, tvProv, tvKel;
    RadioButton rbLaki, rbPr;
    Spinner spProv, spKota;
    CheckBox cbdemam, cbflu, cbpusing;
    String[][] arKota = {{""}, {"Aceh Barat", "Aceh Barat Daya", "Acah Besar",
            "Aceh Jaya", "Aceh Selatan", "Aceh Tengah", "Banda Aceh",
            "Langsa", "Lhokseumawe", "Sabang", "Subulussalam"}, {"Badung", "Bangli",
            "Buleleng", "Gianyar", "Jembrana", "Tabanan", "Denpasar"}, {"Lebak", "Pandeglang", "Kabupaten Serang",
            "Kabupaten Tangerang", "Cilegon", "Kota Serang", "Kota Tangerang", "Kota Tangerang Selatan"},
            {"Seluma", "Bengkulu"}, {"Kabupaten Gorontalo", "Gorontalo Utara", "Pohuwato", "Kota Gorontalo"},
            {"Kepulauan Seribu", "Jakarta Barat", "Jakarta Pusat", "Jakarta Selatan", "Jakarta Timur", "Jakarta Utara"},
            {"Jambi"}, {"Kabupaten Bandung", "Bandung Barat", "Bekasi", "Bogor", "Ciamis", "Cianjur", "Cirebon", "Garut", "Indramayu",
            "Karawang", "Kuningan", "Majalengka", "Pangandaran", "Purwakarta", "Subang", "Sukabumi", "Sumedang", "Tasikmalaya", "Kota Bandung", "Kota Banjar",
            "Kota Bekasi", "Kota Bogor", "Kota Cimahi", "Kota Cirebon", "Kota Depok", "Kota Sukabumi", "Kota Tasikmalaya"}, {"Banjarnegara", "Banyumas",
            "Batang", "Blora", "Boyolali", "Brebes", "Cilacap", "Demak", "Grobogan", "Jepara", "KarangAnyar", "Kebumen", "Kendal", "Klaten", "Kudus", "Magelang",
            "Pati", "Pekalongan", "Pemalang", "Purbalingga", "Purworejo", "Rembang", "Semarang", "Sragen", "Sukoharjo", "Tegal", "Temanggung", "Wonogiri",
            "Wonosobo", "Kota Magelang", "Kota Pekalongan", "Salatiga", "Semarang", "Surakarta", "Kota Tegal"}, {"Bangkalan", "Banyuwangi", "Blitar",
            "Bojonegoro", "Bondowoso", "Gresik", "Jember", "Jombang", "Kediri", "Lamongan", "Lumjang", "Madiun", "Magetan", "Malang", "Mojokerto", "Nganjuk", "Ngawi", "Pacitan",
            "Pamekasan", "Pasuruan", "Ponorogo", "Probolinggo", "Sampang", "Siduarjo", "Situbondo", "Sumenep", "Trenggalek", "Tuban", "Tulungagung", "Kota Batu",
            "Kota Blitar", "Kota Madiun", "Kota Malang", "Kota Mojokerto", "Kota Pasuruan", "Kota Probolinggo", "Kota Surabaya"}, {"Sintang", "Pontianak", "Singkawang"},
            {"Barito Selatan", "Barito Timur", "Barito Utara", "Palangkaraya"}, {"Banjarbaru", "Banjarmasin"}, {"Kutai Kertanegara", "Mahakam Ulu",
            "Balikpapan", "Bontang", "Samarinda"}, {"Tarakan"}, {"Bangka", "Belitung"}, {"Kepulauan Anambas", "Lingga", "Natuna", "Batam", "Tanjung Pinang"},
            {"Lampung Barat", "Lampung Selatan", "Lampung Tengah", "Lampung Timur", "Lampung Utara", "Bandar Lampung", "Metro"}, {"Maluku Tengah", "Maluku Tenggara",
            "Maluku Barat Daya", "Maluku Tenggara Barat", "Ambon", "Kepulauan Aru",}, {"Halmahera Barat", "Halmahera Tengah", "Halmahera Timur", "Halmahera Selatan",
            "Halmahera Utara", "Kepulauan Sula", "Pulau Morotai", "Pulau Taliabu", "Ternate", "Tidore Kepulauan"}, {"Bima"}, {"Alor"}, {"Irian Jaya"}, {"Manokwari"},
            {"Pekanbaru"}, {"Mamuju"}, {"Palu"}, {"Makasar"}, {"Kendari"}, {"Manado"}, {"Padang"}, {"Palembang"}, {"Medan"}, {"Sleman", "Kota Yogyakarta"}};

    ArrayList<String> listKota = new ArrayList<>();
    ArrayAdapter<String> adapter;

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
        spProv = (Spinner) findViewById(R.id.spinnerAsal);
        spKota = (Spinner) findViewById(R.id.spinnerAsal1);
        tvProv = (TextView) findViewById(R.id.tvprov);
        cbdemam = (CheckBox) findViewById(R.id.checkBoxDemam);
        cbflu = (CheckBox) findViewById(R.id.checkBoxFlu);
        cbpusing = (CheckBox) findViewById(R.id.checkBoxPusing);
        tvKel = (TextView) findViewById(R.id.tvkel);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listKota);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spKota.setAdapter(adapter);
        spProv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                listKota.clear();
                listKota.addAll(Arrays.asList(arKota[pos]));
                adapter.notifyDataSetChanged();
                spKota.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doJK();
                doProcess();
                doAsal();
                doKel();
            }

            private void doProcess() {
                if (isValid()) {
                    String nama = etNama.getText().toString();
                    tvNama.setText("Nama anda : " + nama);
                }
            }
        });
    }

    private void doKel() {
        String hasil = "Keluhan anda :\n";
        int startlen = hasil.length();
        if (cbdemam.isChecked()) hasil += cbdemam.getText() + "\n";
        if (cbflu.isChecked()) hasil += cbflu.getText() + "\n";
        if (cbpusing.isChecked()) hasil += cbpusing.getText() + "\n";
        if (hasil.length() == startlen) hasil += "Tidak ada pada pilihan";
        tvKel.setText(hasil);
    }

    private void doAsal() {
        tvProv.setText("Asal daerah : provinsi " + spProv.getSelectedItem().toString() + " Kota " + spKota.getSelectedItem().toString());
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
