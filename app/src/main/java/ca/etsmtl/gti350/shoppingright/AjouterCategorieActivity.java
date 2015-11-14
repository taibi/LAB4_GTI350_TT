package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


        String button_text;
        button_text  = ((Button) v).getText().toString();

        Intent intent ;


        if (button_text.equals("Ajouter la catégorie"))

        {

            intent = new Intent(this, AjouterPrixArticleActivity.class);
            startActivity(intent);
        }



    }








}
