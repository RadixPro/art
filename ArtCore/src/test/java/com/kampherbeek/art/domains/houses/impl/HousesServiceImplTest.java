package com.kampherbeek.art.domains.houses.impl;

import com.kampherbeek.art.domains.houses.HousesHandler;
import com.kampherbeek.art.domains.houses.model.HouseSystems;
import com.kampherbeek.art.domains.houses.model.Houses;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HousesServiceImplTest {

    @Mock
    private HousesHandler handlerMock;
    @InjectMocks
    private HousesServiceImpl service;
    private final double margin = 0.000000001;
    private final double longMc = 251.0;
    private final double longAsc = 314.5;

    @Before
    public void setUp() throws Exception {
        when(handlerMock.handleHouses(anyDouble(), anyDouble(), anyDouble(), anyObject())).thenReturn(createHouses());
    }

    @Test
    public void testGetHouses() throws Exception {
        String jdnr = "123456.88";
        String geoLat = "52.25";
        String geoLong = "100.0";
        String houseSystem = "KRUSINSKI";
        Houses houses = service.getHouses(jdnr, geoLat, geoLong, houseSystem);
        assertEquals(longMc, houses.getMc(), margin);
        assertEquals(longAsc, houses.getAscendant(), margin);
        assertEquals(HouseSystems.KRUSINSKI, houses.getHouseSystem());


    }

    private Houses createHouses() {
        Houses houses = new Houses();
        houses.setMc(longMc);
        houses.setAscendant(longAsc);
        houses.setHouseSystem(HouseSystems.KRUSINSKI);
        houses.setCusps(new LinkedHashMap<>());
        return houses;
    }

}

