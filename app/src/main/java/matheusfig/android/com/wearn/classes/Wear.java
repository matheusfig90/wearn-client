package matheusfig.android.com.wearn.classes;

/**
 * Wear class
 *
 * Created by matheusfig on 20/09/16.
 */
public class Wear
{
    // Attributes
    private String url;
    private String imageUrl;

    /**
     * Constructor
     *
     * @param url
     * @param imageUrl
     */
    public Wear(String url, String imageUrl) {
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
