package com.example.demo.services;

import com.example.demo.business.ServiceResult;
import com.example.demo.entities.Product;
import com.example.demo.webscrapings.SearchAmericanasWebScraping;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SearchAmericanasService {
    public ServiceResult<String> getWebCam() throws IOException {
        ServiceResult<String> result = new ServiceResult<String>();
        SearchAmericanasWebScraping webScraping = null;

        try {
            webScraping = new SearchAmericanasWebScraping();

            List<Product> products = webScraping.getProductsByCategoryAndSort("web-cam", "lowerPriceRelevance");
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            int index = 0;
    
            StringBuilder html = new StringBuilder();
            html.append("<html>\n");
            html.append("<body>\n");
            html.append("<h2>Lista dos três menores preços de web cam na americanas:</h2>\n");
            html.append("<br/>\n");

            while ((index < products.size()) && (index < 3)) {
                Product product = products.get(index);

                if (index > 0) {
                    html.append("<br/>\n");
                }

                html.append("<table border=" + "1" + " " + "width=" + "50%" + ">");
                html.append("<tr>");
                html.append("<td>" + "<img src=\"" + product.getImg() + "\">" + "</td>");
                html.append("<td>"+ (index + 1) + "º - <a href=\""  + product.getUrl() + "\">" + product.getDescription() + "</a></td>");
                html.append("<td>R$ " + decimalFormat.format(product.getPrice()) + "</td>");
                html.append("</tr>");
                html.append("</table");
    
                index++;
            }

            html.append("</body>\n");
            html.append("</html>\n");
                
            webScraping.quit();

            result.setSuccess(html.toString());
        } catch (Exception e) {
            result.setFail("Ocorreu um erro na busca", e);
        } finally {
            if (webScraping != null) {
                try {
                    webScraping.destroy();
                } catch (Exception ex) {}
            }
        }
        return result;
    }
}
