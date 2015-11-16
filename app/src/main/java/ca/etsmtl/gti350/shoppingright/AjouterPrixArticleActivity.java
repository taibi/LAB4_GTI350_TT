package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by taibikhachani on 2015-11-13.
 */
public class AjouterPrixArticleActivity extends Activity {
    private Spinner spinner2;
    ShoppingRightDataBaseAdapter shoppingRightDataBaseAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ajouter_prix_article);
      // addItemOnSpinner2();
    }

    public void ouvrirFenetre(View v){


        String button_text;
        button_text  = ((Button) v).getText().toString();

        Intent intent ;


        if (button_text.equals("Ajouter article"))

        {
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


        if (button_text.equals("Nouveau magasin"))

        {
          intent = new Intent(this, AjouterMagasinActivity.class);
           // intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }



    }

    public void addItemOnSpinner2()
    {
        //String[] tab = getResources().getStringArray(R.array.categoriesList);
        //  String[] tab =

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        // for(int i=0;i<tab.length;i++)
        // {
        //    if(listCategories.contains(tab[i]) == false) {
        //      listCategories.add(tab[i]);
        //   }

        //  }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,viewAllMagasins());
        spinner2.setAdapter(adapter);

    }

    public  String[] viewAllMagasins(){

     return shoppingRightDataBaseAdapter2.getAllMagasins();
      //  Message.message(this,data);
       // String[] tab = new String[2] ;
        /*tab[0]="moi";
        tab[1]="toi";

        return tab;
         */
    }


}
