package com.typesafe.service;

import com.typesafe.LivebeangraphApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LivebeangraphApplication.class)
@WebAppConfiguration
public class BeansViewServiceTest {

    Logger LOG = LoggerFactory.getLogger(BeansViewServiceImpl.class);

    @Autowired
    BeansViewService beansViewService;


    @Test
    public void test() {

        try {
            beansViewService.getData();
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            Assert.fail();
        }

    }

}