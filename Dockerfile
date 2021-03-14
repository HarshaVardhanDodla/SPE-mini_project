FROM openjdk:8-alpine
COPY /target/calc-1.0-SNAPSHOT.jar /home/calc-1.0-SNAPSHOT.jar
CMD ["java","-cp","/home/calc-1.0-SNAPSHOT.jar","calc"]