





1. How to describe the configuration of a application in web.xml.
     <listener>
           <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
     </listener>

     This is to load the super-spring-container configuration file

      <context-param>
             <param-name>contextConfigLocation</param-name>
             <param-value>classpath:definedApplicationContext.xml
                 classpath:applicationContext.xml
             </param-value>
      </context-param>

      This is to override the default applicationContext.xml of the super-spring-container

      The configuration in the springMvcServlet.xml is the sub-spring-container.
