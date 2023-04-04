FROM openjdk:11
VOLUME /tmp   
EXPOSE 8082
ADD $WORKSPACE/demo/target/*.jar app.jar
RUN bash -c 'touch /app.jar' 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"] 
