package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by taibikhachani on 2015-11-15.
 */
public class AjouterMagasinActivity extends Activity {
    String magasin_text , button_text;
    ShoppingRightDataBaseAdapter shoppingRightDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ajouter_magasin);
    }



    public void ouvrirFentre(View v){

      Intent intent ;




        magasin_text = ((EditText) findViewById(R.id.editText5)).getText().toString();

        button_text  = ((Button) v).getText().toString();

        if (button_text.equals("Ajouter magasin"))

        {
            long id = shoppingRightDataBaseAdapter.insertDataMagasin(magasin_text);
            if (id < 0 ) Message.message(this, "Unsuccessful");
            intent = new Intent(this, AjouterPrixArticleActivity.class);
            startActivity(intent);

        }

    }



}
