package com.umpay.adoptme.sample;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by rgz on 14-12-23.
 */
public class SampleDataUtils {

    public static List<Pet> getSamplePets(Context context) {
        List<Pet> pets;

        InputStream is = context.getResources().openRawResource(R.raw.sample_pets);
        Gson gson = new GsonBuilder().registerTypeAdapter(Pet.class, new Pet.PetDeserializer())
                .create();

        Type petsType = new TypeToken<List<Pet>>(){}.getType();
        pets = gson.fromJson(new InputStreamReader(is), petsType);

        return pets;
    }
}
