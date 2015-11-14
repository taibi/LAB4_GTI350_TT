package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by taibikhachani on 2015-11-13.
 */
public class AjouterCategorieActivity extends Activity

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ajouter_categorie);



    }


    public void ouvrirFenetre(View v){

        String categorie_text;
        categorie_text = ((EditText) findViewById(R.id.editText)).getText().toString();
        String button_text;
        button_text  = ((Button) v).getText().toString();

        Intent intent ;


        if (button_text.equals("Ajouter la catégorie"))

        {
            AjouterPrixCategorieActivity.addItemListCategories(categorie_text);
            intent = new Intent(this, AjouterPrixArticleActivity.class);
            startActivity(intent);
        }



    }








}
