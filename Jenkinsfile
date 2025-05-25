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
               bat 'mvn clean install'
            }
        }
        
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
       
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