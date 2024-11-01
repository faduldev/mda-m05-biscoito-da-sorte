package dev.fadul.m05biscoitodasorte;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }


    // Método para quebrar o biscoito mostrando a frase aleatória
    // e alterando a imagem
    public void quebrarBiscoito(View view) throws InterruptedException {

            String[] frases = {
                    "Nós somos o que pensamos que somos.",
                    "A maior de todas as torres começa no solo.",
                    "Não há que ser forte. Há que ser flexível.",
                    "A juventude não é uma época da vida, é um estado de espírito.",
                    "Não importa o tamanho da montanha, ela não pode tapar o sol.",
                    "Quem quer colher rosas deve suportar os espinhos.",
                    "Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.",
                    "Todas as coisas são difíceis antes de se tornarem fáceis.",
                    "Você é do tamanho do seu sonho.",
                    "Deixe de lado as preocupações e seja feliz."
            };
            // Calcula numero aleatório
            int numero = new Random().nextInt(frases.length);
            // Atualiza a frase
            TextView texto = findViewById(R.id.txtView);
            texto.setText(frases[numero]);
            // Atualiza a imagem
            ImageView imagem = findViewById(R.id.imgView);
            imagem.setImageResource(R.drawable.biscoitoquebrado2);
    }


    // Método para iniciar o biscoito mostrando a frase padrão e a imagem padrão
    public void iniciarBiscoito(View view){
        TextView texto = findViewById(R.id.txtView);
        //texto.setText(R.string.msg_inicio);
        texto.setText(R.string.msg_inicio);

        ImageView imagem = findViewById(R.id.imgView);
        imagem.setImageResource(R.drawable.biscoitointeiro2);
    }


}