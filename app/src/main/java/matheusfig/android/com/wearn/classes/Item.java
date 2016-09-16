package matheusfig.android.com.wearn.classes;

/**
 * Created by matheusfig on 15/09/16.
 */
public class Item {

    // Attributes
    private String url;
    private String imageUrl;

    /**
     * Constructor
     *
     * @param url
     * @param imageUrl
     */
    public Item(String url, String imageUrl) {
        this.url = url;
        this.imageUrl = imageUrl;
    }

    /**
     * Get URL
     *
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set URL
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get image URL
     *
     * @return String
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Set image URL
     *
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
