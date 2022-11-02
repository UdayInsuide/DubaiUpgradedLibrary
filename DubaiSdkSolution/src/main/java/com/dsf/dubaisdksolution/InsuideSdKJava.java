package com.dsf.dubaisdksolution;

import android.content.Context;
import android.content.Intent;

public class InsuideSdKJava {



    public void  authenticationInsuideIndoor(Context context, String apiKey,String apiSecretKey) {
       //new SDKActivity().setIAKEYS(context, apiKey, apiSecretKey);
    }

    public void authenticationOfMapbox(Context context,String token) {
        Intent intent = null;
        try {
            intent = new Intent(context, Class.forName("com.dsf.dubaisdktestsolution.SDKActivity"));
            intent.putExtra("token",token);
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
