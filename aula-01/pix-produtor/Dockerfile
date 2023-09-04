FROM openjdk:18
LABEL authors="Benefrancis"
EXPOSE 8080
ADD target/*.jar pix-produtor.jar
ENTRYPOINT ["java", "-jar","pix-produtor.jar"]