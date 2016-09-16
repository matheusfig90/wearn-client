package matheusfig.android.com.wearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

import matheusfig.android.com.wearn.components.GridViewAdapter;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int[] list = new int[]{
            R.mipmap.camiseta1,
            R.mipmap.camiseta2,
            R.mipmap.camiseta3,
            R.mipmap.camiseta4,
            R.mipmap.camiseta1,
            R.mipmap.camiseta2,
            R.mipmap.camiseta3,
            R.mipmap.camiseta4,
            R.mipmap.camiseta1,
            R.mipmap.camiseta2,
            R.mipmap.camiseta3,
            R.mipmap.camiseta4
        };

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridViewAdapter(this, list));
    }
}