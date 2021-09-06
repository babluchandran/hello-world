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
	   
		
		stage('Maven Build') {
            steps {
                script {
                    sh "cd demo && mvn clean install -DskipTests"
                    
				}
            }
        }
	    
	           
		stage('Last Build Status') {
            steps {
                script {
                      
			sh "jenkins build success"
				}
            }
        }
    }	
}            
