pipeline {
    agent any
    
    stages {
        stage('Build & Test') {
            steps {
                dir('calculator-app') {
                    // We use 'sh' assuming your Jenkins can run shell commands. 
                    // If it complains later, we will change it to 'bat' for Windows!
                    sh 'mvn clean test'
                }
            }
        }
        
        stage('Package Artifact') {
            steps {
                dir('calculator-app') {
                    sh 'mvn package'
                }
            }
        }
    }
}
