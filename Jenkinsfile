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
               sh 'mvn clean install'
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