pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1' // Make sure this Maven version is configured in Jenkins Global Tools
        jdk 'JDK 17'        // Also configure JDK in Jenkins Global Tools
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'file:C://GIT_Java17_Workspace//test'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '**/target/*.war', fingerprint: true
            }
        }
    }
}
