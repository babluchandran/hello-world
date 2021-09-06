#!/usr/bin/env groovy
//changes to master again
pipeline {
    agent any
    options { buildDiscarder(logRotator(numToKeepStr: '10')) }
    stages {
        stage('Checkout SCM') {
            steps {
                script {
                    checkout scm                            
				}
            }
        }
	    
	stage('Test'){
		steps{
			sh " cd demo && mvn clean install"
		}
	    }
	
	stage('Docker Build Image') {
            steps {
                script {
                    app = docker.build("techmid/mong")                            
				}
            }
        }
	    
	stage('Docker Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com','dockerID') {
                    app.push("${env.BUILD_NUMBER}")                            
				    }
                }
            }
        }
	   
    }	
}            
