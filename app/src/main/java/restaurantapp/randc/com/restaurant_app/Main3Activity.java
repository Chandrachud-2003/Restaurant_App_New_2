package restaurantapp.randc.com.restaurant_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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