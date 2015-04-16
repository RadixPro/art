package com.kampherbeek.art.rest;

import com.kampherbeek.art.services.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DateTimeController {
@Autowired
private DateTimeService dateTimeService;

    @RequestMapping(
            value = "/lease/party/{systemCode}/{systemId}",
            method = RequestMethod.GET,
            produces = "application/json; charset=UTF-8")
    @ResponseBody
    public double getJdnr(@PathVariable("dateTime") final String dateTime) {
        return dateTimeService.getJdNr(dateTime);
    }
}
