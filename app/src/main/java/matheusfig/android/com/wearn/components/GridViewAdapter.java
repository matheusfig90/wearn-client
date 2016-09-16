package matheusfig.android.com.wearn.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Adapter to grid view.
 *
 * Created by matheusfig on 15/09/16.
 */
public class GridViewAdapter extends BaseAdapter {

    // Attributes
    private Context context;
    private int[] items;

    public GridViewAdapter(Context context, int[] items) {
        this.context = context;
        this.items = items;
    }

    /**
     * Get data size
     *
     * @return int
     */
    @Override
    public int getCount() {
        return this.items.length;
    }

    /**
     * Get data item by index
     *
     * @param i
     * @return String
     */
    @Override
    public Integer getItem(int i) {
        return this.items[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(this.items[i]);
        imageView.setAdjustViewBounds(true);

        return imageView;
    }
}
