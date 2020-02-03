// Ver.0.01
pipeline {
    agent any
    stages {
        stage ('UnixBench') {
            steps {
                sh '''
                    cd "/home/ozawa3/UnixBench"
                    pwd
                    //sudo ./Run -i 5
                '''
            } // steps {
        } // stage ('upgrade') {
    } // stages {
} // pipeline {
