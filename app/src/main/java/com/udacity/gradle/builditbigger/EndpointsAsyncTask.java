package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;

import com.example.varun.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by varun on 27-09-2016.
 */
public class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
    private static MyApi myApiService = null;


    @Override
    protected final String doInBackground(Void... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("https://jokes-144720.appspot.com/_ah/api/");


            myApiService = builder.build();
        }



        try {
            return myApiService.getJoke().execute().getText();
        } catch (IOException e) {
            return e.getMessage();
        }
    }


}