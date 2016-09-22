package matheusfig.android.com.wearn;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import matheusfig.android.com.wearn.classes.Wear;
import matheusfig.android.com.wearn.components.GridViewAdapter;

public class ResultActivity extends AppCompatActivity {

    // Attributes
    private static GridView gridView;

    // WebService URL
    private static String WEBSERVICE_URL = "http://192.168.0.17:5000/api/v1/search";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Show loading progress
        final ProgressDialog loading = ProgressDialog.show(this, "Buscando...", "Aguarde", false, false);

        // Search similar wears...
        StringRequest stringRequest = new StringRequest(Request.Method.POST, WEBSERVICE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            ArrayList<Wear> wears = new ArrayList<>();

                            JSONArray jsonArray = new JSONArray(response);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONArray json = jsonArray.getJSONArray(i);

                                wears.add(
                                    new Wear(json.get(2).toString(), json.get(1).toString())
                                );
                            }

                            gridView = (GridView) findViewById(R.id.gridView);
                            gridView.setAdapter(new GridViewAdapter(ResultActivity.this, wears));

                            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                @Override
                                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                    Wear selectedItem = (Wear) gridView.getItemAtPosition(i);

                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(selectedItem.getUrl()));
                                    startActivity(intent);
                                }
                            });
                        } catch (Exception error) {
                            Log.d("ERROR", error.getMessage());
                        } finally {
                            loading.dismiss();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("ERROR", error.getMessage());
                    }
                }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                // Converting Bitmap to String
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap bitmap = BitmapFactory.decodeFile(MainActivity.mImageFileName);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);

                String encodedImage = Base64.encodeToString(byteArrayOutputStream.toByteArray(), Base64.DEFAULT);

                // Creating parameters
                Map<String,String> params = new Hashtable<>();

                // Adding parameters
                params.put("file", encodedImage);

                // Returning parameters
                return params;
            }
        };

        // Creating a Request Queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        // Adding request to the queue
        requestQueue.add(stringRequest);
    }
}