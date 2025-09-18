pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1' // Must match the name configured in Jenkins Global Tools
        jdk 'JDK 17'        // Must match the name configured in Jenkins Global Tools
    }

    stages {
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

        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build failed. Please check the logs.'
        }
        always {
            echo '📦 Pipeline execution completed.'
        }
    }
}
