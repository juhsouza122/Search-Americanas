package com.example.demo.webscrapings;

import com.example.demo.entities.Product;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchAmericanasWebScraping extends HelperWebScraping {
    private static final String urlAmericanas = "https://www.americanas.com.br";

    public SearchAmericanasWebScraping() {
    }

    public List<Product> getProductsByCategoryAndSort(String category, String sort) {
        this.webDriver.get(urlAmericanas + "/busca/" + category + "?sortBy=" + sort);

        List<WebElement> elements = this.webDriver.findElements(By.className("iRvjrG"));
        List<Product> result = new ArrayList<>();

        for (WebElement element: elements) {
            Product product = new Product();
            product.setCategory("web-cam");
            product.setDescription(this.getTextByClassName(element, "gUjFDF"));
            product.setPrice(this.getDoubleByClassName(element, "liXDNM"));
            product.setUrl(urlAmericanas + this.getDomAttributeByTagName(element, "a", "href"));
            product.setImg(this.getImgByClassName(element, "fSBXxM", "src"));

            this.addSortered(result, product);
        }

        return result;
    }

    private void addSortered(List<Product> list, Product item) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).getPrice() > item.getPrice()) {
                list.add(index, item);
                return;
            }
        }
        
        list.add(item);
    }
}
