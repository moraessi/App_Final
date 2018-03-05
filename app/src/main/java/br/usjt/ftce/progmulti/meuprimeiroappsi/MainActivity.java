package br.usjt.ftce.progmulti.meuprimeiroappsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
//Gabriela Vieira 81610253
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //conecta layout
        setContentView(R.layout.activity_main);
    }
    //Gabriela Vieira 81610253
    public final static String EXTRA_MESSAGE =
            "br.usjt.ftce.progmulti.meuprimeiroappsi.MainActivity.MESSAGE";
    //Gabriela Vieira 81610253
    public void sendMessage(View view) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //conecta os campos
        EditText editText = (EditText)findViewById(R.id.edit_message);
        //pegar o que esta escrito no campo
        String message = editText.getText().toString();
       intent.putExtra(EXTRA_MESSAGE, message);
       startActivity(intent);


    }


}
