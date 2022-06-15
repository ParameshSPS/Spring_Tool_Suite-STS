Jenkins:
--------

1. It is build automation tool.
2. It helps to automate software development related to building, tesing, generating test report, deployed.
3. It facilities to continuous integration (CI) and continuous delivery (CD).
4. Jenkins works with the help of plugins.
5. It is one of the most popular tool and it has large community support.

DevOps:
-------

1. DevOps is a set of practices it combines development and IT Operations.
2. Aim of DevOpsis to continuous delivery and software quality.
3. Jenkins one of important tool for DevOps.

	Steps to work with jenkins DashBoard:
	------------------------------------
		1. Create a new job (select type of job)
		2. Give a name to job
		3. Optionally we describe a job
		4. Configure the job
		5. Build the job
		
		Jenkins Pipeline:
		----------------
			1. A pipeline is a collection of job which are interlinked with another in a sequence
			2. Output of the pipeline can be viewed using stage view.
			3. In stage view it will be graphical representation of output of every stage.
				If the 
				
Example:
-------

pipeline {
    agent any

    stages {
        stage('check out') {
            steps {
               git 'https://github.com/ParameshSPS/Olx-Users-Microservice.git' 
            }
        }
        stage('compile') {
            steps {
                echo 'compiling'
            }
        }
        stage('running') {
            steps {
                echo 'running'
            }
        }
         stage('test report using jacoco') {
            steps {
                echo 'jacoco'
            }
        }
        stage('building docker image') {
            steps {
                echo 'building docker image'
            }
        }
    }
}