pipeline {
    agent any
    
    // This tells Jenkins to use the Maven we just configured in the UI
    tools {
        maven 'Maven3'
    }
    
    stages {
        stage('Build & Test') {
            steps {
                dir('calculator-app') {
                    // Changed 'sh' to 'bat' for Windows!
                    bat 'mvn clean test'
                }
            }
        }
        
        stage('Package Artifact') {
            steps {
                dir('calculator-app') {
                    // Changed 'sh' to 'bat' for Windows!
                    bat 'mvn package'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                dir('calculator-app') {
                    // Jenkins will run Docker via Windows batch command
                    bat 'docker build -t devops-calculator:v1 .'
                }
            }
        }
    }
}