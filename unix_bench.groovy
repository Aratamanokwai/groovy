// Ver.0.01
pipeline {
    agent any
    stages {
        stage('UnixBench') {
            steps {
                dir("/home/ozawa3/UnixBench") {
                    sh "pwd"
                    sh'sudo ./Run'
                } // dir("/home/ozawa3/UnixBench") {
            } // steps {
        } // stage('upgrade') {
    } // stages {
} // pipeline {
