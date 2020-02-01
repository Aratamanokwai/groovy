// Ver.0.01
pipeline {
    agent any
    stages {
        stage('update') {
            steps {
                //sh 'pwd'
                sh'sudo apt-get -y update'
            }
        } // stage('update') {
        stage('upgrade') {
            steps {
                //sh 'pwd'
                sh'sudo apt-get -y upgrade'
            }
        } // stage('upgrade') {
    } // stages {
} // pipeline {
