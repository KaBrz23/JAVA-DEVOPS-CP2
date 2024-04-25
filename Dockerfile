FROM tomcat:10

WORKDIR /usr/local/tomcat/webapps

COPY target/DimMoneyAppRM97768.war /usr/local/tomcat/webapps/DimMoneyAppRM97768.war

EXPOSE 8080

ENTRYPOINT ["catalina.sh", "run"]
