package ca.etsmtl.gti350.shoppingright;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by taibikhachani on 2015-11-15.
 */
public class Message {

    public static void  message(Context context,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();

    }
}
