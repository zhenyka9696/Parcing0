import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ProductParser {
    public static void main(String[] args) throws IOException {
        //Person person = new Person("John", "Doe", "sdf");

//System.out.println
       // (product.toString());
        //Document document = (Document) Jsoup.connect("https://veteran-vov-vagsh.mil.ru/vov").get();
        Document document = (Document) Jsoup.connect("https://calorizator.ru/product/all").get();


//System.out.println
        Elements elements = document.select  ("table>tbody>tr");
//System.out.println(elements.size());
        for (Element element : elements) {
            String name =
                    element.select
                            ("td>a").text();
            double kcal = 0;
            try {
                kcal = Double.parseDouble(
                        element.select
                                (":eq(5)").text());
            }
            catch (Exception e){}
            System.out.println(name+" "+kcal);
            if(!name.isEmpty())
                System.out.println(name+" "+kcal);
        }


        //   System.out.println(element.val);
    }
}
