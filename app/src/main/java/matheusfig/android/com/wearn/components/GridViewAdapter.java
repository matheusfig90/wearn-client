package matheusfig.android.com.wearn.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import matheusfig.android.com.wearn.classes.Item;

/**
 * Adapter to grid view.
 *
 * Created by matheusfig on 15/09/16.
 */
public class GridViewAdapter extends BaseAdapter {

    // Attributes
    private Context context;
    private ArrayList<Item> items;

    public GridViewAdapter(Context context, ArrayList<Item> items) {
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
        return this.items.size();
    }

    /**
     * Get data item by index
     *
     * @param i
     * @return Item
     */
    @Override
    public Item getItem(int i) {
        return this.items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);

        DownloadImage downloadImage = new DownloadImage(imageView);
        downloadImage.execute(this.items.get(i).getImageUrl());

        return imageView;
    }
}
