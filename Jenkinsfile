#!/usr/bin/env groovy
//changes to master again
pipeline {
    agent {label "master"}
    options { buildDiscarder(logRotator(numToKeepStr: '10')) }
		environment {
			//SONAR_FLAG = '-Dsonar.host.url=http://3.115.184.75:9000 -Dsonar.analysis.mode= -Dsonar.report.export.path=sonar-report.json -Dsonar.cobertura.reportPath=target/site/cobertura/coverage.xml -Dsonar.tests=src/test -Dsonar.java.coveragePlugin=cobertura -Dsonar.jacoco.reportPath=target/jacoco.exec -Dsonar.binaries=target/classes '
			//NEXUS_FLAG = 'nexusPublisher nexusInstanceId: 'localNexus', nexusRepositoryId: 'releases', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: 'target/sampledemo-1.0.jar']], mavenCoordinate: [artifactId: 'jenkins-war', groupId: 'techm.cadt.com', packaging: 'jar', version: '2.00']]]'
			}
	
	    tools {
            maven "M3"
        }
	
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
                    sh "mvn clean install"
                    step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
				}
            }
        }
	    
	    
	    
        
		stage('Unit Test') {
            steps {
                script {
                    step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])                            
				}
            }
        }
		
}            
