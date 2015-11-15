package ca.etsmtl.gti350.shoppingright;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.util.Log;
import android.widget.Button;
import java.lang.String;

import android.content.Intent;

public class MainActivity extends Activity {

    ShoppingRightDataBaseAdapter shoppingrighelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       shoppingrighelper = new ShoppingRightDataBaseAdapter(this);
       SQLiteDatabase sqLiteDatabase = shoppingrighelper.getHelper().getWritableDatabase();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void ouvrirFenetre(View v){

        Log.i("MainActivity","ouvir fentre dont le id est " + v.getId());
        String button_text;
        button_text  = ((Button) v).getText().toString();

        Intent intent ;

        if (button_text.equals("Listes des achats"))

        {
            intent = new Intent(this, ListesAchatsActivity.class);
            startActivity(intent);
        }

        if (button_text.equals("Consulter les prix"))

        {
            intent = new Intent(this, ConsulterPrixActivity.class);
            startActivity(intent);
        }



        if (button_text.equals("Ajouter un prix"))

        {
            intent = new Intent(this, AjouterPrixCategorieActivity.class);
            startActivity(intent);
        }



        if (button_text.equals("Importer"))

        {
            intent = new Intent(this, ImporterActivity.class);
            startActivity(intent);
        }



        if (button_text.equals("Exporter"))

        {
            intent = new Intent(this, ExporterActivity.class);
            startActivity(intent);
        }



        }






    }


