FROM openjdk:18
LABEL authors="Benefrancis"
EXPOSE 8081
ADD target/*.jar pix-consumidor.jar
ENTRYPOINT ["java", "-jar","pix-consumidor.jar"]