pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build with Maven') {
            steps {
                echo 'Hello World'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/huutai1010/test-spring.git']])
                sh 'mvn clean install'
            }

        }
        stage('Build Docker image') {
            steps {
                script {
                    sh 'docker build -t huutai1010/devops-automation-test .'
                }
            }
        }
        stage('Push image to Dockerhub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerpwd')]) {
                        sh 'docker login -u huutai1010 -p ${dockerpwd}'
                    }
                   sh 'docker push huutai1010/devops-automation-test'
                }
            }
        }
    }

}