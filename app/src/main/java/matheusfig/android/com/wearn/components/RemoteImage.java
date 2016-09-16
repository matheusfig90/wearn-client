package matheusfig.android.com.wearn.components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

/**
 * Class to download and decode image from internet.
 *
 * Created by matheusfig on 15/09/16.
 */
public class RemoteImage extends AsyncTask<String, Void, Bitmap> {

    // Attribute
    private ImageView imageView;

    public RemoteImage(ImageView imageView) {
        this.imageView = imageView;
    }

    protected Bitmap doInBackground(String... urls) {
        String url = urls[0];
        Bitmap image = null;

        try {
            InputStream in = new URL(url).openStream();
            image = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.d("Error", e.getMessage());
        }

        return image;
    }

    protected void onPostExecute(Bitmap image) {
        this.imageView.setImageBitmap(image);
    }
}
