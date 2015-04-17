package com.kampherbeek.art.rest;

import com.kampherbeek.art.datetime.DateTimeService;
import com.kampherbeek.art.datetime.model.DateTimeValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class DateTimeController {
@Autowired
private DateTimeService dateTimeService;

    @RequestMapping("/datetime/jdnr")
    public DateTimeValues getJdnr(@RequestParam("datetime") final String dateTime) {
        String jdNr = dateTimeService.getJdNr(dateTime);
        return new DateTimeValues(jdNr);
    }
}
