package com.kampherbeek.art.positions.impl;

import com.kampherbeek.art.positions.BodyPositionHandler;
import com.kampherbeek.art.positions.model.Bodies;
import com.kampherbeek.art.positions.model.BodyPosition;
import com.kampherbeek.art.positions.model.CoordinateSystems;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BodyPositionServiceImplTest {

    @Mock
    private BodyPositionHandler handlerMock;
    @InjectMocks
    private BodyPositionServiceImpl service;
    private double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        Mockito.when(handlerMock.handleBodyPosition(12345.678, Bodies.JUPITER, CoordinateSystems.ECLIPTICAL)).thenReturn(createBodyPosition());
    }

    @Test
    public void testGetBodyPosition() throws Exception {
        String jdnr = "12345.678";
        String bodyText = "JUPITER";
        String coordinateSystemText = "ECLIPTICAL";
        BodyPosition actual = service.getBodyPosition(jdnr, bodyText, coordinateSystemText);
        BodyPosition expected = createBodyPosition();
        assertEquals(expected.getPosition(), actual.getPosition(), margin);
        assertEquals(expected.getDeviation(), actual.getDeviation(), margin);
        assertEquals(expected.getDistance(), actual.getDistance(), margin);
        assertEquals(expected.getPositionSpeed(), actual.getPositionSpeed(), margin);
        assertEquals(expected.getDeviationSpeed(), actual.getDeviationSpeed(), margin);
        assertEquals(expected.getDistanceSpeed(), actual.getDistanceSpeed(), margin);
    }


    private BodyPosition createBodyPosition() {
        BodyPosition position = new BodyPosition();
        position.setPosition(110.4);
        position.setDeviation(2.3);
        position.setDistance(2.2);
        position.setPositionSpeed(0.333);
        position.setDeviationSpeed(0.0222);
        position.setDistanceSpeed(0.00045);
        return position;
    }
}


