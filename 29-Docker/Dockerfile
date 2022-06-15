# Following command is used to inherit this docker file from openjdk Dockerfile
FROM openjdk:8

# Following command tell devops team to expose port 8080
EXPOSE 8080

#  Following command is used to copy jar file from local machine to container
COPY ./target/test.jar test.jar

# Following command is used to run the jar file
CMD ["java","-jar","test.jar"]