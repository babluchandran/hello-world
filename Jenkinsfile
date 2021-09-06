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
			sh "mvn clean install"
		}
	    }
	   
    }	
}            
