package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by taibikhachani on 2015-11-13.
 */
public class AjouterPrixCategorieActivity extends Activity{
    private Spinner spinner;
    public static ArrayList<String> listCategories = new ArrayList<String>();
    ShoppingRightDataBaseAdapter shoppingRightDataBaseAdapter;
    public  ArrayList<String> getListCategories() {
        return listCategories;
    }
    public String[] getArrayCategories() {
        return listCategories.toArray(new String[listCategories.size()]);
    }

    public void setListCategories(ArrayList<String> listCategories) {
        this.listCategories = listCategories;
    }

    public static void addItemListCategories(String item)
    {
        listCategories.add(item);

    }

    public void DeleteItemListCategories(String item)
    {
        listCategories.remove(item);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        shoppingRightDataBaseAdapter = new ShoppingRightDataBaseAdapter(this);

        setContentView(R.layout.activity_ajouter_prix_categorie);
        addItemOnSpinner2();

    }




    public void addItemOnSpinner2()
    {
       //String[] tab = getResources().getStringArray(R.array.categoriesList);
      //  String[] tab =

       spinner = (Spinner) findViewById(R.id.spinner2);
       // for(int i=0;i<tab.length;i++)
       // {
        //    if(listCategories.contains(tab[i]) == false) {
          //      listCategories.add(tab[i]);
         //   }

      //  }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,viewAllCategories());
        spinner.setAdapter(adapter);

    }
    public void ouvrirFenetre(View v){


        String button_text;
        button_text  = ((Button) v).getText().toString();

        Intent intent ;


        if (button_text.equals("Nouvelle Categorie"))

        {
            intent = new Intent(this, AjouterCategorieActivity.class);

            startActivity(intent);
        }



    }





    public  String[] viewAllCategories(){

        return shoppingRightDataBaseAdapter.getAllCategories();
       //Message.message(this,data);

    }












}
