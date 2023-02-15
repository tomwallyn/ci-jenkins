pipeline {
    agent any

    stages {
        stage('Clone repository') {
            steps {
                git 'https://github.com/tomwallyn/ci-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Unit tests') {
            steps {
                sh './gradlew test'
            }
        }

        stage('SonarQube') {
            steps {
                script {
                    withSonarQubeEnv('SonarQube') {
                        sh './gradlew sonarqube'
                    }
                }
            }
        }

        stage('Package') {
            steps {
                sh './gradlew jar'
            }
        }

        stage('Publish to Nexus') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'admin', passwordVariable: 'admin', usernameVariable: 'admin')]) {
                    sh './gradlew publish -PNEXUS_USERNAME=$NEXUS_USERNAME -PNEXUS_PASSWORD=$NEXUS_PASSWORD'
                }
            }
        }
    }
}
