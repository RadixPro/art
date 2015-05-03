package com.kampherbeek.art.domains.positions;

import com.kampherbeek.art.ArtCoreApplication;
import com.kampherbeek.art.domains.positions.model.BodyPosition;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;

@SpringApplicationConfiguration(classes = {ArtCoreApplication.class})
@IntegrationTest
@WebAppConfiguration
@RunWith(ConcordionRunner.class)
public class BodyPositionsFixture {


    public String getPosition(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getPosition());
    }

    public String getDeviation(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getDeviation());
    }

    public String getDistance(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getDistance());
    }

    public String getPositionSpeed(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getPositionSpeed());
    }

    public String getDeviationSpeed(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getDeviationSpeed());
    }

    public String getDistanceSpeed(String jdnr, String planet, String coordinateSystem) {
        return toDecimalText(calcBodyPosition(jdnr, planet, coordinateSystem).getDistanceSpeed());
    }

    private BodyPosition calcBodyPosition(String jdnr, String planet, String coordinateSystem) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/positions/body?jdnr=" + jdnr.trim() + "&body=" + planet.trim() +
                "&coordinatesystem=" + coordinateSystem.trim();
        BodyPosition position = restTemplate.getForObject(url, BodyPosition.class);
        return position;
    }


    private String toDecimalText(double d) {

        DecimalFormat format = new DecimalFormat("#0.000000");
        return format.format(d);


    }


}
