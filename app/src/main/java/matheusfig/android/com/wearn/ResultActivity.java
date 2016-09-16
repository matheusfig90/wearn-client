package matheusfig.android.com.wearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

import matheusfig.android.com.wearn.classes.Item;
import matheusfig.android.com.wearn.components.GridViewAdapter;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-red-bull-teamwear-C02-0266-012?&lkey=a21", "http://static3.netshoes.net/Produtos/camiseta-red-bull-teamwear/12/C02-0266-012/C02-0266-012_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-adidas-sequentials-D13-0207-028?&lkey=a21", "http://static2.netshoes.net/Produtos/camiseta-adidas-sequentials/28/D13-0207-028/D13-0207-028_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-burn-ii-E07-0126-188?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-burn-ii/88/E07-0126-188/E07-0126-188_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-gonew-fun-basic-C62-1286-012?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-gonew-fun-basic/12/C62-1286-012/C62-1286-012_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-red-bull-teamwear-C02-0266-012?&lkey=a21", "http://static3.netshoes.net/Produtos/camiseta-red-bull-teamwear/12/C02-0266-012/C02-0266-012_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-adidas-sequentials-D13-0207-028?&lkey=a21", "http://static2.netshoes.net/Produtos/camiseta-adidas-sequentials/28/D13-0207-028/D13-0207-028_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-burn-ii-E07-0126-188?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-burn-ii/88/E07-0126-188/E07-0126-188_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-gonew-fun-basic-C62-1286-012?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-gonew-fun-basic/12/C62-1286-012/C62-1286-012_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-red-bull-teamwear-C02-0266-012?&lkey=a21", "http://static3.netshoes.net/Produtos/camiseta-red-bull-teamwear/12/C02-0266-012/C02-0266-012_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-adidas-sequentials-D13-0207-028?&lkey=a21", "http://static2.netshoes.net/Produtos/camiseta-adidas-sequentials/28/D13-0207-028/D13-0207-028_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-burn-ii-E07-0126-188?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-burn-ii/88/E07-0126-188/E07-0126-188_zoom1.jpg"));
        items.add(new Item("http://www.netshoes.com.br/produto/camiseta-gonew-fun-basic-C62-1286-012?&lkey=a21", "http://static5.netshoes.net/Produtos/camiseta-gonew-fun-basic/12/C62-1286-012/C62-1286-012_zoom1.jpg"));

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GridViewAdapter(this, items));
    }
}