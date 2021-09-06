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
                    sh "cd demo && mvn clean install"
                    step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
				}
            }
        }
	    
	    
	    
        
		stage('Unit Test') {
            steps {
                script {
                    #step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])  
			sh "jenkins build success"
				}
            }
        }
    }	
}            
