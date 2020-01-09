package id.ac.poliban.mi.andri.listfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] friends = {"AHMAD IRFAN","AKHMAD INDRAWAN","ANDRE RAMADHANDY","ANDRI SUDARMAN","DIANA","GINA MELATI ADDINI",
            "IFFA NAFIATUNNISA","LIDYA LUSIANA","MELISA ARIANIE","MUHAMAD ADE SETIAWAN","PURNAMA","RADHIKA RAHMADAN","RAFI'I HIDAYAT NOR",
            "RENALDY KAMBAYU","SARWAN","THASYA ISMIANTI NOVIANDA","YUNITA RAHMAH","REZAL ALFANSYAH","AGUSTYA FAZRIANI",
            "RATU HANA YUNITA","M RIZKY MAULANA","RADIANSYAH","TAUFAN RYANDA UTAMA","MAGFIRAH MAULIDYA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null)
            setTitle("Aplikasi List Friend's");

        ListView list = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, friends);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Pilih " + friends[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
