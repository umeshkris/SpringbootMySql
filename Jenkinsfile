pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/umeshkris/SpringbootMySql.git'
            }
        }
        stage('Build') {
            steps {
                mvn clean install
            }
        }
        /*stage('Test') {
            steps {
                sh './gradlew test' // Use 'mvn test' if using Maven
            }
        }*/
        stage('Package') {
            steps {
                 mvn package
            }
        }
       /* stage('Deploy') {
            steps {
                // Add your deployment steps here, e.g., using SCP, SSH, Docker, etc.
                sh 'scp build/libs/*.jar user@server:/path/to/deploy'
            }
        }
		*/
    }
    post {
        success {
            echo 'Build and Deploy succeeded!'
        }
        failure {
            echo 'Build or Deploy failed!'
        }
    }
}