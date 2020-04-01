package restaurantapp.randc.com.restaurant_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidbuts.multispinnerfilter.MultiSpinner;
import com.androidbuts.multispinnerfilter.MultiSpinnerListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        final List<String> spinnerList = Arrays.asList(Constants.foodItemList);


    }
}