package com.rgz.adoptme.adapter;

import android.content.Context;
import android.test.InstrumentationTestCase;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.rgz.adoptme.R;
import com.rgz.adoptme.sample.Pet;
import com.rgz.adoptme.sample.SampleDataUtils;

import java.util.List;

public class PetsAdapterTest extends InstrumentationTestCase {

    Context mContext;

    PetsAdapter mAdapter;

    List<Pet> mPets;

    public void setUp() throws Exception {
        super.setUp();

        mContext = getInstrumentation().getTargetContext();
        mPets = SampleDataUtils.getSamplePets(mContext);
        mAdapter = new PetsAdapter(mContext, mPets);

    }

    public void testGetCount_returnsCorrectCount() {
        int expected = mPets.size();
        int actual = mAdapter.getCount();

        assertEquals(expected, actual);
    }

    public void testGetView_showsPetName() throws Exception {
        String actualName = mPets.get(0).name;

        View v = mAdapter.getView(0, null, new FrameLayout(mContext));
        TextView name = (TextView) v.findViewById(R.id.name);

        assertEquals(actualName, name.getText());
    }

    public void testGetView_showsPetBreed() throws Exception {
        String actualBreed = mPets.get(0).breeds.get(0);

        View v = mAdapter.getView(0, null, new FrameLayout(mContext));
        TextView breed = (TextView) v.findViewById(R.id.breed);

        assertEquals(actualBreed, breed.getText());
    }
}