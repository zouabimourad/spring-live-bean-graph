# spring-live-bean-graph
Spring Live Bean Graph Visualiastion

The purpose of this application is to visualize Spring Live Bean Graph.

It connects to a target application via JMX

You will have to add the JVM Param `-Dspring.liveBeansView.mbeanDomain` to the target application.

The client jmx parameters are located in `application.properties`

Example : 

```
application.jmxServiceUrl=service:jmx:rmi://localhost/jndi/rmi://localhost:1099/jmxrmi
application.jmxObjectName=DefaultDomain:application=/parapheur
```

