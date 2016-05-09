package com.typesafe.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.typesafe.model.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.management.MBeanServerConnection;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import java.util.List;

/**
 * Created by MZO on 09/05/2016.
 */
@Component
public class BeansViewServiceImpl implements BeansViewService {

    Logger logger = LoggerFactory.getLogger(BeansViewServiceImpl.class);

    @Autowired
    MBeanServerConnection mBeanServerConnection;

    @Value("${application.jmxObjectName}")
    String objectName = null;

    @Override
    public List<Context> getData() throws Exception {
        try {
            ObjectName objectName_ = new ObjectName(objectName);

            String snapshotAsJson = (String) mBeanServerConnection.getAttribute(objectName_, "SnapshotAsJson");

            ObjectMapper objectMapper = new ObjectMapper();

            List<Context> contexts = objectMapper.readValue(snapshotAsJson, objectMapper.getTypeFactory().constructCollectionType(List.class, Context.class));

            return contexts;

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }
}
