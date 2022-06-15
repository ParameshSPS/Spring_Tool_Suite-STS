Docker:
-------

1. Docker is a container management service.
2. The whole idea of docker is to be able to ship applications along with their environment into images.
   Which then can be run anywhere. (Even on cloud platforms e.g. AWS).
   
 3. Docker Image: In Docker image acts as set of instructions to build container. (Like template)
 
 	Image can be built OR download <From DockerHub>
 	Once you have image. you run it you get container.
 	Once you run container you get the O/P.
 	
 	How to create our own image?
 	1) We need to create a file called as - "Dockerfile"
 	
 
 4. Docker Container: It is running instance of a image.
 
 Example: To run java application
 
 JDK + Application + OS = Image
 
 Provided - Docker in  installed on that Machine.
 
 --------------------------------------
 
 Use MobaXterm Application: MobaXterm is the SSH Client we need this to connect to AWS Virtual machine. 
 
sudo yum install docker
docker --version
sudo service docker start
sudo chmod 777 /var/run/docker.sock
-----------------------------------
ls (Showing files)
sudo chmod 777 test.jar
ls
sudo chmod 777 Dockerfile
ls


 -----------------------------
 There are commands to manage images and container.
 Docker Commands:
 
 1. docker image ls : This command shows all the images available locally 
 2. docker pull nameofimage (Download the image from the docker hub)
 		e.g: docker pull hello-world
 3. docker container run name -> hello-world
 		e.g: docker container run hello-world
 4. docker image build -t <imageOfTheName> .  --> (This command is used to create our own image from Dockerfile)
 
 To create image push it to docker hub you must following syntax while using image name
 DockerhubId/imagename
 Example : docker image build -t parameshsps/param .
 
 # This command
 docker image push <name of the image>
 docker image push parameshsps/param 
 
 docker login
 username 
 password
 
 docker image push parameshsps/param
 docker container run parameshsps/param
 docker ps
 docker container run -p 8080:8080 parameshsps/param