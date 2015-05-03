package com.kampherbeek.art.domains.houses;

import com.kampherbeek.art.ArtCoreApplication;
import com.kampherbeek.art.domains.houses.model.Houses;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;
import java.util.Map;

@SpringApplicationConfiguration(classes = {ArtCoreApplication.class})
@IntegrationTest
@WebAppConfiguration
@RunWith(ConcordionRunner.class)
public class HousesFixture {

    public String getMc(String jdnr, String geoLat, String geoLong, String system) {
        Houses houses = calcHouses(jdnr, geoLat, geoLong, system);
        double mc = houses.getMc();
        return toDecimalText(mc);
    }

    public String getAscendant(String jdnr, String geoLat, String geoLong, String system) {
        double ascendant = calcHouses(jdnr, geoLat, geoLong, system).getAscendant();
        return toDecimalText(ascendant);
    }

    public String getCusp(String indexTxt, String jdnr, String geoLat, String geoLong, String system) {
        Map<Integer, Double> cusps = calcHouses(jdnr, geoLat, geoLong, system).getCusps();
        Integer index = Integer.parseInt(indexTxt);
        for (Integer key : cusps.keySet()) {
            if (key == index) {
                return toDecimalText(cusps.get(key));
            }
        }
        return null;
    }

    private Houses calcHouses(String jdnr, String geoLat, String geoLong, String system) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/houses?jdnr=" + jdnr.trim() + "&geoLat=" + geoLat.trim() + "&geoLong="
                + geoLong.trim() + "&system=" + system.trim();
        return restTemplate.getForObject(url, Houses.class);
    }

    private String toDecimalText(double d) {
        DecimalFormat format = new DecimalFormat("#0.000000");
        return format.format(d);
    }
}
