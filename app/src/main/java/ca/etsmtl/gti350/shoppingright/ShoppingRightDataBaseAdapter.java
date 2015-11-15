package ca.etsmtl.gti350.shoppingright;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by taibikhachani on 2015-11-14.
 */
public class ShoppingRightDataBaseAdapter{
    public ShoppingRightHelper getHelper() {
        return helper;
    }

    public void setHelper(ShoppingRightHelper helper) {
        this.helper = helper;
    }

    ShoppingRightHelper helper ;
    public ShoppingRightDataBaseAdapter(Context context){

        helper = new ShoppingRightHelper(context);

    }

    public long insertDataCategorie(String name){

        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ShoppingRightHelper.NAMECATEGORIE,name);
        long id = db.insert(ShoppingRightHelper.TABLE_NAME, null, contentValues);
        return  id;

    }

    public String[] getAllCategories(){
        ArrayList<String> listCategories = new ArrayList<String>();
        SQLiteDatabase db = helper.getWritableDatabase();
        String[] columns = {ShoppingRightHelper.UIDCATEGORIE,ShoppingRightHelper.NAMECATEGORIE};
        Cursor cursors;
        cursors = db.query(ShoppingRightHelper.TABLE_NAME,columns,null,null,null,null,null);
        /*
        StringBuffer buffer = new StringBuffer();
        int cid = cursors.getInt(0);
        String name = ;
        buffer.append(cid + " " + name);
        */
        listCategories.add("45445");
        while(cursors.moveToNext()) listCategories.add(cursors.getString(1));

        String[] allcategories = listCategories.toArray(new String[listCategories.size()]);

        return allcategories;

    }


    static class ShoppingRightHelper extends SQLiteOpenHelper {

        private static final String DATABAE_NAME = "shoppingRigt";
        private static final String TABLE_NAME = "categorie";
        private static final int DATABAE_VERSION = 4;
        private static final String UIDCATEGORIE = "id_categorie";
        private static final String NAMECATEGORIE = "nom_categorie";
        private static final String CREATE_TABLE_CATEGORIE = "CREATE TABLE "+ TABLE_NAME + "(" + UIDCATEGORIE + " INTEGER PRIMARY KEY AUTOINCREMENT, "+NAMECATEGORIE+" VARCHAR(255));";
        private static final String DROP_TABLE_CATEGORIE = "DROP TABLE IF EXISTS " + TABLE_NAME ;
        private Context context;
        public ShoppingRightHelper(Context context){

            super(context,DATABAE_NAME,null,DATABAE_VERSION);
            this.context = context;
            Message.message(context,"constructor called");
        }







        @Override
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE_CATEGORIE);
                Message.message(context,"oncreate called");
            } catch (SQLException e) {

                Message.message(context,""+e);
            }
        }



        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {

                db.execSQL(DROP_TABLE_CATEGORIE);
                onCreate(db);
                Message.message(context,"onUpgrade called");
            } catch (SQLException e) {

                Message.message(context,""+e);
            }

        }




    }
}
