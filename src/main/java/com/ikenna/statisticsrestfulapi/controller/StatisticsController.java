package com.ikenna.statisticsrestfulapi.controller;

import com.ikenna.statisticsrestfulapi.model.Statistics;
import com.ikenna.statisticsrestfulapi.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @ResponseBody
    @GetMapping
    public Statistics getStatistics() {
        return statisticsService.getStatistics();
    }

}
