package com.ikenna.statisticsrestfulapi.service;

import com.ikenna.statisticsrestfulapi.model.Statistics;
import com.ikenna.statisticsrestfulapi.model.Transaction;

public interface StatisticsService {

    void addTransaction(Transaction transaction);

    Statistics getStatistics();

}
